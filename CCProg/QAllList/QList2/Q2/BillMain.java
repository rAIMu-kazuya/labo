/**
 * 
 * @question 　（提出物　Bill.java）
 * 
 * この問題は，1万円紙幣(Bill)を扱うプログラムです． (1)～(3)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Bill からソースプログラムを導出しなさい．
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Bill    0 -5
 * arrow BillImplementsValue
 * 
 * @image 10000.png
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
 * @subquestion API仕様　Bill　を満足するように　Bill.java　を実装しなさい．
 * 
 * @api Bill
 * 
 * @author miura
 * 
 */
public class BillMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new CoinAAA() );
		coinBox.add( new CoinAAA() );
		coinBox.add( new CoinBB() );
		coinBox.add( new Bill() );

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("合計" + sum + "円");
	}
}