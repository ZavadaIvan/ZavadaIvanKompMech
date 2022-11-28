package Testing;

public class Test10_withoutLombok {
	static class Student {

	    private String name;
	    private int age;

	    Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public static StudentBuilder builder() {
	        return new StudentBuilder();
	    }

	    public static class StudentBuilder {

	        private String name;
	        private int age;

	        StudentBuilder() {
	        }

	        public StudentBuilder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public StudentBuilder age(int age) {
	            this.age = age;
	            return this;
	        }

	        public Student build() {
	            return new Student(name, age);
	        }

	        public String toString() {
	            return "Student.StudentBuilder(Ім'я=" + this.name + ", Вік=" + this.age + ")";
	        }
	    }
	}
}
	