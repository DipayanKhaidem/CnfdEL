//package rvce.lab.prog2;
//
//public class College {
//	
//	String name,address;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "College [name=" + name + ", address=" + address + "]";
//	}
//
//}

package rvce.lab.prog2;

import org.springframework.stereotype.Component;

@Component
public class College {
    
    private String name = "Rv College";
    private String address = "Bengaluru";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "College [name=" + name + ", address=" + address + "]";
    }
}
