package ddz3;

import java.util.Scanner;

public class Tem3Zavd1_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		String rand="";
		for(int i = 1; i <=m+1; i++) {
			String k = in.nextLine();
			if (i==1) {
				rand = k;
			}
			else {
				rand = (Math.random()<((100-((double)(100/(i-1))))/100))?rand:k;
			}
		}
		System.out.println(rand);
	}
}
