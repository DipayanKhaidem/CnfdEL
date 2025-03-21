//package rvce.lab.prog2;
//
//public class Department {
//	int id;
//	String name,description;
//	College college;
//	
//	public Department(College college) {
//		super();
//		this.college = college;
//	}
//	
//	public College getCollege() {
//		return college;
//	}
//
//	public void setCollege(College college) {
//		this.college = college;
//	}
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	@Override
//	public String toString() {
//		return "Department [id=" + id + ", name=" + name + ", description=" + description + "]";
//	}
//}


package rvce.lab.prog2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {

    private int id;
    private String name;
    private String description;

    @Autowired
    private College college;

    public Department() {}

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
