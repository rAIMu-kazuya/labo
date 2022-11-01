/**
 * 
 * @question 　（提出物　TempAA.java）
 * 
 * この問題は，コイン(TempAB)を50枚入れた棒金(TempAA)を扱うプログラムです． (1)～(3)の手順にしたがって，プログラムの作成，実行結果の予想をしなさい．
 * 
 * @subquestion クラス図 TempAA からソースコードを導出しなさい．
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class TempAA    0 -5
 * arrow TempAAImplementsValue    
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
public class TempBA {
	public static void main(String[] args) {
		TempCA coinBox = new TempCA();
		coinBox.add( new CoinIntBB() );
		coinBox.add( new CoinIntCB() );
		coinBox.add( new CoinIntDB() );
		coinBox.add( new TempAA() );

		int sum = coinBox.getSum();
		System.out.println("合計" + sum + "円");
	}
}