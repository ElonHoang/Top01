package Fis.B2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class StudentList implements ISortStrategy  {
	private Student[] students;
	private int count;
	private ISortStrategy sortStrategy;
	@Override
	public void sort(Comparable[] data, int count) {
		String pr = "";
		for(var sdt : students) {
			pr = sdt.toString();
		}
		return;
	}
	Scanner sc = new Scanner(System.in);
	public void addStudent(Student std) {
		System.out.println("Enter Code :");
		int code = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		System.out.println("Enter BirthDate :");
		String convert  = sc.nextLine();
		LocalDate date = LocalDate.now();
		try {
			date = LocalDate.parse(convert, DateTimeFormatter.ISO_LOCAL_DATE);
		}catch(Exception ex) {
			System.out.println("Enter BirthDate :");
			convert  = sc.nextLine();
		}
		Student s = new Student(code,name,date);
		
	}
	public Student removeStudent(int _code) {
		sc = new Scanner(System.in);;
		System.out.println("Enter code :");
		int code = sc.nextInt();
		for(var c : students) {
			if(c.getCode() == code) {
				Student[] std = new Student[students.length - 1];
				System.arraycopy(students, students.length - 1, students, 0, students.length - 1);
				}
		}
		return 
	}
	public void display() {
		String display = "";
		if(students != null) {
			return;
		}
		for(Student std : students) {
			display += std.getName() + " ";
		}
		System.out.print("Students : " + display + "\n" +"Count :" + this.count);
	}
	public void setStrategy(ISortStrategy _sortStrategy) {
		this.sortStrategy = _sortStrategy;

@Override
public void sort(Comparable[] data, int count, Comparator[] cp) {
	// TODO Auto-generated method stub
	
}	}
}
