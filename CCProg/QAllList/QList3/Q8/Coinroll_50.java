import java.util.ArrayList;
public class Coinroll_50 implements TempDA{
	private ArrayList<TempFA> arrayList = new ArrayList<TempFA>();
	public Coinroll_50(){
		for(int i = 0; i < 50; i++){
			this.arrayList.add(new TempFA());
		}
	}
	public int getValue(){
		int sum = 0;
		for(int i = 0; i < this.arrayList.size(); i++){
			TempDA coin = this.arrayList.get(i);
			sum += coin.getValue();
		}
		return sum;
	}
}