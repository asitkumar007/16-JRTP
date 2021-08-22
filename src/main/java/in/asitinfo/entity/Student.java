package in.asitinfo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_INFO")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private Integer StudentId;

	@Column(name = "STUDENT_NAME")
	private String StudentName;

	@Column(name = "STUDENT_EMAIL")
	private String StudentEmail;

	@Column(name = "STUDENT_NUMBER")
	private Long ContactNo;

	@Column(name = "ACTIVE_SWITCH")
	private Boolean ActiveSw;

	@Column(name = "CREATEDDATE")
	private LocalDate CreatedDate;

	@Column(name = "UPDATEDDATE")
	private LocalDate UpdatedDate;

}
