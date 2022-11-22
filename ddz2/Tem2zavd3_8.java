package ddz2;
import java.util.Scanner;
import java.util.*;


public class Tem2zavd3_8 {
	 public static<T> List<T> reverseList(List<T> list)
	    {
	        List<T> reverse = new ArrayList<>(list);
	        Collections.reverse(reverse);
	        return reverse;
	    }
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		String b = String.valueOf(m);
		int j;
		if (m<-999999999) {
			System.out.println("eror");
		}
		else if (m>999999999) {
			System.out.println("eror");
		}
		else {
			List<String> list = new ArrayList<String>();
			for(int i = 1; i <= b.length(); i++) {
			     j = m % (int)Math.pow(10, i);
			     j=j / (int)Math.pow(10, i-1);
			     if (i==9) {
			    	 if (j==1) {
			    		 list.add("сто");
			    	 }
			    	 
			    	 else if (j==2) {
			    		 list.add("двісті");
		    		 }
			    	 else if (j==3){
			    		 list.add("триста");
			    	 }
			    	 else if (j==4){
			    		 list.add("чотириста");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ятьсот");
			    	 }
			    	 else if (j==6){
			    		 list.add("шістьсот");
			    	 }
			    	 else if (j==7){
			    		 list.add("сімсот");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісімсот");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'ятьсот");
			    	 }
			     }
			     if (i==8) {
			    	 if (j == 1) {
			    		 j = m % (int)Math.pow(10, 8);
			    		 j=j / (int)Math.pow(10, 6);
			    		 list.add("мільйонів");
			    		 if (j==10) {
			    			 list.add("десять");
			    		 }
			    		 else if (j==11) {
			    			 list.add("одинадцять");
			    		 }
			    		 else if (j==12) {
			    			 list.add("дванадцять");
			    		 }
			    		 else if (j==13) {
			    			 list.add("тринадцять");
			    		 }
			    		 else if (j==14) {
			    			 list.add("чотирнадцять");
			    		 }
			    		 else if (j==15) {
			    			 list.add("п'ятнадцять");
			    		 }
			    		 else if (j==16) {
			    			 list.add("шістадцять");
			    		 }
			    		 else if (j==17) {
			    			 list.add("сімнадцять");
			    		 }
			    		 else if (j==18) {
			    			 list.add("вісімнадцять");
			    		 }
			    		 else if (j==19) {
			    			 list.add("дев'ятнадцять");
			    		 }
			    	 }
			    	 else if (j==2) {
			    		 list.add("двадцять");
		    		 }
			    	 else if (j==3){
			    		 list.add("тридцять");
			    	 }
			    	 else if (j==4){
			    		 list.add("сорок");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ятдесят");
			    	 }
			    	 else if (j==6){
			    		 list.add("шістьдесят");
			    	 }
			    	 else if (j==7){
			    		 list.add("сімдесят");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісімдесят");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'яносто");
			    	 }
			     }
			     if (i==7 & (m % (int)Math.pow(10, i+1))/ ((int)Math.pow(10, i)) != 1 ) {
			    	 if (j==1) {
			    		 list.add("мільйон");
			    		 list.add("один");
			    	 }
			    	 
			    	 else if (j==2) {
			    		 list.add("мільйони");
			    		 list.add("два");
		    		 }
			    	 else if (j==3){
			    		 list.add("мільйони");
			    		 list.add("три");
			    	 }
			    	 else if (j==4){
			    		 list.add("мільйони");
			    		 list.add("чотири");
			    	 }
			    	 else if (j==5){
			    		 list.add("мільйонів");
			    		 list.add("п'ять");
			    	 }
			    	 else if (j==6){
			    		 list.add("мільйонів");
			    		 list.add("шість");
			    	 }
			    	 else if (j==7){
			    		 list.add("мільйонів");
			    		 list.add("сім");
			    	 }
			    	 else if (j==8){
			    		 list.add("мільйонів");
			    		 list.add("вісім");
			    	 }
			    	 else if (j==9){
			    		 list.add("мільйонів");
			    		 list.add("дев'ять");
			    	 }
			     }
			     if (i==6) {
			    	 if (j==1) {
			    		 list.add("сто");
			    	 }
			    	 
			    	 else if (j==2) {
			    		 list.add("двісті");
		    		 }
			    	 else if (j==3){
			    		 list.add("триста");
			    	 }
			    	 else if (j==4){
			    		 list.add("чотириста");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ятьсот");
			    	 }
			    	 else if (j==6){
			    		 list.add("шістьсот");
			    	 }
			    	 else if (j==7){
			    		 list.add("сімсот");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісімсот");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'ятьсот");
			    	 }
			     }
			     if (i==5) {
			    	 if (j == 1) {
			    		 j = m % (int)Math.pow(10, 5);
			    		 j=j / (int)Math.pow(10, 3);
			    		 list.add("тисяч");
			    		 if (j==10) {
			    			 list.add("десять");
			    		 }
			    		 else if (j==11) {
			    			 list.add("одинадцять");
			    		 }
			    		 else if (j==12) {
			    			 list.add("дванадцять");
			    		 }
			    		 else if (j==13) {
			    			 list.add("тринадцять");
			    		 }
			    		 else if (j==14) {
			    			 list.add("чотирнадцять");
			    		 }
			    		 else if (j==15) {
			    			 list.add("п'ятнадцять");
			    		 }
			    		 else if (j==16) {
			    			 list.add("шістадцять");
			    		 }
			    		 else if (j==17) {
			    			 list.add("сімнадцять");
			    		 }
			    		 else if (j==18) {
			    			 list.add("вісімнадцять");
			    		 }
			    		 else if (j==19) {
			    			 list.add("дев'ятнадцять");
			    		 }
			    	 }
			    	 else if (j==2) {
			    		 list.add("двадцять");
		    		 }
			    	 else if (j==3){
			    		 list.add("тридцять");
			    	 }
			    	 else if (j==4){
			    		 list.add("сорок");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ятдесят");
			    	 }
			    	 else if (j==6){
			    		 list.add("шістьдесят");
			    	 }
			    	 else if (j==7){
			    		 list.add("сімдесят");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісімдесят");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'яносто");
			    	 }
			     }
			     if (i==4 & (m % (int)Math.pow(10, i+1))/ ((int)Math.pow(10, i)) != 1 ) {
			    	 list.add("тисяч");
			    	 if (j==1) {
			    		 list.add("одна");
			    	 }
			    	 
			    	 else if (j==2) {
			    		 list.add("дві");
		    		 }
			    	 else if (j==3){
			    		 list.add("три");
			    	 }
			    	 else if (j==4){
			    		 list.add("чотири");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ять");
			    	 }
			    	 else if (j==6){
			    		 list.add("шість");
			    	 }
			    	 else if (j==7){
			    		 list.add("сім");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісім");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'ять");
			    	 }
			     }
			     
			     if (i==3) {
			    	 if (j==1) {
			    		 list.add("сто");
			    	 }
			    	 
			    	 else if (j==2) {
			    		 list.add("двісті");
		    		 }
			    	 else if (j==3){
			    		 list.add("триста");
			    	 }
			    	 else if (j==4){
			    		 list.add("чотириста");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ятьсот");
			    	 }
			    	 else if (j==6){
			    		 list.add("шістьсот");
			    	 }
			    	 else if (j==7){
			    		 list.add("сімсот");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісімсот");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'ятьсот");
			    	 }
			     }
			     if (i==2) {
			    	 if (j == 1) {
			    		 j = m % (int)Math.pow(10, 2);
			    		 if (j==10) {
			    			 list.add("десять");
			    		 }
			    		 else if (j==11) {
			    			 list.add("одинадцять");
			    		 }
			    		 else if (j==12) {
			    			 list.add("дванадцять");
			    		 }
			    		 else if (j==13) {
			    			 list.add("тринадцять");
			    		 }
			    		 else if (j==14) {
			    			 list.add("чотирнадцять");
			    		 }
			    		 else if (j==15) {
			    			 list.add("п'ятнадцять");
			    		 }
			    		 else if (j==16) {
			    			 list.add("шістадцять");
			    		 }
			    		 else if (j==17) {
			    			 list.add("сімнадцять");
			    		 }
			    		 else if (j==18) {
			    			 list.add("вісімнадцять");
			    		 }
			    		 else if (j==19) {
			    			 list.add("дев'ятнадцять");
			    		 }
			    	 }
			    	 else if (j==2) {
			    		 list.add("двадцять");
		    		 }
			    	 else if (j==3){
			    		 list.add("тридцять");
			    	 }
			    	 else if (j==4){
			    		 list.add("сорок");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ятдесят");
			    	 }
			    	 else if (j==6){
			    		 list.add("шістьдесят");
			    	 }
			    	 else if (j==7){
			    		 list.add("сімдесят");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісімдесят");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'яносто");
			    	 }
			     }
			     if (i==1 & (m % (int)Math.pow(10, i+1))/ ((int)Math.pow(10, i)) != 1 ) {
			    	 if (j==1) {
			    		 list.add("один");
			    	 }
			    	 
			    	 else if (j==2) {
			    		 list.add("два");
		    		 }
			    	 else if (j==3){
			    		 list.add("три");
			    	 }
			    	 else if (j==4){
			    		 list.add("чотири");
			    	 }
			    	 else if (j==5){
			    		 list.add("п'ять");
			    	 }
			    	 else if (j==6){
			    		 list.add("шість");
			    	 }
			    	 else if (j==7){
			    		 list.add("сім");
			    	 }
			    	 else if (j==8){
			    		 list.add("вісім");
			    	 }
			    	 else if (j==9){
			    		 list.add("дев'ять");
			    	 }
			     }
			}
		List<String>reversed = reverseList(list);
		String arrayToString = String.join(" ", reversed);

        System.out.println(arrayToString);
		}
	}
}

