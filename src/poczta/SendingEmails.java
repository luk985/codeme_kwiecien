package poczta;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendingEmails {

	public static void send(String host, String user, String password, String AddressEmail) {
		System.out.println("��czenie z poczt� (nadawanie)...");
		try {
			Properties properties = new Properties();
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.ssl.enable","true");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.port", 465);
			properties.put("mail.smtp.socketFactory.port", 465);
			properties.put("mail.smtp.ssl.trust", "*");

			//Session session = Session.getInstance(properties);
			
			Session session = Session.getInstance(properties,
					  new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(user, password);
						}
					  });
		    session.setDebug(true);
			Message messages = new MimeMessage(session);
			messages.setFrom(new InternetAddress(AddressEmail));
			messages.setRecipients(Message.RecipientType.TO, InternetAddress.parse(AddressEmail));
			messages.setSubject("Test - wysy�anie");
			messages.setText("Sprawdzam - wys�ano");
			
			Transport.send(messages);
			System.out.println("Wys�ano wiadomo��");
			
		
	}
	  catch(MessagingException e) {
		throw new RuntimeException(e);
	  }
}
}
