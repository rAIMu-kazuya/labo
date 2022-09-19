/**
 * PotatoChips
 * ポテトチップス
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
 * @source GumMain???
 * 
 * @subquestion API仕様　Gum　を満足するように　Gum.java　を実装しなさい．
 * 
 * @api Gum
 * 
 * @author miura
 * 
 */
public class PotatoChips {

	private String item = "ポテトチップス";
	private int price;

	public PotatoChips(int price) {

	}
	public static String getItem() {
		return "";
	}
	public static int getPrice() {
		return 0;
	}
}

public class Gum {

	private String item = "ガム";
	private int price;
	/**
	 * コンストラクタです．引数(price:int)は価格です．
	 * 
	 * 価格(引数price)をインスタンス変数priceに代入します．
	 * 
	 * @param ??
	 */
	public Gum(int price) {
    this.price = price;
	}
	/**
	 * 品名を返却します．
	 * 
	 * インスタンス変数itemを返却します．
	 * 
	 * @return
	 */
	public String getItem() {
		return item;
	}
	/**
	 * 価格を返却します．
	 * 
	 * インスタンス変数priceを返却します．
	 * 
	 * @return
	 */
	public int getPrice() {
		return this.price;
	}
}

public class GumMain {
	public static void main(String[] args) {
		Gum gum1 = new Gum(100);
		Gum gum2 = new Gum(150);
		
		String item1 = gum1.getItem();
		String item2 = gum2.getItem();
		int price1 = gum1.getPrice();
		int price2 = gum2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + "　" + price1 + "円");
		System.out.println(item2 + "　" + price2 + "円");
		System.out.println("合計" + sum + "円");
	}
}