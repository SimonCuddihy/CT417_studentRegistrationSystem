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
	private static int nextID = 12456772;
	private DateTime DOB;
	private int Age, ID;
	private Course Course;
        private ArrayList<Module> Modules;

	public Student(String name, int age, DateTime dob) {
		this.Name = name;
		this.Age = age;
		this.DOB = dob;
		this.ID = nextID;
                
                Modules = new ArrayList<Module>();
                nextID++;
	}
        
        public String toString() {
                return "NAME: " + Name + "\nID: " + ID + "\nUSERNAME: " + this.getUsername();
        }
        
        public void setName(String n) {
            this.Name = n;
        }
        
	public String getName() {
		return Name;
	}

        public void setAge(int a) {
            this.Age = a;
        }
        
	public int getAge() {
		return Age;
	}
        
        public void setDOB(DateTime DOB) {
            this.DOB = DOB;
        }

	public DateTime getDOB() {
		return DOB;
	}

	public int getID() {
		return ID;
	}

	public String getUsername() {
		return Name.replaceAll("\\s","") + Age + "@NUIGALWAY.IE";
	}

	public String getStudent() {
		return this.Name + this.DOB + this.ID;
	}
        
        public void setCourse(Course course) {
                this.Course = course;
        }

	public Course getCourse() {
		return Course;
	}
        
        public void setModules(ArrayList<Module> modules) {
                this.Modules = modules;
        }
        
        public ArrayList<Module> getModules() {
                return Modules;
        }
        
}

