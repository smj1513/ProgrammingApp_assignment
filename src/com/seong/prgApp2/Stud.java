package com.seong.prgApp2;

public class Stud {
    private String name;
    private double korea, math, eng;
    public Stud(String name, double korea, double math, double eng){
        this.name=name;
        this.korea=korea;
        this.math=math;
        this.eng=eng;
    }
    public String getName(){
        return this.name;
    }
    public double getAverage(){
        double avg = (korea + math + eng) / 3.0;
        return avg;
    }
}
