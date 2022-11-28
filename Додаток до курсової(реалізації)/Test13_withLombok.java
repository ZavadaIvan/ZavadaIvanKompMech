package Testing;
import lombok.Getter;

public class Test13_withLombok {
	static class Payment {
		  @Getter
		  private Long id;
		  
		  @Getter
		  private String status = simpleDefaultStatus();
		  @Getter(lazy=true)
		  private final double surCharge = complexSurchargeLogic();
		  private double complexSurchargeLogic() {
		  
		    Double surcharge = Math.PI;
		    System.out.println("Called Lazy getSurcharge method");
		    return surcharge;
		  }
		  
		  private String simpleDefaultStatus() {
		    System.out.println("Called EAGER getStatus method");
		    return "NOT_INITIALIZED";
		  }
		}
	static class GetterLazyDemo {
		  public static void main(String[] args) {
		    Payment payment = new Payment();
		    System.out.println("Eager getters called at instance creation time!");
		    double sc = payment.getSurCharge();
		  }
		}

}
