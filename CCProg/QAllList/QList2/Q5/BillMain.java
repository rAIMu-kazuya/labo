/**
 * 
 * @question �@�i��o���@Bill_5000.java�j
 * 
 * ���̖��́C5��~����(Bill_5000)�������v���O�����ł��D (1)����(3)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Bill_5000 ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Value
 * scale 1.2
 * align center
 * class Value
 * 
 * �I�I�I�I�����ɖ��
 * 
 * @make.inputClass Bill_5000
 * scale 1.2
 * align center
 * class Bill_5000
 * 
 * @image 5000.png
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
 * @subquestion API�d�l�@Bill_5000�@�𖞑�����悤�Ɂ@Bill_5000.java�@���������Ȃ����D
 * 
 * @api Bill_5000
 * 
 * @author miura
 * 
 */
public class BillMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Coin100() );
		coinBox.add( new Bill_5000() );

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("���v" + sum + "�~");
	}
}