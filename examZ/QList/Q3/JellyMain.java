/**
 * 
 * @question クッキー　（提出物　Cookie.java, Jelly.java）
 * 
 * この問題は，お菓子(クッキー, ゼリー)を扱うプログラムです． (1)～(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Cookie からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Cookie1
 * scale 1.2
 * align center
 * class Cookie
 *
 * @subquestion クラス図 Jelly からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Jelly1
 * scale 1.2
 * align center
 * class Jelly
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム JellyMain.java を作成しなさい．
 * 
 * @execution JellyMain
 * 
 * @source JellyMain
 * 
 * @subquestion API仕様　Jelly　を満足するように　Jelly.java　を実装しなさい．
 * 
 * @api Jelly
 * 
 * @author miura
 * 
 */
public class JellyMain {
	public static void main(String[] args) {
		Jelly Jelly1 = new Jelly(100);
		Jelly Jelly2 = new Jelly(150);
		
		String item1 = Jelly1.getItem();
		String item2 = Jelly2.getItem();
		int price1 = Jelly1.getPrice();
		int price2 = Jelly2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "円");
		System.out.println(item2 + " " + price2 + "円");
		System.out.println("合計" + sum + "円");
	}
}