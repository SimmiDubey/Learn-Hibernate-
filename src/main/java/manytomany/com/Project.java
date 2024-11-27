package manytomany.com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
    
	@Id
	private int pid;
	private String project_name;
	
	@ManyToMany(mappedBy="projects")
	private List<Employe>employees;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Employe> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employe> employees) {
		this.employees = employees;
	}
	
	
	
}
