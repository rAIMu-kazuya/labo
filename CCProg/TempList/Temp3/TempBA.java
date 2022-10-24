/**
 * 
 * @question 　（提出物　TempAA.java）
 * 
 * この問題は，コイン(TempAB)を50枚入れた棒金(TempAA)を扱うプログラムです． (1)から(3)の手順にしたがって，プログラムの作成，実行結果の予想をしなさい．
 * 
 * @subquestion クラス図 TempAA からソースコードを導出しなさい．
 * 
 * @make.inputClass Value
 * scale 1.2
 * align center
 * class Value
 * 
 * ！！！！ここに矢印
 * 
 * @make.inputClass TempAA
 * scale 1.2
 * align center
 * class TempAA
 * 
 * ※ArrayListを使用するために　import java.util.ArrayList;　が必要です．
 * 
 * @clearpage
 *
 * @subquestion API仕様　TempAA　を満足するように　TempAA.java　を実装しなさい．
 * 
 * @api TempAA
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
		coinBox.add( new CoinIntBB() );
		coinBox.add( new CoinIntCB() );
		coinBox.add( new CoinIntDB() );
		coinBox.add( new TempAA() );

		int sum = coinBox.getSum();
		System.out.println("合計" + sum + "円");
	}
}