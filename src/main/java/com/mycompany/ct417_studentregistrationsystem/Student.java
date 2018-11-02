/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ct417_studentregistrationsystem;


import java.util.ArrayList;
import org.joda.time.*;

public class Student {

	private String Name;
	private int Age;
	private DateTime DOB;
	private int ID;
	// private String Username;
	private Course Course;

	public Student(String name, int age, DateTime dob, int id) {
		this.Name = name;
		this.Age = age;
		this.DOB = dob;
		this.ID = id;
	}

	public String getName() {
		return this.Name;
	}

	public int getAge() {
		return this.Age;
	}

	public DateTime getDOB() {
		return this.DOB;
	}

	public int getID() {
		return this.ID;
	}

	public String getUsername() {
		return Name + Age;
	}

	public String getStudent() {
		return this.Name + this.DOB + this.ID;
	}

	public void addStudentocourse(Course course) {
		this.Course = course;
	}

	public Course getCourse() {
		return this.Course;
	}

	public ArrayList<Module> getModules(ArrayList<Module> modules) {
		ArrayList<Module> studentsModules = new ArrayList<Module>();
		for (int i = 0; i < modules.size(); i++) {
			Module module = modules.get(i);

			if (module.getStudents().contains(this)) {
				studentsModules.add(module);
			}
		}
		return studentsModules;
	}
}

