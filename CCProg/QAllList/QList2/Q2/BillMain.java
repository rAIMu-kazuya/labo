/**
 * 
 * @question 　（提出物　Bill_10000.java）
 * 
 * この問題は，1万円紙幣(Bill_10000)を扱うプログラムです． (1)から(3)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Bill_10000 からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Value
 * scale 1.2
 * align center
 * class Value
 * 
 * ！！！！ここに矢印
 * 
 * @make.inputClass Bill_10000
 * scale 1.2
 * align center
 * class Bill_10000
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
 * @subquestion API仕様　Bill_10000　を満足するように　Bill_10000.java　を実装しなさい．
 * 
 * @api Bill_10000
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
		coinBox.add( new Bill_10000() );

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("合計" + sum + "円");
	}
}