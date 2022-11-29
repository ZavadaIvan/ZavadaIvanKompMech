package ddz5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Tem4Zavd3_5 {
	static class Interval {
	    private double lmezh;
	    private double rmezh;
	 
	    public Interval(double lmezh,double rlmezh) {
	        this.lmezh = lmezh;
	        this.rmezh = rlmezh;
	    }

	 
	    public Interval Summ(Interval z) {
	        return new Interval(Math. floor (lmezh+z.lmezh), Math.ceil(rmezh+z.rmezh));
	    }
	 
	    public Interval Rizn(Interval z) {
	        return new Interval(Math. floor (lmezh-z.lmezh), Math.ceil(rmezh-z.rmezh));
	    }
	    public double Dovzh() {
	        return (rmezh-lmezh);
	    }
	    
	    public String Vidp() {
	    	final StringBuilder stroka= new StringBuilder();
	    	stroka.append("[");
	    	stroka.append(lmezh);
	    	stroka.append(" ; ");
	    	stroka.append(rmezh);
	    	stroka.append("]");
	    	return stroka.toString();
	    }
	    public Interval Peretin(Interval z) {
	    	double ls=0;
	    	double rs=0;
	    	if (lmezh<=z.rmezh & rmezh>=z.lmezh) {
	    		ls=Math.max(lmezh, z.lmezh);
	    		rs=Math.min(rmezh, z.rmezh);
	    	}
	    	else {
	    		System.out.println("Не перетинаються");
	    	}
	        return new Interval(ls,rs);
	   }
	    public Interval Obiednannya(Interval z) {
	    	double ls=0;
	    	double rs=0;
	    	if (lmezh<=z.rmezh & rmezh>=z.lmezh) {
	    		ls=Math.min(lmezh, z.lmezh);
	    		rs=Math.max(rmezh, z.rmezh);
	    	}
	    	else {
	    		System.out.println("Не перетинаються");
	    	}
	        return new Interval(ls,rs);
	   }
	   public Interval Mnozh(Interval z) {
		   double[] array = {Math. floor(lmezh*z.lmezh),Math. floor(lmezh*z.rmezh),Math. floor(rmezh*z.lmezh),Math. floor(rmezh*z.rmezh)};
		   Arrays.sort(array);
		   
	        return new Interval(array[0], array[3]);
	    }
	   public Interval Dilennya(Interval z) {
		   double[] array = {Math. floor(lmezh/z.lmezh),Math. floor(lmezh/z.rmezh),Math. floor(rmezh/z.lmezh),Math. floor(rmezh/z.rmezh)};
		   Arrays.sort(array);
		   
	        return new Interval(array[0], array[3]);
	    }
	 
	    
}
	 public static void main(String[] args) {  
		 Interval check = new Interval(2.0,4.0);
		 Interval check1 = new Interval(3.0,5.0);
		 Interval  j=check.Summ(check1);
		 System.out.println(j.Vidp());
		 j=check.Rizn(check1);
		 System.out.println(j.Vidp());
		 j=check.Mnozh(check1);
		 System.out.println(j.Vidp());
		 j=check.Dilennya(check1);
		 System.out.println(j.Vidp());
		 j=check.Obiednannya(check1);
		 System.out.println(j.Vidp());
		 j=check.Peretin(check1);
		 System.out.println(j.Vidp());
		 Scanner in = new Scanner(System.in); 
		 int kilk = in.nextInt();
		 ArrayList<Double> list1 = new ArrayList<>();
		 ArrayList<Interval> list = new ArrayList<>();
		 for (int i = 0; i < kilk; i++) {
			 double left = in.nextDouble();
			 double right = in.nextDouble();
			 Interval check2 = new Interval(left, right);
			 list1.add(check2.Dovzh());
			 list.add(check2);
			 
		 }
		 Collections.sort(list1);
		 System.out.println(list1.get(kilk-1));
		 
	 }
}