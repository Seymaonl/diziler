package deneme;
import java.util.ArrayList;
public class ders55 {

	public static void main(String[] args) {
		ArrayList<String> item=new ArrayList<String>();
		item.add("red");
		item.add("yellow");
		item.add(0,"green");
		for(String renk: item) {
			System.out.print(" "+ renk);
			
		}
		item.remove("red");
		for(String renk:item) {
			System.out.println(" ");
			System.out.print(" "+ renk);
			
		}
		System.out.println(" ");
		System.out.println(item.get(1));
		System.out.println(item.contains("red")?"evet var":"hayir yok");
	}

}
