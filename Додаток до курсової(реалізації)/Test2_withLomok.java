package Testing;

import lombok.NonNull;

public class Test2_withLomok {
	public class Author {
	    private int id;
	    private String name;
	    private String surname;

	    public Author(
	      @NonNull int id,
	      @NonNull String name,
	      String surname
	    ) {
	      this.id = id;
	      this.name = name;
	      this.surname = surname; 
	  }
	}
}
