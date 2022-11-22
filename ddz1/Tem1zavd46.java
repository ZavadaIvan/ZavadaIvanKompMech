package ddz1;
import java.util.Scanner;


public class Tem1zavd46 {
	
	
	public static int pow(int value, int powValue) {
		   if (powValue == 1) {
		       return value;
		   } else {
		       return value * pow(value, powValue - 1);
		   }
		} 
	public static void expon(int ol) {
		double e =  2.718281828;
		double rez = (Math.pow(e,ol) - Math.pow(e,-ol))/(Math.pow(e,ol) + Math.pow(e,-ol));
		System.out.println(rez);
	}
	public static void expono(int oll) {
		double e =  2.718281828;
		double rezul = 1/((Math.pow(e,oll) - Math.pow(e,-oll))/(Math.pow(e,oll) + Math.pow(e,-oll)));
		System.out.println(rezul);
	}

	public static void main(String[] args) {
	Scanner onj = new Scanner(System.in);
	int lop = onj.nextInt();
	expon(lop);
	expono(lop);
}
}