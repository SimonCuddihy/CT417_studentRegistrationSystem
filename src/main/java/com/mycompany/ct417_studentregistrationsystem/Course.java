/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ct417_studentregistrationsystem;


import java.util.ArrayList;
import org.joda.time.*;

public class Course {

	private String CourseName;
	private ArrayList<Module> Modules = new ArrayList<Module>();
	private DateTime StartDate;
	private DateTime EndDate;

	public Course(String course, ArrayList<Module> module, DateTime start, DateTime end) {
		this.CourseName = course;
		this.Modules = module;
		this.StartDate = start;
		this.EndDate = end;
	}

	public String getCourseName() {
		return this.CourseName;
	}

	public void setCourseName(String course) {
		this.CourseName = course;
	}

	public ArrayList<Module> getModules() {
		return this.Modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.Modules = modules;
	}

	public DateTime getStartDate() {
		return this.StartDate;
	}

	public DateTime getEndDate() {
		return this.EndDate;
	}

	public void setStartDate(DateTime start) {
		this.StartDate = start;
	}

	public void setEndDate(DateTime end) {
		this.EndDate = end;
	}

}

