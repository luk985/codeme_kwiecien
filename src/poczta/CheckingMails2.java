package poczta;


import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class CheckingMails2 {
	
	public static void check(String host, String storeType, String user, String password) {	
		System.out.println("£¹czenie z poczt¹ (odczytywanie)...");
		Main main = new Main();
		String host = main.host;
		String user = main.user;
		String password = main.password;
		String fromAdress = main.adressEmail;
		
		try {
			Properties properties = new Properties();
				properties.put("mail.pop3.host", host);  //
				properties.put("mail.pop3.port", 995);   //Port serwera poczty pop3
				properties.put("mail.pop3.starttls.enable", "true");
				Session emailSession = Session.getDefaultInstance(properties);
			
			//Utworzenie obiektu poczty POP3 i po³¹czenie z serwerem pop
				Store store = emailSession.getStore(storeType);
				store.connect(host, user, password);
				
			//Utworzenie folderu poczty
				Folder emailFolder = store.getFolder("Inbox"); //Utworzenie folderu
				emailFolder.open(Folder.READ_ONLY);
				
			//Pobranie wiadomoœci z poczty i wydrukowanie
				Message[] messages = emailFolder.getMessages();
				System.out.println("Iloœæ wiadomoœci" + messages.length);
				
				for (int i=0; i<messages.length; i++) {
					Message message = messages[i];
					System.out.println("-----------------");
					System.out.println("Numer wiadomoœci: " + (i + 1));
					System.out.println("Temat wiadomoœci: " + message.getSubject());
					System.out.println("Nadawca: " + message.getFrom()[0]);
					System.out.println("Treœæ wiadomoœci: " + message.getContent());
				}
				
			//zamkn¹æ obiekty z magazynu
				emailFolder.close(false);
				store.close(); //zamkniêcie folderu		
				
				
		} catch(NoSuchProviderException e) {
			e.printStackTrace();
		}
		  catch(MessagingException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
			
		}
		

}
