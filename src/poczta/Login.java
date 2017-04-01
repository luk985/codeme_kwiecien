package poczta;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Store;

public class Login {
	
	public static void LoginIn(String host, String storeType, String user, String password) {	
		try {
			Properties properties = new Properties();
				properties.put("mail.pop3.host", host);  //
				properties.put("mail.pop3.port", 995);   //Port serwera poczty pop3
				properties.put("mail.pop3.starttls.enable", "true");
				Session emailSession = Session.getDefaultInstance(properties);

		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Uzyskano po³¹czenie z poczt¹");
		}
	}
}
