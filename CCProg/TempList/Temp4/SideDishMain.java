/**
 * 
 * @question TempCB　（提出物： SideDish.java, FriedFood.java,MisoSoup.java）
 * 
 * この問題は，「おかず（SideDish）」「フライ（FriedFood）」「みそ汁（MisoSoup）」を扱うプログラムです．（１）～（４）の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 SideDish, FriedFood, MisoSoup からソースコードを導出しなさい．
 * 
 * @make.inputClass SideDish1
 * scale 1.2
 * align center
 * class SideDish
 * 
 * @make.inputClass FriedFood1
 * scale 1.2
 * align center
 * class FriedFood
 * 
 * @make.inputClass MisoSoup1
 * scale 1.2
 * align center
 * class MisoSoup
 * 
 * @clearpage
 * 
 * @make.inputClass SideDishMain1
 * align center
 * class SideDish   0  0
 * class FriedFood    -4 -5
 * class MisoSoup 4 -5
 * arrow FriedFoodImplementsSideDish     0 -2.5
 * arrow MisoSoupImplementsSideDish 0 -2.5
 * 
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム SideDishMain.java を作成しなさい．
 * 
 * @execution SideDishMain
 * 
 * @source SideDishMain.java
 * 
 * @subquestion API仕様 FriedFood を満足するように FriedFood.java を実装しなさい．
 * 
 * @api FriedFood
 * 
 * @subquestion API仕様 MisoSoup を満足するように MisoSoup.java を実装しなさい．
 * 
 * @api MisoSoup
 * 
 * @author arai
 * 
 */
public class SideDishMain{
    public static void main(String[] args){
        SideDish sideDish1 = new FriedFood("あじ", 200);
        SideDish sideDish2 = new MisoSoup("野菜", 100);
        System.out.println(sideDish1.getFood());
        System.out.println(sideDish1.getPrice());
        System.out.println(sideDish1.getName());
        sideDish1.print();
        sideDish2.print();
    }
}