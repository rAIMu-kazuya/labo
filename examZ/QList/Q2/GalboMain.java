/**
 * 
 * @question �|�b�L�[�@�i��o���@Pocky.java, Galbo.java�j
 * 
 * ���̖��́C���َq(�|�b�L�[, �K���{)�������v���O�����ł��D (1)�`(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Pocky ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Pocky1
 * scale 1.2
 * align center
 * class Pocky
 *
 * @subquestion �N���X�} Galbo ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Galbo1
 * scale 1.2
 * align center
 * class Galbo
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� GalboMain.java ���쐬���Ȃ����D
 * 
 * @execution GalboMain
 * 
 * @source GalboMain
 * 
 * @subquestion API�d�l�@Galbo�@�𖞑�����悤�Ɂ@Galbo.java�@���������Ȃ����D
 * 
 * @api Galbo
 * 
 * @author miura
 * 
 */
public class GalboMain {
	public static void main(String[] args) {
		Galbo Galbo1 = new Galbo(100);
		Galbo Galbo2 = new Galbo(150);
		
		String item1 = Galbo1.getItem();
		String item2 = Galbo2.getItem();
		int price1 = Galbo1.getPrice();
		int price2 = Galbo2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "�~");
		System.out.println(item2 + " " + price2 + "�~");
		System.out.println("���v" + sum + "�~");
	}
}