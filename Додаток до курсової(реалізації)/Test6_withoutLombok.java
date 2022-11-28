package Testing;

public class Test6_withoutLombok {
	class User {
		  String name;
		  int age;
		  
		  public boolean equals(User that) {
			  if (name == null && that.name != null) {
			    return false;
			  }
			  if (name != null && !name.equals(that.name)) {
			    return false;
			  }
			  return age == that.age;
			}
		  
		  
		}
	

}
