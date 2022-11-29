package ddz10;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Tem5Zavd3_8 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\dz1\\src\\ddz10\\out.txt");
		PrintWriter pw = new PrintWriter(file);
		int[] numm = new int[8]; 
		int counter = 0;
		Scanner scan = new Scanner(new File("C:\\Users\\user\\eclipse-workspace\\dz1\\src\\ddz10\\new.txt"));
		String line = scan.nextLine();
		String[] numbers = line.split(" ");
		for (String number : numbers) {
			if (Integer.parseInt(number)>0) {
				numm[counter++] = Integer.parseInt(number);
			}
		}
		pw.println(Arrays.toString(numm));
		pw.close();
	}

	
}
