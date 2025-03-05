package com.example.prg7;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(unique = true, nullable = false)
	@NotBlank(message = "USN cannot be blank")
	@Size(min = 3, max = 10, message = "USN must be between 3 and 10 characters")
	private String usn;

	@Column(nullable = false)
	@NotBlank(message = "Name cannot be blank")
	@Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
	private String name;

	@Column(nullable = false)
	@NotBlank(message = "Address cannot be blank")
	@Size(min = 5, max = 100, message = "Address must be between 5 and 100 characters")
	private String address;

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

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
		return "Student [id=" + id + ", usn=" + usn + ", name=" + name + ", address=" + address + "]";
	}
}
