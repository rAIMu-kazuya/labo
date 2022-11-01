/**
 * 
 * @question 　（提出物　TempAA.java）
 * 
 * この問題は，TempAB(TempAA)を扱うプログラムです． (1)～(3)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 TempAA からソースプログラムを導出しなさい．
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class TempAA    0 -5
 * arrow TempAAImplementsValue
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム BillMain.java を作成しなさい．
 * 
 * @execution BillMain
 * 
 * @source BillMain.java
 * 
 * @subquestion API仕様　TempAA　を満足するように　TempAA.java　を実装しなさい．
 * 
 * @api TempAA
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

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("合計" + sum + "円");
	}
}