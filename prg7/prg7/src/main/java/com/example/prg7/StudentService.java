package com.example.prg7;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;

	// Method to retrieve all students
	public List<Student> display() {
		return sr.findAll();
	}

	// Optimized insert method (removed unnecessary ID)
	public String insert(String usn, String name, String address) {
		Student s = new Student();
		s.setUsn(usn);
		s.setName(name);
		s.setAddress(address);
		sr.save(s);
		return "Inserted into the table";
	}

	// Optimized delete method
	public String delete(String usn) {
		Optional<Student> studentOpt = sr.findByUsn(usn);
		if (studentOpt.isPresent()) {
			sr.delete(studentOpt.get());
			return "Student record was deleted";
		} else {
			return "Student not found";
		}
	}
}
