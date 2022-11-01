/**
 * 
 * @question 　（提出物　Bill_1000.java）
 * 
 * この問題は，千円紙幣(Bill_1000)を扱うプログラムです． (1)〜(3)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Bill_1000 からソースプログラムを導出しなさい．
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Bill_1000    0 -5
 * arrow Bill_1000ImplementsValue
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム BillMain.java を作成しなさい．
 * 
 * @execution BillMain
 * 
 * @source BillMain.java
 * 
 * @subquestion API仕様　Bill_1000　を満足するように　Bill_1000.java　を実装しなさい．
 * 
 * @api Bill_1000
 * 
 * @author miura
 * 
 */
public class BillMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Coin50() );
		coinBox.add( new Bill_1000() );

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("合計" + sum + "円");
	}
}