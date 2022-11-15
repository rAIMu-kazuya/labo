/**
 * 
 * @question �@�i��o���@Coinroll_50.java�j
 * 
 * ���̖��́C�R�C��(Coin50)��50�����ꂽ�_��(Coinroll_50)�������v���O�����ł��D (1)�`(3)�̎菇�ɂ��������āC�v���O�����̍쐬�C���s���ʂ̗\�z�����Ȃ����D
 * 
 * @subquestion �N���X�} Coinroll_50 ����\�[�X�R�[�h�𓱏o���Ȃ����D
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Coinroll_50    0 -5
 * arrow Coinroll_50ImplementsValue    
 * 
 * ��ArrayList���g�p���邽�߂Ɂ@import java.util.ArrayList;�@���K�v�ł��D
 * 
 * @clearpage
 * 
 * @source Coinroll_50.java
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
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Coinroll_50() );

		int sum = coinBox.getSum();
		System.out.println("���v" + sum + "�~");
	}
}