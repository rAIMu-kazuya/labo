import java.util.ArrayList;
public class Coinroll_50 implements Value{
	private ArrayList<Coin50> arrayList = new ArrayList<Coin50>();
	public Coinroll_50(){
		for(int i = 0; i < 50; i++){
			this.arrayList.add(new Coin50());
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