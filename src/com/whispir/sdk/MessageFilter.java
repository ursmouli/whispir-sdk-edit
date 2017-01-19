/**
 * 
 */
package com.whispir.sdk;

public class MessageFilter {

	private int limit;
	private int offset;
	private String fromDate;
	private String toDate;
	private String fromTime;
	private String toTime;
	
	public MessageFilter() {
		
	}
	
	public MessageFilter(int limit, int offset, String fromDate, String toDate, String fromTime, String toTime) {
		this.limit = limit;
		this.offset = offset;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromTime = fromTime;
		this.toTime = toTime;
	}
	
	public boolean isValid() {
		return true;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	
}
