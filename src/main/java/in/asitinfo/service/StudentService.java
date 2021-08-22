package in.asitinfo.service;

import java.util.List;

import in.asitinfo.entity.Student;

public interface StudentService {

	public boolean saveAllStudentInfo(Student student);

	public List<Student> getAllStudent();

	public Student updateStudentById(Integer StudentId);

	public boolean deleteById(Integer StudentId);

}
