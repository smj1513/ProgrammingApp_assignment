package com.seong.prgApp6.Subject;

public class Curriculum {
	int target_year; //대상 학년
	int organizedTerm; //편성 학기
	String classification; // 이수 구분
	Subject subject; //교과목
	public Curriculum(){
		target_year=0;
		organizedTerm=0;
		classification="";
		subject=new Subject();
	}

	public Curriculum(int target_year, int organizedTerm, String classification, Subject subject){
		this.target_year=target_year;
		this.organizedTerm=organizedTerm;
		this.classification=classification;
		this.subject=subject;
	}

	public int getOrganizedTerm() {
		return organizedTerm;
	}

	public int getTarget_year() {
		return target_year;
	}

	public String getClassification() {
		return classification;
	}

	public String getSubject() {
		return subject.toString();
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setOrganizedTerm(int organizedTerm) {
		this.organizedTerm = organizedTerm;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void setTarget_year(int target_year) {
		this.target_year = target_year;
	}
}
