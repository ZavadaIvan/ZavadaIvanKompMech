package Testing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test1_withoutLombok {

	static class ValExample {
	  public String example() {
	    final ArrayList<String> example = new ArrayList<String>();
	    example.add("Hello, World!");
	    final String foo = example.get(0);
	    return foo.toLowerCase();
	  }
	  
	  public void example2() {
	    final HashMap<Integer, String> map = new HashMap<Integer, String>();
	    map.put(1, "Один");
	    map.put(8, "Вісім");
	    for (final Map.Entry<Integer, String> entry : map.entrySet()) {
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
