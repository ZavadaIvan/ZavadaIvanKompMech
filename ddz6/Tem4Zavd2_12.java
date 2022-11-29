package ddz5;

import java.util.*;
 
public class Tem4Zavd2_12 {
 
    public static void main(String[] args) {   
        String punktt;   
        String dayy;
        double chas;
        Scanner in = new Scanner(System.in); 
        Airline[] result = new Airline[] {new Airline("Washington", 10232, "Boeing 747", 17.40, "Mon"),
        		new Airline("Kyiv", 23452, "А380", 8.20, "Tue"),
        		new Airline("Washington", 10232, "Boeing 747", 5.40, "Mon"),  
                new Airline("Kyiv", 23452, "А380", 18.20, "Tue"), 
                new Airline("New York", 47652, "А300", 19.00, "Mon"), 
                new  Airline("Rome", 20022, "Boeing 747", 12.20, "Wed"),
                new  Airline("Kyiv", 45042, "Boeing 777", 9.20, "Sun"),
                new  Airline("Berlin", 24241, "А300", 10.00, "Sat"),
                new  Airline("Washington", 73241, "А380", 7.30, "Mon"),
                new  Airline("Helsinki", 96241, "Boeing 727", 23.12, "Mon"),
                new  Airline("Washington", 64311, "А300", 10.00, "Sat")};
        for (int i = 0; i < result.length; i++) {
        	 System.out.println(result[i]);
        }
        System.out.println("\n");
        System.out.println("a)");
        System.out.println("введіть пункт призначення");
        punktt = in.nextLine();
        for (int i = 0; i < result.length; i++) {
        	if(result[i].getPunkt().equals(punktt)) {
        		System.out.println(result[i]);
        	}
        }
        System.out.println("\n");
        System.out.println("б)");
        System.out.println("введіть день тижня");
        dayy = in.nextLine();
        for (int i = 0; i < result.length; i++) {
        	if(result[i].getDay().equals(dayy)) {
        		System.out.println(result[i]);
        	}
        }
     
        System.out.println("\n");
        System.out.println("в)");
        System.out.println("введіть час");
        System.out.println("введіть день тижня");
        chas= in.nextDouble();
        in.nextLine();
        dayy = in.nextLine();
        for (int i = 0; i < result.length; i++) {
        	if(result[i].getDay().equals(dayy) && result[i].getTimee()>chas){
        		System.out.println(result[i]);
        	}
        }
        
       }
               
                	
}

    

class Airline {
    private String punkt;
    private int nomrei;
    private String model;
    private double timee;
    private String day;
 
    public Airline(String punkt, int nomrei,String model, double timee, String day) {
        this.punkt = punkt;
        this.nomrei = nomrei;
        this.model = model;
        this.timee = timee;
        this.day = day;
    }

 
    public String getPunkt() {
        return punkt;
    }
 
    public void setPunkt(String punkt) {
        this.punkt = punkt;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    public int getNomrei() {
        return nomrei;
    }
 
    public void setNomrei(int nomrei) {
        this.nomrei = nomrei;
    }
 
    public String getDay() {
        return day;
    }
 
    public void setDay(String day) {
        this.day = day;
    }
 
    public double getTimee() {
        return timee;
    }
 
    public void setTimee(int timee) {
        this.timee = timee;
    }
 
    
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airline{");
        sb.append("punkt=").append(punkt);
        sb.append(", nomer reisa='").append(nomrei).append('\'');
        sb.append(", model=").append(model);
        sb.append(", time='").append(timee).append('\'');
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }
}
