package org.test;

public class Registration {

	String candidatename;
	String email;
	String seatname;
	String seatno;
	
	public Registration(String candidatename, String email, String seatname, String seatno) {
		this.candidatename=candidatename;
		this.email=email;
		this.seatname=seatname;
		this.seatno=seatno;
		
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSeatname() {
		return seatname;
	}
	public void setSeatname(String seatname) {
		this.seatname = seatname;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	
	
}
