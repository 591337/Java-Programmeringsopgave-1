package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("n!"));
		
		double svar = 1;
		
		String tekst = "";
		
		if (n > 0) {
			for (int i = 1; i<= n; i++) {
				svar *= i;
				if (svar == (int)svar) {
					tekst = tekst + i + "! = " + (int)svar + "\n";
				} else {
					tekst = tekst + i + "! = " + svar + "\n";
				}
			}
			showMessageDialog(null, tekst);
		} else {
			showMessageDialog(null, "n kan ikke være mindre enn 1");
		}

	}

}
