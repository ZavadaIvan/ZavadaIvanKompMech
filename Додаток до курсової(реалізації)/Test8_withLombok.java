package Testing;
import lombok.*;

public class Test8_withLombok {

	@Data
	static class Liudina {
	    private String name;
	    private int age;

	   
	    }
	 public static void main(String[] args) {
	       var chelovek = new Liudina();
	       chelovek.setAge(22);
	       System.out.println(chelovek);
	}

}
