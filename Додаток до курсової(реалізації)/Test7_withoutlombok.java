package Testing;

public class Test7_withoutlombok {

	static class Student  
	{  
	private Integer studentId;  
	private String studentName;  
	private String studentClass;  
	private String studentEmailId;  
	//звичайний конструктор
	public Student()   
	{  
	}  
	//параметризований конструктор 
	public Student(Integer studentId, String studentName, String studentClass, String studentEmailId)   
	{  
	super();  
	this.studentId = studentId;  
	this.studentName = studentName;  
	this.studentClass = studentClass;  
	this.studentEmailId = studentEmailId;  
	}  

}

}