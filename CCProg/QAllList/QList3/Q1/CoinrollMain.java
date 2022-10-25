/**
 * 
 * @question 　（提出物　Coinroll_100.java）
 * 
 * この問題は，コイン(Coin100)を50枚入れた棒金(Coinroll_100)を扱うプログラムです． (1)～(3)の手順にしたがって，プログラムの作成，実行結果の予想をしなさい．
 * 
 * @subquestion クラス図 Coinroll_100 からソースコードを導出しなさい．
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Coinroll_100    0 -5
 * arrow Coinroll_100ImplementsValue    
 * 
 * ※ArrayListを使用するために　import java.util.ArrayList;　が必要です．
 * 
 * @clearpage
 *
 * @subquestion API仕様　Coinroll_100　を満足するように　Coinroll_100.java　を実装しなさい．
 * 
 * @api Coinroll_100
 * 
 * @subquestion 以下のソースコード CoinrollMain.java の実行結果を予想しなさい．
 * 
 * @source CoinrollMain.java
 * 
 * @author miura
 * 
 */
public class CoinrollMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Coinroll_100() );

		int sum = coinBox.getSum();
		System.out.println("合計" + sum + "円");
	}
}