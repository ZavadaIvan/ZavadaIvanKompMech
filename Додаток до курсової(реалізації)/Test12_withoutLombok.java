package Testing;

public class Test12_withoutLombok {

	public class WithExample {
	  private final String name;
	  private final int age;

	  public WithExample(String name, int age) {
	    if (name == null) throw new NullPointerException();
	    this.name = name;
	    this.age = age;
	  }

	  protected WithExample withName(String name) {
	    if (name == null) throw new java.lang.NullPointerException("name");
	    return this.name == name ? this : new WithExample(name, age);
	  }

	  public WithExample withAge(int age) {
	    return this.age == age ? this : new WithExample(name, age);
	  }
	}

}
