package deneme;

public class TimeTest {
/*
	public static void main(String[] args) {
		zaman saat=new zaman();
		saat.setTime (12, 45, 50);
		System.out.println(saat.saat());
		System.out.println("Set sayisi : "+ zaman.getCount());
		System.out.println(saat.hour);
		*
        */
	time2 saat2=new time2(9,30);
	saat2.setSaatDakika(9, 30);
	System.out.println(saat2.saat());
	time2 saat3=new time2(3, 45, 55);
	System.out.println(saat3.saat());
	
	
	}

