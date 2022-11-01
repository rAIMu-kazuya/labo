import java.util.ArrayList;
public class TempAA implements TempDA{
	private ArrayList<TempAB> arrayList = new ArrayList<TempAB>();
	public TempAA(){
		for(int i = 0; i < 50; i++){
			this.arrayList.add(new TempAB());
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