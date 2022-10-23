/**
 * 
 * @question 　（提出物　TempAA.java）
 * 
 * この問題は，TempAB(TempAA)を扱うプログラムです． (1)から(3)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 TempAA からソースプログラムを導出しなさい．
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
 * @image TempFB
 * 
 * 　　　　※画像は http://gahag.net/000546-money-japanese-yen/ から引用
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
		CoinBox coinBox = new CoinBox();
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