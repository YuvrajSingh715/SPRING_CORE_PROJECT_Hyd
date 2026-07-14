
/*Program 5: Mixed Injection – One Class via Setter, Dependent Class via Constructor
-------------------------------------------------------------------------------------
A company wants to maintain a Project record. The Project has its own details (name, duration) which should be set later through setters. But every Project must have a Manager assigned to it right at the time of creation, and that Manager detail can't change later.
Requirement:

Create two classes: Project (projectName, duration) and Manager (managerName, department)
Project's own fields (projectName, duration) should be injected using setter injection
The Manager reference inside Project should be injected using constructor injection (through <constructor-arg ref="...">)
So one bean (Manager) is fully built using constructor injection, and its reference is passed into Project's constructor, while Project's own values go through setters

Hint (not solution):

This is a mix of both concepts you learned — decide which fields go in <property> and which go in <constructor-arg>
Think carefully: since Manager reference comes through constructor, your Project class must have a constructor that accepts only the Manager object — not all fields
Compare final output with traditional way, exactly like the pattern followed throughout your notes*/


package com.springcore.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Project{
	
	private String projectName;
	private String duration;
	private Manager manager;
	
	public Project(Manager manager) {
		this.manager = manager;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Project Details [Project Name=" + projectName + ", Duration=" + duration + ", Manager Details=" + manager + "]";
	}
	
}

public class Company {
	
	public static void main(String[] args) {
		
//		Traditional Way
		
//		  Manager manager = new Manager("Garrett", "Full Stack Developer");
//		  System.out.println(manager);
//		  
//		  Project project = new Project(manager); 
//		  project.setDuration("4 Months");
//		  project.setProjectName("Health Care Domain"); 
//		  System.out.println(project);
		
		  
//		Spring Way
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/classtaskD10/application-context.xml");
		Project pro = ac.getBean("project", Project.class);
		System.out.println(pro);
		
	}

}
