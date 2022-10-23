/**
 * 
 * @question ラケット　（提出物　Racket.java, Ball.java）
 * 
 * この問題は，商品(ラケット, ボール)を扱うプログラムです． (1)から(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 Racket からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Racket1
 * scale 1.2
 * align center
 * class Racket
 *
 * @subquestion クラス図 Ball からソースプログラムを導出しなさい．
 * 
 * @make.inputClass Ball1
 * scale 1.2
 * align center
 * class Ball
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム BallMain.java を作成しなさい．
 * 
 * @execution BallMain
 * 
 * @source BallMain.java
 * 
 * @subquestion API仕様　Ball　を満足するように　Ball.java　を実装しなさい．
 * 
 * @api Ball
 * 
 * @author miura
 * 
 */
public class BallMain {
	public static void main(String[] args) {
		Ball Ball1 = new Ball(1);
		Ball Ball2 = new Ball(2);
		
		String item1 = Ball1.getItem();
		String item2 = Ball2.getItem();
		int weight1 = Ball1.getWeight();
		int weight2 = Ball2.getWeight();
		int sum = weight1 + weight2;
		System.out.println(item1 + " " + weight1 + "kg");
		System.out.println(item2 + " " + weight2 + "kg");
		System.out.println("合計" + sum + "kg");
	}
}