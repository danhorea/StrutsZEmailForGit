package org.barosanu.email;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;

public class EmailAccount {
	//instance variables
	private String protocol;
	private String emailAdress;
	private String password;
    public Properties props;
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	//SECOND CONSTRUCTOR
	public EmailAccount(String protocol, String emailAdress, String password, Properties props, String mailStoreProtocol, String imaps) {
		this.protocol = protocol;
		this.emailAdress = emailAdress;
		this.password = password;
		this.props = props;
		this.props.setProperty(mailStoreProtocol, imaps);			
	}
	
	
	
	//METHOD TO RETURN THE INBOX FOLDER
	public Folder getFolder(String folderName){
		try {
			Session session = Session.getInstance(props);
            Store store = session.getStore();
            store.connect(protocol, emailAdress, password);
            Folder folder = null;
            
            //TODO de refacut cu liste, asa cum e frumos
            if(folderName.equals("Inbox") || folderName.equals("Junk E-mail")){
	            folder= store.getFolder(folderName);
	            folder.open(Folder.READ_ONLY);
            }else if(folderName.equals("Sent Mail")){
            	folder = store.getDefaultFolder().getFolder("[Gmail]").getFolder(folderName);
	            folder.open(Folder.READ_ONLY);
            }	
            
			return folder;			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

    

}
