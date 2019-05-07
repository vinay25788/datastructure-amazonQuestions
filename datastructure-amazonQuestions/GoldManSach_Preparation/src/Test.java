import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee
{
	int id;
	String name;
	
	Employee()
	{
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
class A
{
	void m1() throws IOException
	{
		
	}
}
class B
{
	void m1() throws FileNotFoundException
	{
		
	}
}
public class Test {
public static void main(String[] args) {
	List<Employee> list = new ArrayList<>();
	Employee e1 = new Employee(1,"vinay");
	Employee e2 = new Employee(2, "osim");
	Employee e3 = new Employee(3,"lvinay");
	Employee e4 = new Employee(4, "vosim");
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	int ind = list.indexOf(new Employee(1,"vinay"));
	System.out.println(ind);
	//FileReader file = new FileReader(new File(""));
}	
}
