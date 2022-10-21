package com.infinite.oyoProject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



public class oyoDAO {
	SessionFactory sessionFactory;
	
	public String generatedRoomId(){
		sessionFactory=SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Room.class);
		List<Room> lst = cr.list();
		session.close();
		String id= roomList.get(roomList.size()-1).getRoomId();
		int id1=Integer.parseInt(id.substring(1));
		id1++;
		String id2=String.format("R%3d", id1);
		return id2;
	}
	
	public String addRoom(Room room){
		room.setRoomID("R001");
		sessionFactory=SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.save(room);
		tran.commit();
		session.close();
		return "Room Added Successfully";
	}
	
	public List<Room>searchRooms(String searchtype,String searchvalue){
		sessionFactory=SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Room.class);
		if(searchtype.equals("id")){
			int  id=Integer.parseInt(searchvalue);
			cr.add(Restrictions.eqOrIsNull("id",id));
			
		}
		if(searchtype.equalsIgnoreCase("type")){
			cr.add(Restrictions.eqOrIsNull("type",searchvalue));
		}
		if(searchtype.equalsIgnoreCase("status")){
			cr.add(Restrictions.eq("status", searchvalue));
		}
		if(searchtype.equalsIgnoreCase("costperday")){
			cr.add(Restrictions.eq("costperday", searchvalue));
		}
		List<Room> lst = cr.list();
		return lst;
	}
}
