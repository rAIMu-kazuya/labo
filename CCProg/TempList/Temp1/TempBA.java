/**
 * 
 * @question TempCB�@�i��o���@TempCA.java, TempAA.java�j
 * 
 * ���̖��́CTempIB(TempCB, TempAB)�������v���O�����ł��D (1)�`(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} TempCA ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass TempCA1
 * scale 1.2
 * align center
 * class TempCA
 *
 * @subquestion �N���X�} TempAA ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass TempAA1
 * scale 1.2
 * align center
 * class TempAA
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� TempBA.java ���쐬���Ȃ����D
 * 
 * @execution TempBA
 * 
 * @source TempBA.java
 * 
 * @subquestion API�d�l�@TempAA�@�𖞑�����悤�Ɂ@TempAA.java�@���������Ȃ����D
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
		System.out.println("���v" + sum + "TempHB");
	}
}