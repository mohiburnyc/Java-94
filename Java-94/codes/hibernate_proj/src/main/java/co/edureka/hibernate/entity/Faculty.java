package co.edureka.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private Integer facultyId;
	private String facultyName;

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

}
