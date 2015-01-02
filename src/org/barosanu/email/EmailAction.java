package org.barosanu.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;

import com.opensymphony.xwork2.ActionSupport;

public class EmailAction extends ActionSupport{	
	
	EmailAccount barosanu  = new 
			EmailAccount("imap.gmail.com",
						"",//GMAIL ADDRESS HERE
						"", //PASSWORD HERE
						new Properties(),
						"mail.store.protocol",
						"imaps");

	private static final long serialVersionUID = 1L;	
	private List<MessageBean> inboxList = new ArrayList<MessageBean>();
	
	public String fetchInboxList() throws MessagingException{
		Message[] inboxArray = barosanu.getFolder("Inbox").getMessages();
		
		for(int i = inboxArray.length-1; i>=0; i--){
			Message curentMessage = inboxArray[i];
			inboxList.add(new MessageBean(curentMessage.getSubject(), 
										curentMessage.getFrom()[0].toString(), 
										curentMessage.getRecipients(Message.RecipientType.TO)[0].toString(), 
										curentMessage.getSentDate(),
										curentMessage.getSize()));
		}		
		return SUCCESS;
	}

	public List<MessageBean> getInboxList() {
		return inboxList;
	}

	public void setInboxList(List<MessageBean> inboxList) {
		this.inboxList = inboxList;
	}
	
}
