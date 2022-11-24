import java.util.ArrayList;
public class Coinroll implements Value{
	private ArrayList<CoinBB> arrayList = new ArrayList<CoinBB>();
	public Coinroll(){
		for(int i = 0; i < 50; i++){
			this.arrayList.add(new CoinBB());
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