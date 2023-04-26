package com.seong.prgApp6.Subject;

public class Subject {
	Grade grade;
	String sName;
	String sId;
	String sIntro;
	public Subject(){
		grade=new Grade();
		sName="";
		sId="";
		sIntro="";
	}
	public Subject(String sName, String sId){
		this.sName=sName;
		this.sId=sId;
		this.sIntro="";
		this.grade=new Grade();
	}
	public Subject(String sName, String sId, Grade grade){
		this.sName=sName;
		this.sId=sId;
		this.grade=grade;
		this.sIntro="";
	}

	public String getGrade() {
		return grade.toString();
	}

	public String getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public String getsIntro() {
		return sIntro;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public void setGrade(int theory, int design, int training) {
		this.grade = new Grade(theory,design,training);
	}
	public void setsId(String sId) {
		this.sId = sId;
	}

	public void setsIntro(String sIntro) {
		this.sIntro = sIntro;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString(){
		return sId+" "+sName+" "+grade.toString()+"\n"+sIntro;
	}
}
