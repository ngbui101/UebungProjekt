package Uebungen;
import javax.swing.JOptionPane;

public class Aufgabe182 {
	public static void main (String args[]){

		 //Deklaration des Arrays
		 Studierender[] studarray;

		 //Erzeugung des Arrays der Laenge 4
		 studarray = new Studierender[4];

		 //Anlegen der 5 Objekte im Array
		 for (int i = 0; i < studarray.length-2; i++)
		 studarray[i] = new Studierender();


		 //Objekte mit Werten belegen
		 for ( int i = 0; i < studarray.length-2;i++){
		 studarray[i].setName(JOptionPane.showInputDialog("Geben Sie den Namen des "+ (i+1) +". Studierenden ein."));
		 studarray[i].setMatrikelnummer(JOptionPane.showInputDialog("Geben Sie die Matrikelnummer des "+ (i+1) +". Studierenden ein"));
		 }

		 //Ausgabe der Daten
		 String ausgabe;
		 ausgabe = "Name: \tMatrikelnummer: \n";
		 for ( int i = 0; i < studarray.length-2;i++){
		 ausgabe += studarray[i].getName() + "\t" + studarray[i].getMatrikelnummer() + "\n";
		 }

		 System.out.println(ausgabe);
	 }
}
