/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ct417_studentregistrationsystem;


import java.util.ArrayList;

public class Module {

	private String ModuleName,ModuleID;
	private static int nextModID = 417;
	private ArrayList Students;

	public Module(String module) {
		this.ModuleName = module;
		this.ModuleID = "CT" + nextModID;
		this.Students = new ArrayList();
                nextModID++;
	}
        
        public String toString() {
                return "\nMODULE CODE: " + this.ModuleID + "  MODULE TITLE: " + this.ModuleName;
        }

	public String getModuleName() {
		return this.ModuleName;
	}

	public String getModuleId() {
		return this.ModuleID;
	}
        
        public void addStudent(Student s) {
                Students.add(s);
        }

        public void setStudents(ArrayList<Student> s) {
                this.Students = s;
        }
        
	public ArrayList<Student> getStudents() {
		return this.Students;
	}

}

