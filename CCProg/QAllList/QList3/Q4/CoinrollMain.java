/**
 * 
 * @question �@�i��o���@Coinroll.java�j
 * 
 * ���̖��́C�R�C��(CoinAAA)��50�����ꂽ�_��(Coinroll)�������v���O�����ł��D (1)�`(3)�̎菇�ɂ��������āC�v���O�����̍쐬�C���s���ʂ̗\�z�����Ȃ����D
 * 
 * @subquestion �N���X�} Coinroll ����\�[�X�R�[�h�𓱏o���Ȃ����D
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Coinroll    0 -5
 * arrow CoinrollImplementsValue  0 -3 
 * 
 * ��ArrayList���g�p���邽�߂Ɂ@import java.util.ArrayList;�@���K�v�ł��D
 * 
 * @clearpage
 * 
 * @source Coinroll.java
 * 
 * @subquestion �ȉ��̃\�[�X�R�[�h CoinrollMain.java �̎��s���ʂ�\�z���Ȃ����D
 * 
 * @source CoinrollMain.java
 * @source CoinAAA.java
 * @source CoinBB.java
 * 
 * @author miura
 * 
 */
public class CoinrollMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new CoinBB() );
		coinBox.add( new CoinBB() );
		coinBox.add( new CoinBB() );
		coinBox.add( new Coinroll() );

		int sum = coinBox.getSum();
		System.out.println("���v" + sum + "�~");
	}
}