package poczta;

public class Main {

	public static void main (String[] args) {
		
		//Sprawdzanie po��czenia z poczt�
		String host = "pop3.wp.pl";
		String storeType = "pop3";
		String user = "poczta_codeme";
		String password = "Javajava";
		CheckingMails CheckingMails = new CheckingMails();
		CheckingMails.check(host, storeType, user, password);

	}
}
