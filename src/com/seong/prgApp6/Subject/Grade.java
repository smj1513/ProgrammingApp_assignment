package com.seong.prgApp6.Subject;

public class Grade {
	private int entire;
	private int theory; //이론
	private int design; //설계
	private int training; //실습

	Grade() {
		this.entire = 0;
		this.theory = 0;
		this.training = 0;
		this.design = 0;
	}

	Grade(int theory, int design, int training) {
		this.theory = theory;
		this.design = design;
		this.training = training;
		this.entire = theory + design + (training / 2);
	}

	public int getEntire() {
		return this.getEntire();
	}

	public int getTheory() {
		return this.theory;
	}

	public void setTheory(int theory) {
		this.theory = theory;
		setEntire(design, theory, training);
	}

	public int getDesign() {
		return this.design;
	}

	public void setDesign(int design) {
		this.design = design;
		setEntire(design, theory, training);
	}

	public int getTraining() {
		return this.training;
	}

	public void setTraining(int training) {
		this.training = training;
		setEntire(design, theory, training);
	}

	private void setEntire(int design, int theory, int training) {
		this.entire = theory + design + (training / 2);
	}

	@Override
	public String toString() {
		return entire + "-" + theory + "-" + design + "-" + training;
	}
}
