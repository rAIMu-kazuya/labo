/**
 * 
 * @question クレープ　（提出物　Crepe.java, Doughnut.java）
 * 
 * この問題は，お菓子(クレープ, ドーナツ)を扱うプログラムです． (1)～(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Crepe からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Crepe1
 * scale 1.2
 * align center
 * class Crepe
 *
 * @subquestion クラス図 Doughnut からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Doughnut1
 * scale 1.2
 * align center
 * class Doughnut
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム DoughnutMain.java を作成しなさい．
 * 
 * @execution DoughnutMain
 * 
 * @source DoughnutMain.java
 * 
 * @subquestion API仕様　Doughnut　を満足するように　Doughnut.java　を実装しなさい．
 * 
 * @api Doughnut
 * 
 * @author miura
 * 
 */
public class DoughnutMain {
	public static void main(String[] args) {
		Doughnut Doughnut1 = new Doughnut(150);
		Doughnut Doughnut2 = new Doughnut(400);
		
		String item1 = Doughnut1.getItem();
		String item2 = Doughnut2.getItem();
		int price1 = Doughnut1.getPrice();
		int price2 = Doughnut2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "円");
		System.out.println(item2 + " " + price2 + "円");
		System.out.println("合計" + sum + "円");
	}
}