package com.oops.inheritance.single;

class Memecoin{
	public String name;
	public String farming_platform;
}
class Exchange extends Memecoin{
	
	public String exchange_name;
	
	public String toString() {
		return ("name of meme coin "+name+
				"\n"
				+"farming platform " +farming_platform+
				"\n"
				+"listing on "+exchange_name);
	}
}
public class Example1 {
public static void main(String args[]) {
	Exchange ex1 = new Exchange();
	ex1.name = "dogs";
	ex1.farming_platform = "telegram";
	ex1.exchange_name = "binance, bybit, bitget, gate.io";
	System.out.println(ex1.toString());
}
}
