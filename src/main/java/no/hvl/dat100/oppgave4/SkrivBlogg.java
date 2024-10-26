package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;



public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String filSti = mappe + "/" + filnavn;
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(filSti))){
			writer.print(samling.toString());
			return true;
		} catch (IOException e) {
			System.out.println("Feil Oppstod ved skriving til fil: " + e.getMessage());
			return false;
		}
		
		
		
	}
}
