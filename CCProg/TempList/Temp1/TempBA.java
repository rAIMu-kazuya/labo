/**
 * 
 * @question TempCB　（提出物　TempCA.java, TempAA.java）
 * 
 * この問題は，TempIB(TempCB, TempAB)を扱うプログラムです． (1)～(4)の手順にしたがって，プログラムを作成しなさい．
 * 
 * @subquestion クラス図 TempCA からソースプログラムを導出しなさい．
 * 
 * @make.inputClass TempCA1
 * scale 1.2
 * align center
 * class TempCA
 *
 * @subquestion クラス図 TempAA からソースプログラムを導出しなさい．
 * 
 * @make.inputClass TempAA1
 * scale 1.2
 * align center
 * class TempAA
 * 
 * @clearpage
 *
 * @subquestion 動作確認用プログラム TempBA.java を作成しなさい．
 * 
 * @execution TempBA
 * 
 * @source TempBA.java
 * 
 * @subquestion API仕様　TempAA　を満足するように　TempAA.java　を実装しなさい．
 * 
 * @api TempAA
 * 
 * @author miura
 * 
 */
public class TempBA {
	public static void main(String[] args) {
		TempAA TempAA1 = new TempAA(IntBB);
		TempAA TempAA2 = new TempAA(IntDB);
		
		String item1 = TempAA1.getItem();
		String item2 = TempAA2.getItem();
		int TempFB1 = TempAA1.TempGB();
		int TempFB2 = TempAA2.TempGB();
		int sum = TempFB1 + TempFB2;
		System.out.println(item1 + " " + TempFB1 + "TempHB");
		System.out.println(item2 + " " + TempFB2 + "TempHB");
		System.out.println("合計" + sum + "TempHB");
	}
}