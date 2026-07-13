package com.spring.classtaskD16;

public class ExamController {
   
	private String examName;
	private int semester;
	private String examCenter;
	
	public ExamController() {
		
	}
	
	public ExamController(String examName, int semester, String examCenter) {
		super();
		this.examName = examName;
		this.semester = semester;
		this.examCenter = examCenter;
	}

	@Override
	public String toString() {
		return "ExamController {Exam-Name=" + examName + ", Semester=" + semester + ", Exam-Center=" + examCenter + "}";
	}
	
	

}
