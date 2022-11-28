package Testing;

public class Test8_withoutlombok {
	

	public class Liudina {
	    private String name;
	    private int age;

	    public Liudina(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public Liudina() {
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Liudina chelovek = (Liudina) o;

	        if (age != chelovek.age) return false;
	        return name != null ? name.equals(chelovek.name) : chelovek.name == null;
	    }

	    @Override
	    public int hashCode() {
	        int result = name != null ? name.hashCode() : 0;
	        result = 31 * result + age;
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Liudina{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
	}
	

}
