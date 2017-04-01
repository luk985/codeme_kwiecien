package poczta;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {
	
	String wpisanyAdresat;
	String wpisanyTematWiadomosci;
	String wpisanaTrescWiadomosci;
	
	@FXML
	protected Text informacja_login;
	
	@FXML
	protected TextField wyswietl_dane;
	
	@FXML
	protected TextField adresat_wprowadz;
	
	@FXML
	protected TextField temat_wprowadz;
	
	@FXML
	protected TextField tekst_wprowadz;
	
	
	protected void send(ActionEvent event) {
		wpisanyAdresat = adresat_wprowadz.getText();
		wpisanyTematWiadomosci = temat_wprowadz.getText();
		wpisanaTrescWiadomosci = tekst_wprowadz.getText();	
		SendingEmails2.send(wpisanyAdresat, wpisanyTematWiadomosci, wpisanaTrescWiadomosci);
	}
}
	
	
	/*
	public int liczba = 0;
	public double liczba2 = 0;
	public double liczba3 = 0;
	public double wynik = 0;
	public String tekst = "";
	public String tekst2 = "";
	public String tekst3 = "";
	public String wynik2 = "";
	public String historia2 = "";
	public int warunek1 = 0; //Liczba zmiennoprzecinkowa
	public String warunek2 = ""; //wybór funkcji matematycznej
	public int warunek3 = 0; //warunek wyniku
	public int warunek4 = 0; // podwójne wciœniêcie przycisku równania
	
	@FXML
	protected TextField danewejsciowe;
	
	@FXML
	protected TextField historia;
	
	@FXML
	protected void one(ActionEvent event){
		liczba = 1;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}

	@FXML
	protected void two(ActionEvent event){
		liczba=2;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void three(ActionEvent event){
		liczba=3;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}

	@FXML
	protected void four(ActionEvent event){
		liczba=4;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void five(ActionEvent event){
		liczba=5;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void six(ActionEvent event){
		liczba=6;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void seven(ActionEvent event){
		liczba=7;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void eight(ActionEvent event){
		liczba=8;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);;
		}
	}
	
	@FXML
	protected void nine(ActionEvent event){
		liczba=9;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void zero(ActionEvent event){
		liczba=0;
		if (warunek1 == 1) {
			tekst2 = tekst2 + Integer.toString(liczba);
			danewejsciowe.setText(tekst2);
		} else {
			tekst = tekst + Integer.toString(liczba);
			danewejsciowe.setText(tekst);
		}
	}
	
	@FXML
	protected void comma(ActionEvent event){
		warunek1 ++;
		if (warunek1 == 1){
			tekst2 = tekst + ".";
			danewejsciowe.setText(tekst2);
		}	
	}
	
	@FXML
	protected void addition(ActionEvent event){
		if (warunek3 < 1 ){
			tekst3 = danewejsciowe.getText();
			historia2 = historia2 + tekst3;
		} else score2();
		warunek2="+";
		historia2 = historia2 + warunek2;
		historia.setText(historia2);
		warunek3++;
		clear2();
		
	}
	
	@FXML
	protected void substraction(ActionEvent event){
		
	}
	
	@FXML
	protected void multiplication(ActionEvent event){
		
	}
	
	@FXML
	protected void division(ActionEvent event){
		
	}
	
	@FXML
	protected void squareroot(ActionEvent event){
		
	}
	
	@FXML
	protected void square(ActionEvent event){
		
	}
	
	protected void score2(){
		if (warunek2 == "+") {
			liczba2 = Double.parseDouble(tekst3);
			liczba3 = Double.parseDouble(danewejsciowe.getText());
			historia2 = historia2 + danewejsciowe.getText();
			if (warunek3 > 1){
				wynik = wynik + liczba3;
			} else {
				wynik = liczba2 + liczba3;
			}
			warunek2 = "";
		}
		wynik2 = Double.toString(wynik);
		danewejsciowe.setText(wynik2);
		historia.setText(historia2);	
	}
	
	@FXML
	protected void score(ActionEvent event){
		historia.setText(historia2 + " = " + wynik);
		warunek3 = 0;
		clear(event);
	}
	
	@FXML
	protected void clear(ActionEvent event){
		clear2();
	}
	
	protected void clear2(){
		tekst2 = "";
		tekst = "";
		warunek1 = 0;
		danewejsciowe.setText("0");

	}
	
	@FXML
	protected void back(ActionEvent event){
		
	}
		*/
