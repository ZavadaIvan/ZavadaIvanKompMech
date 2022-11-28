package Testing;
import java.util.Objects;

public class Test9_withoutLombok {

	static final class Person {

	    private final String firstname;
	    private final String lastname;
	    private final String ssn;

	    public Person(final String firstname, final String lastname, final String ssn) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.ssn = ssn;
	    }

	    public String getFirstname() {
	        return this.firstname;
	    }

	    public String getLastname() {
	        return this.lastname;
	    }

	    public String getSsn() {
	        return this.ssn;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 43 * hash + Objects.hashCode(this.firstname);
	        hash = 43 * hash + Objects.hashCode(this.lastname);
	        hash = 43 * hash + Objects.hashCode(this.ssn);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Person other = (Person) obj;
	        if (!Objects.equals(this.firstname, other.firstname)) {
	            return false;
	        }
	        if (!Objects.equals(this.lastname, other.lastname)) {
	            return false;
	        }
	        if (!Objects.equals(this.ssn, other.ssn)) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", ssn=" + ssn + '}';
	    }

	}

}
