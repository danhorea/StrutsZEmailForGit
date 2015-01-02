package org.barosanu.email;

import java.util.Date;

public class MessageBean {
	
	private String Subject;
	private String From;
	private String to;
	private Date SentDate;
	private int Size;
	public MessageBean(String subject, String from, String to, Date sentDate,
			int size) {
		super();
		Subject = subject;
		From = from;
		this.to = to;
		SentDate = sentDate;
		Size = size;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getSentDate() {
		return SentDate;
	}
	public void setSentDate(Date sentDate) {
		SentDate = sentDate;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
		
	
}
