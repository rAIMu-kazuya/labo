/**
 * 
 * @question �@�i��o���@TempAA.java�j
 * 
 * ���̖��́CTempAB(TempAA)�������v���O�����ł��D (1)����(3)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} TempAA ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Value
 * scale 1.2
 * align center
 * class Value
 * 
 * �I�I�I�I�����ɖ��
 * 
 * @make.inputClass TempAA
 * scale 1.2
 * align center
 * class TempAA
 * 
 * @image TempFB
 * 
 * �@�@�@�@���摜�� http://gahag.net/000546-money-japanese-yen/ ������p
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� BillMain.java ���쐬���Ȃ����D
 * 
 * @execution BillMain
 * 
 * @source BillMain.java
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
		CoinBox coinBox = new CoinBox();
		coinBox.add( new CoinIntBB() );
		coinBox.add( new CoinIntCB() );
		coinBox.add( new CoinIntDB() );
		coinBox.add( new TempAA() );

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("���v" + sum + "�~");
	}
}