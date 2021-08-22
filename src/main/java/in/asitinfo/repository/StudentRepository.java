package in.asitinfo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.asitinfo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
