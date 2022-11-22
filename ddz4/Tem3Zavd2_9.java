package ddz4;
import java.util.Scanner;


public class Tem3Zavd2_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int re=0;
		int lok=0;
		if (m==0) {
			int n = in.nextInt();
			int[][] array = new int[n][n];
			for(int i = 1; i <n+1; i++) {
				for(int j = 1; j <n+1; j++) {
					int per = in.nextInt();
					array[i-1][j-1]= per;
					lok=lok+1;
					re=re+per;
					
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print((double)array[i][j]+((double)re/(double)lok) + "\t");
				}
				System.out.println();
			}
		}
		else if (m==1) {
			int n = (int)(Math.random()*20);
			int[][] array = new int[n][n];
			for(int i = 1; i <n+1; i++) {
				for(int j = 1; j <n+1; j++) {
					int per =(int)(Math.random()*100-50);
					array[i-1][j-1]= per;
					lok=lok+1;
					re=re+per;
					
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print((double)array[i][j]+((double)re/(double)lok) + "\t");
				}
				System.out.println();
			}
		}

	}
	
}
