package poczta;

import java.util.Scanner;

public class Main {
	
	public String host = "pop3.wp.pl";
	public String host2 = "smtp.wp.pl";
	public String storeType = "pop3s";
	public String user = "poczta_codeme";
	public String password = "Javajava";
	public String adressEmail = "poczta_codeme@wp.pl";

	public static void main (String[] args) {


		
	}
}

		
		/*
		Login Login = new Login();
		Scanner klawiatura = new Scanner(System.in);
		

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

	*/

