package Fis.B2;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private int code;
	private String name;
	private LocalDate birthDate;
	
	public Student() {
		
	}
	public Student(int _code, String _name, LocalDate _birthDate) {
		this.code = _code;
		this.name = _name;
		this.birthDate = _birthDate;
	}
	public int getCode() {
		return this.code;
	}
	public String getName() {
		return this.name;
	}
	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	public void setCode(int _code) {
		this.code = _code;
	}
	public void setName(String _name) {
		this.name = _name;
	}
	public void setBirthDate(LocalDate _date) {
		this.birthDate = _date;
	}
	@Override
	public int compareTo(Student std) {
		return this.name.compareTo(std.name);
	}
	public String toString() {
		return ("Code : " + this.getCode() + "\n"
				+ "Name : " + this.getName() + "\n"
				+ "BirthDate : " + this.getBirthDate());
	}
}
