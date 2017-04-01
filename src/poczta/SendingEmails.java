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
		System.out.println("£¹czenie z poczt¹ (nadawanie)...");
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
			messages.setSubject("Test - wysy³anie");
			messages.setText("Sprawdzam - wys³ano");
			
			Transport.send(messages);
			System.out.println("Wys³ano wiadomoœæ");
			
		
	}
	  catch(MessagingException e) {
		throw new RuntimeException(e);
	  }
}
}
