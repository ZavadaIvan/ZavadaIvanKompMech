package Testing;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.With;


public class Test12_withLombok {
	static class WithExample {
	  @With(AccessLevel.PROTECTED) @NonNull private final String name;
	  @With private final int age;
	  
	  public WithExample(@NonNull String name, int age) {
	    this.name = name;
	    this.age = age;
	  }
	}

}
