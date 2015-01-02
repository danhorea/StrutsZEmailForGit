package org.barosanu.email;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;

public class EmailTest {

	public static void main(String[] args) throws MessagingException {
		EmailAccount barosanu  = new 
				EmailAccount("imap.gmail.com",
							"",
							"", 
							new Properties(),
							"mail.store.protocol",
							"imaps");
		
		Folder inbox = barosanu.getFolder("Inbox");
		Folder sent  = barosanu.getFolder("Sent Mail");
		
		Message[] inboxList = inbox.getMessages();
		Message[] sentList = sent.getMessages();

		try {
			System.out.println(inboxList[1].getFrom()[0]);
			System.out.println(sentList[1].getFrom()[0]);
			System.out.println(inbox.getMessage(1).getSubject());
			System.out.println(sent.getMessage(1).getSubject());
		} catch (Exception e) {
			System.out.println("inbox error");
			e.printStackTrace();
		}
	}
}
