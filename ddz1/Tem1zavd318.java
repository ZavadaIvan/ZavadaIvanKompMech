package ddz1;
import java.util.Scanner;

public class Tem1zavd318 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int k = 2*n;
		int seq = m*m;
		String pop = " ";
		String popp = " ";
		while(n>0) {
			pop=pop+" ";
			n=n-1;
		}
		while(k>0) {
			popp=popp+" ";
			k=k-1;
		}
		System.out.println(pop + m);
		System.out.println(popp + seq);
	}

}
