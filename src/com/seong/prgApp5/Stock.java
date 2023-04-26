package com.seong.prgApp5;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	Stock(String symbol, String name){
		this.symbol =symbol;
		this.name=name;
	}
	public void setPreviousClosingPrice(double CLP){
		this.previousClosingPrice=CLP;
	}
	public void setCurrentPrice(double CRP){
		this.currentPrice=CRP;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSymbol(String symbol){
		this.symbol=symbol;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	public double getCurrentPrice(){
		return currentPrice;
	}
	public String getSymbol(){
		return symbol;
	}
	public String getName(){
		return name;
	}
	public double getChangePercent(){
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}
