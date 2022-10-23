/**
 * 
 * @question ポッキー　（提出物　Pocky.java, Galbo.java）
 * 
 * この問題は，お菓子(ポッキー, ガルボ)を扱うプログラムです． (1)～(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Pocky からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Pocky1
 * scale 1.2
 * align center
 * class Pocky
 *
 * @subquestion クラス図 Galbo からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Galbo1
 * scale 1.2
 * align center
 * class Galbo
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム GalboMain.java を作成しなさい．
 * 
 * @execution GalboMain
 * 
 * @source GalboMain
 * 
 * @subquestion API仕様　Galbo　を満足するように　Galbo.java　を実装しなさい．
 * 
 * @api Galbo
 * 
 * @author miura
 * 
 */
public class GalboMain {
	public static void main(String[] args) {
		Galbo Galbo1 = new Galbo(100);
		Galbo Galbo2 = new Galbo(150);
		
		String item1 = Galbo1.getItem();
		String item2 = Galbo2.getItem();
		int price1 = Galbo1.getPrice();
		int price2 = Galbo2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "円");
		System.out.println(item2 + " " + price2 + "円");
		System.out.println("合計" + sum + "円");
	}
}