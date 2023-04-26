package com.seong.prgApp5;

public class StockTest {
	public static void main(String[] args){
		Stock stock = new Stock("ORCL","Oracle Corporation");
		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.5);
		System.out.println("---Stock Information---");
		System.out.println("Stock symbol:"+stock.getSymbol());
		System.out.println("Stock name:"+stock.getName());
		System.out.println("PreviousClosingPrice:"+stock.getPreviousClosingPrice());
		System.out.println("CurrentPrice:"+stock.getCurrentPrice());
		System.out.println("Current changePercent:"+stock.getChangePercent()+"%");
		stock.setCurrentPrice(34.35);
		System.out.println("Changed Price:"+stock.getCurrentPrice());
		System.out.println("Modified changePercent:"+stock.getChangePercent()+"%");
	}
}
