/**
 * 
 * @question マシュマロ　（提出物　Mashmallow.java, Candy.java）
 * 
 * この問題は，お菓子(マシュマロ, キャンディ)を扱うプログラムです． (1)～(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Mashmallow からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Mashmallow1
 * scale 1.2
 * align center
 * class Mashmallow
 *
 * @subquestion クラス図 Candy からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Candy1
 * scale 1.2
 * align center
 * class Candy
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム CandyMain.java を作成しなさい．
 * 
 * @execution CandyMain
 * 
 * @source CandyMain
 * 
 * @subquestion API仕様　Candy　を満足するように　Candy.java　を実装しなさい．
 * 
 * @api Candy
 * 
 * @author miura
 * 
 */
public class CandyMain {
	public static void main(String[] args) {
		Candy Candy1 = new Candy(100);
		Candy Candy2 = new Candy(150);
		
		String item1 = Candy1.getItem();
		String item2 = Candy2.getItem();
		int price1 = Candy1.getPrice();
		int price2 = Candy2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "円");
		System.out.println(item2 + " " + price2 + "円");
		System.out.println("合計" + sum + "円");
	}
}