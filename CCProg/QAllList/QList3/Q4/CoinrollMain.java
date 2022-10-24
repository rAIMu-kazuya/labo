/**
 * 
 * @question �@�i��o���@Coinroll_100.java�j
 * 
 * ���̖��́C�R�C��(Coin100)��50�����ꂽ�_��(Coinroll_100)�������v���O�����ł��D (1)����(3)�̎菇�ɂ��������āC�v���O�����̍쐬�C���s���ʂ̗\�z�����Ȃ����D
 * 
 * @subquestion �N���X�} Coinroll_100 ����\�[�X�R�[�h�𓱏o���Ȃ����D
 * 
 * @make.inputClass Value
 * scale 1.2
 * align center
 * class Value
 * 
 * �I�I�I�I�����ɖ��
 * 
 * @make.inputClass Coinroll_100
 * scale 1.2
 * align center
 * class Coinroll_100
 * 
 * ��ArrayList���g�p���邽�߂Ɂ@import java.util.ArrayList;�@���K�v�ł��D
 * 
 * @clearpage
 *
 * @subquestion API�d�l�@Coinroll_100�@�𖞑�����悤�Ɂ@Coinroll_100.java�@���������Ȃ����D
 * 
 * @api Coinroll_100
 * 
 * @subquestion �ȉ��̃\�[�X�R�[�h CoinrollMain.java �̎��s���ʂ�\�z���Ȃ����D
 * 
 * @source CoinrollMain.java
 * 
 * @author miura
 * 
 */
public class CoinrollMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new Coin50() );
		coinBox.add( new Coin50() );
		coinBox.add( new Coin50() );
		coinBox.add( new Coinroll_100() );

		int sum = coinBox.getSum();
		System.out.println("���v" + sum + "�~");
	}
}