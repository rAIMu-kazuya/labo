import java.util.ArrayList;
public class Coinroll_100 implements TempDA{
	private ArrayList<TempEA> arrayList = new ArrayList<TempEA>();
	public Coinroll_100(){
		for(int i = 0; i < 50; i++){
			this.arrayList.add(new TempEA());
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