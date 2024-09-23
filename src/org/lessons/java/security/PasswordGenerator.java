package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {



	/* l programma deve fare quanto segue:

	salvare in opportune variabili
	- nome,
	- cognome,
	- colore preferito
	- data di nascita di un utente (suddivisa in giorno,mese e anno in numero)

	generare (e stampare a video) una password  concatenando
	- nome,
	- cognome,
	- colore preferito
	- somma di giorno, mese e anno di nascita, separate dal carattere 

	Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994,
	il cui colore preferito è il magenta
	La sua password sarà Pinco-Pallo-magenta-2011*/

		
		public static void main(String[] args) {
			
			
			String nome;
			String cognome;
			String colore;
			int giorno;
			int mese;
			int anno;
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Genera la tua password.");
			System.out.println("Inserisci i tuoi dati per generare la tua password.");

			System.out.println("Inserisci il tuo nome.");
			nome = scan.next();
			System.out.println("Inserisci il tuo cognome.");
			cognome = scan.next();
			System.out.println("Inserisci il tuo colore preferito.");
			colore = scan.next();

			System.out.println("Inserisci il tuo giorno di nascita:");
			giorno = scan.nextInt();
			System.out.println("Inserisci il tuo mese di nascita:");
			mese = scan.nextInt();
			System.out.println("Inserisci il tuo anno di nascita:");
			anno = scan.nextInt();
			
			System.out.println("Calcolando la tua password..");
			
			int somma = giorno + mese + anno;
			String password = nome + "-" + cognome + "-" + colore + "-" + somma;
			System.out.println(password);
			
			
		}
}
