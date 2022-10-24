/**
 * 
 * @question 　（提出物　Coinroll_50.java）
 * 
 * この問題は，コイン(Coin50)を50枚入れた棒金(Coinroll_50)を扱うプログラムです． (1)から(3)の手順にしたがって，プログラムの作成，実行結果の予想をしなさい．
 * 
 * @subquestion クラス図 Coinroll_50 からソースコードを導出しなさい．
 * 
 * @make.inputClass Value
 * scale 1.2
 * align center
 * class Value
 * 
 * ！！！！ここに矢印
 * 
 * @make.inputClass Coinroll_50
 * scale 1.2
 * align center
 * class Coinroll_50
 * 
 * ※ArrayListを使用するために　import java.util.ArrayList;　が必要です．
 * 
 * @clearpage
 *
 * @subquestion API仕様　Coinroll_50　を満足するように　Coinroll_50.java　を実装しなさい．
 * 
 * @api Coinroll_50
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
		coinBox.add( new Coin50() );
		coinBox.add( new Coin50() );
		coinBox.add( new Coinroll_50() );

		int sum = coinBox.getSum();
		System.out.println("合計" + sum + "円");
	}
}