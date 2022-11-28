package Testing;

public class Test5_withoutLombok {

	public class Student  
	{  
	private Integer studentId;  
	private String studentName;  
	private String studentClass;  
	private String studentEmailId;   
	public Student()   
	{  
	}   
	public Student(Integer studentId, String studentName, String studentClass, String studentEmailId)   
	{  
	super();  
	this.studentId = studentId;  
	this.studentName = studentName;  
	this.studentClass = studentClass;  
	this.studentEmailId = studentEmailId;  
	}  
	
	@Override  
	public String toString()   
	{  
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass + ", studentEmailId=" + studentEmailId + "]";  
	}  
	}  
}
