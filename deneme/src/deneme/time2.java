package deneme;

public class time2 {
	public int hour;
	private int minute;
	private int second;
	
	public time2() {
		
	}
	public time2(int saat) {
		this.hour=saat;
	}
	public time2(int saat, int dakika) {
		this.minute=dakika;
		this.hour=saat;
	}
	public time2(int saat, int dakika, int saniye) {
		this.second=saniye;
		this.minute=dakika;
		this.hour=saat;
	}
	public void setSaat(int saat, int dakika, int saniye) {
		if(hour<0 || hour>23 ) {
			Sytem.out.println("Yanlış değer girdiniz.");
			
		}
		
		
		
	}

}
