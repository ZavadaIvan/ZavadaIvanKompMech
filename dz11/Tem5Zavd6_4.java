package dz11;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Tem5Zavd6_4 {
		public static void main(String[] args) throws FileNotFoundException {
			File file = new File("C:\\Users\\user\\eclipse-workspace\\dz1\\src\\dz11\\outt.txt");
			PrintWriter pw = new PrintWriter(file);
			File fils = new File("C:\\Users\\user\\eclipse-workspace\\dz1\\src\\dz11\\out1.txt");
			PrintWriter ps = new PrintWriter(fils);
			int[] numm = new int[8]; 
			int counter = 0;
			int[] nummm = new int[8]; 
			int counterr = 0;
			Scanner scan = new Scanner(new File("C:\\Users\\user\\eclipse-workspace\\dz1\\src\\dz11\\neww.txt"));
			String line = scan.nextLine();
			String[] numbers = line.split(" ");
			for (String number : numbers) {
				if (Integer.parseInt(number)%2 == 0) {
					numm[counter++] = Integer.parseInt(number);
				}
				else {
					nummm[counterr++] = Integer.parseInt(number);
				}
			}
			pw.println(Arrays.toString(numm));
			ps.println(Arrays.toString(nummm));
			pw.close();
			ps.close();
		}



}
