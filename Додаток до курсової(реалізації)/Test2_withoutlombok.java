package Testing;


public class Test2_withoutlombok {
	static class Author {
	    private int id;
	    private String name;
	    private String surname;

	    public Author(
	      int id,
	      String name,
	      String surname
	    ) {
	        if (id == 0) {
	          throw new NullPointerException("id is marked @NonNull but is null");
	        }
	        this.id = id;
	        if (name == null) {
	          throw new NullPointerException("name is marked @NonNull but is null");
	        }
	        this.name = name;
	        this.surname = surname; 
	  }
	}
}
