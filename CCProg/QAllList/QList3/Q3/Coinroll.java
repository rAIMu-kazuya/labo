import java.util.ArrayList;
public class Coinroll implements Value{
	private ArrayList<CoinAAA> arrayList = new ArrayList<CoinAAA>();
	public Coinroll(){
		for(int i = 0; i < 50; i++){
			this.arrayList.add(new CoinAAA());
		}
	}
	public int getValue(){
		int sum = 0;
		for(int i = 0; i < this.arrayList.size(); i++){
			Value coin = this.arrayList.get(i);
			sum += coin.getValue();
		}
		return sum;
	}
}