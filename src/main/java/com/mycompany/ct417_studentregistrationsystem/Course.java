/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ct417_studentregistrationsystem;


import java.util.ArrayList;
import org.joda.time.*;

public class Course {

	private String CourseTitle, CourseCode;
	private ArrayList Modules; 
        private ArrayList<Student> Students;
	private DateTime StartDate;
	private DateTime EndDate;

	public Course(String title, String course, DateTime start, DateTime end) {
                this.CourseTitle = title;
                this.CourseCode = course;
		this.StartDate = start;
		this.EndDate = end;
                Modules = new ArrayList();
                Students = new ArrayList<Student>();
	}
        
        public String toString() {
                return "Coursename: " + CourseCode + " Title: " + CourseTitle;
        }
        
        public void setTitle(String title) {
                this.CourseTitle = title;
        }
        
        public String getTitle() {
                return CourseTitle;
        }

	public String getCourseName() {
		return CourseCode;
	}

	public void setCourseName(String course) {
		this.CourseCode = course;
	}
        
        public void addModule(Module m){
                Modules.add(m);
        }
        
        public void setModules(ArrayList modules) {
		this.Modules = modules;
	}

	public ArrayList getModules() {
		return Modules;
	}

        public void setStartDate(DateTime start) {
		this.StartDate = start;
	}

	public void setEndDate(DateTime end) {
		this.EndDate = end;
	}

        
	public DateTime getStartDate() {
		return StartDate;
	}

	public DateTime getEndDate() {
		return EndDate;
	}
        
        public void registerStudent(Student s) {
                Students.add(s);
                s.setCourse(this);
                s.setModules(Modules);

                for(Module m : s.getModules()) {
                    m.addStudent(s);
                }
        }
        
        public void setStudents(ArrayList<Student> students) {
                this.Students = students;
        }
        
        public ArrayList<Student> getStudents() {
                return Students;
        }

}

