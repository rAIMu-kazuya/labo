/**
 * 
 * @question �|�e�g�`�b�v�X�@�i��o���@PotatoChips.java, Gum.java�j
 * 
 * ���̖��́C���َq(�|�e�g�`�b�v�X, �K��)�������v���O�����ł��D (1)�`(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} PotatoChips ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass PotatoChips1
 * scale 1.2
 * align center
 * class PotatoChips
 *
 * @subquestion �N���X�} Gum ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Gum1
 * scale 1.2
 * align center
 * class Gum
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� GumMain.java ���쐬���Ȃ����D
 * 
 * @execution GumMain
 * 
 * @source GumMain
 * 
 * @subquestion API�d�l�@Gum�@�𖞑�����悤�Ɂ@Gum.java�@���������Ȃ����D
 * 
 * @api Gum
 * 
 * @author miura
 * 
 */
public class GumMain {
	public static void main(String[] args) {
		Gum Gum1 = new Gum(100);
		Gum Gum2 = new Gum(150);
		
		String item1 = Gum1.getItem();
		String item2 = Gum2.getItem();
		int price1 = Gum1.getPrice();
		int price2 = Gum2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "�~");
		System.out.println(item2 + " " + price2 + "�~");
		System.out.println("���v" + sum + "�~");
	}
}