/**
 * 
 * @question 　（提出物　Coinroll.java）
 * 
 * この問題は，コイン(CoinAAA)を50枚入れた棒金(Coinroll)を扱うプログラムです． (1)～(3)の手順にしたがって，プログラムの作成，実行結果の予想をしなさい．
 * 
 * @subquestion クラス図 Coinroll からソースコードを導出しなさい．
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Coinroll    0 -5
 * arrow CoinrollImplementsValue  0 -3 
 * 
 * ※ArrayListを使用するために　import java.util.ArrayList;　が必要です．
 * 
 * @clearpage
 * 
 * @source Coinroll.java
 * 
 * @subquestion 以下のソースコード CoinrollMain.java の実行結果を予想しなさい．
 * 
 * @source CoinrollMain.java
 * @source CoinAAA.java
 * @source CoinBB.java
 * 
 * @author miura
 * 
 */
public class CoinrollMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new CoinBB() );
		coinBox.add( new CoinBB() );
		coinBox.add( new CoinBB() );
		coinBox.add( new Coinroll() );

		int sum = coinBox.getSum();
		System.out.println("合計" + sum + "円");
	}
}