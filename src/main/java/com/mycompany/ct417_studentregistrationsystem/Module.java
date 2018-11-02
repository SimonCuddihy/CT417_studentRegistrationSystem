/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ct417_studentregistrationsystem;


import java.util.ArrayList;

public class Module {

	private String ModuleName;
	private String ModuleID;
	private ArrayList<Student> Students = new ArrayList<Student>();

	public Module(String module, String id, ArrayList<Student> students) {
		this.ModuleName = module;
		this.ModuleID = id;
		this.Students = students;
	}

	public String getModuleName() {
		return this.ModuleName;
	}

	public String getModuleId() {
		return this.ModuleID;
	}

	public ArrayList<Student> getStudents() {
		return this.Students;
	}

	public void addStudents(ArrayList<Student> students) {
		this.Students.addAll(students);
	}

}

