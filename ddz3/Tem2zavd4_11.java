package ddz3;

import java.util.Scanner;

public class Tem2zavd4_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int per = 0;
		for(int i = m; i <= n; i++) {
			String b = String.valueOf(i);
			for(int j = 1; j <= b.length(); j++) {
			    int k=(i % (int)Math.pow(10, j)) /( (int)Math.pow(10, j-1));
			    per=per+(int)Math.pow(k, b.length());
			    
		}
		if (per == i) {
			System.out.println(i);
		}
		per = 0;
	}

}
}
