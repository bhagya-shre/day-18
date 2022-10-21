package com.infinite.oyoProject;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	
	@Id
	@Column(name="BookId ")
   	  private int BookId ;
	
	@Column(name="CustName")
	  private String CustName;
	
	@Column(name="City")
	  private String City;
	
	@Column(name="BookDate")
	  private Date BookDate ;
	
	@Column(name="ChkInDate")
	  private Date ChkInDate;
	
	@Column(name="ChkOutDate")
	  private Date ChkOutDate;
	  
	public Booking() {
		 
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [BookId=" + BookId + ", CustName=" + CustName + ", City=" + City + ", BookDate=" + BookDate
				+ ", ChkInDate=" + ChkInDate + ", ChkOutDate=" + ChkOutDate + "]";
	}
	public Booking(int bookId, String custName, String city, Date bookDate, Date chkInDate, Date chkOutDate) {
		 
		BookId = bookId;
		CustName = custName;
		City = city;
		BookDate = bookDate;
		ChkInDate = chkInDate;
		ChkOutDate = chkOutDate;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getBookDate() {
		return BookDate;
	}
	public void setBookDate(Date bookDate) {
		BookDate = bookDate;
	}
	public Date getChkInDate() {
		return ChkInDate;
	}
	public void setChkInDate(Date chkInDate) {
		ChkInDate = chkInDate;
	}
	public Date getChkOutDate() {
		return ChkOutDate;
	}
	public void setChkOutDate(Date chkOutDate) {
		ChkOutDate = chkOutDate;
	}
	   
}
