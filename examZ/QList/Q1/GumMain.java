/**
 * 
 * @question ポテトチップス　（提出物　PotatoChips.java, Gum.java）
 * 
 * この問題は，お菓子(ポテトチップス, ガム)を扱うプログラムです． (1)～(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 PotatoChips からソースプログラムを導出しなさい．
 * 
 * @make.inputClass PotatoChips1
 * scale 1.2
 * align center
 * class PotatoChips
 *
 * @subquestion クラス図 Gum からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Gum1
 * scale 1.2
 * align center
 * class Gum
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム GumMain.java を作成しなさい．
 * 
 * @execution GumMain
 * 
 * @source GumMain
 * 
 * @subquestion API仕様　Gum　を満足するように　Gum.java　を実装しなさい．
 * 
 * @api Gum
 * 
 * @author miura
 * 
 */
public class GumMain {
	public static void main(String[] args) {
		Gum Gum1 = new Gum(100);
		Gum Gum2 = new Gum(150);
		
		String item1 = Gum1.getItem();
		String item2 = Gum2.getItem();
		int price1 = Gum1.getPrice();
		int price2 = Gum2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "円");
		System.out.println(item2 + " " + price2 + "円");
		System.out.println("合計" + sum + "円");
	}
}