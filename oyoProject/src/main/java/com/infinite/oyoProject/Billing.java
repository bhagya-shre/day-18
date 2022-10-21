package com.infinite.oyoProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing")
public class Billing {
	@Id
	@Column(name="BookID")
	private int BookID ;
	
	@Column(name="RoomID")
	  private int RoomID ;
	
	@Column(name="NoOfDays")
	  private int  NoOfDays ;
	
	@Column(name="BillAmt")
	  private int  BillAmt ;

	@Override
	public String toString() {
		return "Billing [BookID=" + BookID + ", RoomID=" + RoomID + ", NoOfDays=" + NoOfDays + ", BillAmt=" + BillAmt
				+ "]";
	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public int getNoOfDays() {
		return NoOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}

	public int getBillAmt() {
		return BillAmt;
	}

	public void setBillAmt(int billAmt) {
		BillAmt = billAmt;
	}

	public Billing(int bookID, int roomID, int noOfDays, int billAmt) {
		super();
		BookID = bookID;
		RoomID = roomID;
		NoOfDays = noOfDays;
		BillAmt = billAmt;
	}

	public Billing() {
		
	}
	
	
	  
}
