import java.util.HashSet;
import java.util.Set;

public class Employee {

	String empName;
	long id;
	Set<String> skills; 
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Employee() {
		
	}
	
	
	public void addSkills(String skil) {
		if(this.skills == null) {
			this.skills = new HashSet<>();
		}
		
		this.skills.add(skil);
	}
	public Employee(long id, String name) {
		this.id = id;
		this.empName = name;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + "]";
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}*/
	
	
}
