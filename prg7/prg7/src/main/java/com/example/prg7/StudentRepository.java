package com.example.prg7;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	Optional<Student> findByUsn(String usn);

}
