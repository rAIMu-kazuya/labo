/**
 * 
 * @question �@�i��o���@TempAA.java�j
 * 
 * ���̖��́C�R�C��(TempAB)��50�����ꂽ�_��(TempAA)�������v���O�����ł��D (1)�`(3)�̎菇�ɂ��������āC�v���O�����̍쐬�C���s���ʂ̗\�z�����Ȃ����D
 * 
 * @subquestion �N���X�} TempAA ����\�[�X�R�[�h�𓱏o���Ȃ����D
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class TempAA    0 -5
 * arrow TempAAImplementsValue    
 * 
 * ��ArrayList���g�p���邽�߂Ɂ@import java.util.ArrayList;�@���K�v�ł��D
 * 
 * @clearpage
 *
 * @subquestion API�d�l�@TempAA�@�𖞑�����悤�Ɂ@TempAA.java�@���������Ȃ����D
 * 
 * @api TempAA
 * 
 * @subquestion �ȉ��̃\�[�X�R�[�h CoinrollMain.java �̎��s���ʂ�\�z���Ȃ����D
 * 
 * @source CoinrollMain.java
 * 
 * @author miura
 * 
 */
public class TempBA {
	public static void main(String[] args) {
		TempCA coinBox = new TempCA();
		coinBox.add( new CoinIntBB() );
		coinBox.add( new CoinIntCB() );
		coinBox.add( new CoinIntDB() );
		coinBox.add( new TempAA() );

		int sum = coinBox.getSum();
		System.out.println("���v" + sum + "�~");
	}
}