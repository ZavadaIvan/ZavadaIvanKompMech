package Testing;
import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

public class Test1_withLombok {
	static class ValExample {
		  public String example() {
		    val example = new ArrayList<String>();
		    example.add("Hello, World!");
		    val foo = example.get(0);
		    return foo.toLowerCase();
		  }
		  
		  public void example2() {
		    val map = new HashMap<Integer, String>();
		    map.put(1, "Один");
		    map.put(8, "Вісім");
		    for (val entry : map.entrySet()) {
		      System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
		    }
		  }
		}
	public static void main(String[] args) {
		ValExample k = new ValExample();
		System.out.println(k.example());
		k.example2();
	}

}
