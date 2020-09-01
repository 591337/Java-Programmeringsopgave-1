package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
		//Minstegrense for karakter
		int poengA = 90;
		int poengB = 80;
		
		int poengC = 60;
		int poengD = 50;
		int poengE = 40;
		
		for (int i = 1; i <= 10; i++) {
			
			int poeng = Integer.parseInt(showInputDialog("Poeng nr. " + i + ": "));
			while (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Poengsummen må være mellom 0 og 100.\nPrøv igjen!");
				poeng = Integer.parseInt(showInputDialog("Poeng: "));
			}
			String karakter = "F";
			
			if (poeng >= poengA)
				karakter = "A";
			else if (poeng >= poengB)
				karakter = "B";
			else if (poeng >= poengC)
				karakter = "C";
			else if (poeng >= poengD)
				karakter = "D";
			else if (poeng >= poengE)
				karakter = "E";
			
			System.out.println("Karakter nr. " + i + ": " + karakter);
		}
	}

}
