import java.util.ArrayList;
public class TempCA{
	private ArrayList<Value> arrayList = new ArrayList<Value>();
	public CoinBox(){}
	public void add(Value value){
		this.arrayList.add(value);
	}
	public Value remove(int number){
		for(int i = 0; i < this.arrayList.size(); i++){
			Value value = this.arrayList.get(i);
			if(number == value.getValue()){
				return value;
			}
		}
		return null;
	}
	public int size(){
		return this.arrayList.size();
	}
	public int getSum(){
		int sum = 0;
		for(int i = 0; i < this.arrayList.size(); i++){
			Value value = this.arrayList.get(i);
			sum += value.getValue();
		}
		return sum;
	}
	public void print(){
		for(int i = 0; i < this.arrayList.size(); i++){
			Value value = this.arrayList.get(i);
			System.out.println(value.getValue());
		}
	}
}