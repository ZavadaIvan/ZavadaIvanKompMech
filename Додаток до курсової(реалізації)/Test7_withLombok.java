package Testing;
import lombok.AllArgsConstructor;  
import lombok.NoArgsConstructor;  
import lombok.Setter;  
import lombok.Getter; 

public class Test7_withLombok { 
	@NoArgsConstructor  
	@AllArgsConstructor   
	public class Student  
	{  
	private @Getter @Setter Integer sttudentId;  
	private @Getter @Setter String studentName;  
	private @Getter @Setter String studentClass;  
	private @Getter @Setter String studentEmailId;  
	}  

}
