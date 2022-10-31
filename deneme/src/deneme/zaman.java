package deneme;

public class zaman {
	public int hour;
	private int minute;
	private int second;
	public static int count=0;
	
	public void setTime(int hour, int minuter, int second) {
		if(hour<0 || hour>23 || minute<0 || minute>60 || second<0 || second>60) {
			System.out.println("Yanlış saat değerleri girdiniz.");
		
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
	}
	public String saat() {
		return String.format("%02d:%02d:%02d:",hour, minute, second);
	}
}
