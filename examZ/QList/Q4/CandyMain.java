/**
 * 
 * @question �}�V���}���@�i��o���@Mashmallow.java, Candy.java�j
 * 
 * ���̖��́C���َq(�}�V���}��, �L�����f�B)�������v���O�����ł��D (1)�`(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Mashmallow ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Mashmallow1
 * scale 1.2
 * align center
 * class Mashmallow
 *
 * @subquestion �N���X�} Candy ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Candy1
 * scale 1.2
 * align center
 * class Candy
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� CandyMain.java ���쐬���Ȃ����D
 * 
 * @execution CandyMain
 * 
 * @source CandyMain
 * 
 * @subquestion API�d�l�@Candy�@�𖞑�����悤�Ɂ@Candy.java�@���������Ȃ����D
 * 
 * @api Candy
 * 
 * @author miura
 * 
 */
public class CandyMain {
	public static void main(String[] args) {
		Candy Candy1 = new Candy(100);
		Candy Candy2 = new Candy(150);
		
		String item1 = Candy1.getItem();
		String item2 = Candy2.getItem();
		int price1 = Candy1.getPrice();
		int price2 = Candy2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "�~");
		System.out.println(item2 + " " + price2 + "�~");
		System.out.println("���v" + sum + "�~");
	}
}