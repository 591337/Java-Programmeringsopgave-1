package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {

	public static void main(String[] args) {
		
		//Minstegrense for trinn
		int inntekt1 = 180800;
		int inntekt2 = 254500;
		int inntekt3 = 639750;
		int inntekt4 = 999550;
		
		//Sats på trinn
		double sats1 = 0.019;
		double sats2 = 0.042;
		double sats3 = 0.132;
		double sats4 = 0.162;
		
		int brutto = Integer.parseInt(showInputDialog("Bruttoinntekt: "));
		
		double skatt = 0;
		
		if (brutto > inntekt1) {
			if (brutto < inntekt2) {
				skatt += (brutto - inntekt1) * sats1;
			}
			else {
				skatt += (inntekt2 - inntekt1) * sats1;
				
				if (brutto < inntekt3) {
					skatt += (brutto - inntekt2) * sats2;
				}
				else {
					skatt += (inntekt3 - inntekt2) * sats2;
					
					if (brutto < inntekt4) {
						skatt += (brutto - inntekt3) * sats3;
					}
					else {
						skatt += (inntekt4 - inntekt3) * sats3;
						
						skatt += (brutto - inntekt4) * sats4;
					}
				}
			}
		}
	
	System.out.print("Trinnskatten er på : " + (int)(skatt + 0.5) + " kr");
	}
}
