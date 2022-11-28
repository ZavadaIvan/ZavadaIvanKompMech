package Testing;
import lombok.Getter;   
import lombok.Setter;  
import lombok.ToString;  

public class Test5_withLombok {
	@ToString  
	public class Student  
	{  
	private @Getter @Setter Integer sttudentId;  
	private @Getter @Setter String studentName;  
	private @Getter @Setter String studentClass;  
	private @Getter @Setter String studentEmailId;  
	}  

}
