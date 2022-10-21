package com.infinite.oyoProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
	
	@Id
	@Column(name="RoomID")
	   private String RoomID ;

	@Column(name="Type")
	   private String Type ;

	@Column(name="status")
	   private Status status;

	@Column(name="CostPerDay")
       private int CostPerDay;

	@Override
	public String toString() {
		return "Room [RoomID=" + RoomID + ", Type=" + Type + ", status=" + status + ", CostPerDay=" + CostPerDay + "]";
	}

	public Room(String roomID, String type, Status status, int costPerDay) {
		super();
		RoomID = roomID;
		Type = type;
		this.status = status;
		CostPerDay = costPerDay;
	}

	public String getRoomID() {
		return RoomID;
	}

	public void setRoomID(String roomID) {
		RoomID = roomID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getCostPerDay() {
		return CostPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		CostPerDay = costPerDay;
	}

	public Room() {
		
	}
	
	
	
}
