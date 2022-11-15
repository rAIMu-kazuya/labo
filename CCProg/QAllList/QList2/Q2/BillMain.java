/**
 * 
 * @question �@�i��o���@Bill.java�j
 * 
 * ���̖��́C1���~����(Bill)�������v���O�����ł��D (1)�`(3)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Bill ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass CoinrollMain1
 * align center
 * class Value   0  0
 * class Bill    0 -5
 * arrow BillImplementsValue
 * 
 * @image 10000.png
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
 * @subquestion API�d�l�@Bill�@�𖞑�����悤�Ɂ@Bill.java�@���������Ȃ����D
 * 
 * @api Bill
 * 
 * @author miura
 * 
 */
public class BillMain {
	public static void main(String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new CoinAAA() );
		coinBox.add( new CoinAAA() );
		coinBox.add( new CoinBB() );
		coinBox.add( new Bill() );

		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("���v" + sum + "�~");
	}
}