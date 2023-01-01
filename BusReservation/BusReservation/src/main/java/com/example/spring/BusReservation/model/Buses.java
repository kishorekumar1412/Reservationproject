package com.example.spring.BusReservation.model;

public class Buses {
	private int busno;
	private int totalseats;
	private boolean seaterorsleeper;
	public Buses() {
		super();
	}
	public Buses(int busno, int totalseats, boolean seaterorsleeper) {
		super();
		this.busno = busno;
		this.totalseats = totalseats;
		this.seaterorsleeper = seaterorsleeper;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public boolean isSeaterorsleeper() {
		return seaterorsleeper;
	}
	public void setSeaterorsleeper(boolean seaterorsleeper) {
		this.seaterorsleeper = seaterorsleeper;
	}
	
}
