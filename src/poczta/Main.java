package poczta;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		//Sprawdzanie po³¹czenia z poczt¹
		String host = "pop3.wp.pl";
		String host2 = "smtp.wp.pl";
		String storeType = "pop3s";
		String user = "poczta_codeme";
		String password = "Javajava";
		String adressEmail = "poczta_codeme@wp.pl";
		
		int wyborPoczta;
		
		CheckingMails CheckingMails = new CheckingMails();
		SendingEmails SendingEmails = new SendingEmails();
		ConsoleClear ConsoleClear = new ConsoleClear();
		Login Login = new Login();
		
		Scanner klawiatura = new Scanner(System.in);
		
		Login.LoginIn(host, storeType, user, password);

		System.out.println("Jesteœ zalogowany do poczty");
		System.out.println("Adres poczty: poczta_codeme@wp.pl\n");
		System.out.println("Wybierz funkcje");
		System.out.println("1. Odczytanie wiadomoœci");
		System.out.println("2. Nadawanie wiadomoœci");
		wyborPoczta = Integer.parseInt(klawiatura.nextLine());
		
		switch (wyborPoczta) {
			case 1:
				System.out.println("Wybrano odczytywanie poczty");
				ConsoleClear.clear();
				CheckingMails.check(host, storeType, user, password);
				break;
			case 2:
				System.out.println("Wybrano nadawanie poczty");
				ConsoleClear.clear();
				SendingEmails.send(host2, user, password, adressEmail);
				break;	
			default: System.out.println("Wybierz ponownie opcje");
		}



	}
}
