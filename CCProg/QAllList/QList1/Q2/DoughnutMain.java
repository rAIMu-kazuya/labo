/**
 * 
 * @question �N���[�v�@�i��o���@Crepe.java, Doughnut.java�j
 * 
 * ���̖��́C���َq(�N���[�v, �h�[�i�c)�������v���O�����ł��D (1)�`(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Crepe ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Crepe1
 * scale 1.2
 * align center
 * class Crepe
 *
 * @subquestion �N���X�} Doughnut ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Doughnut1
 * scale 1.2
 * align center
 * class Doughnut
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� DoughnutMain.java ���쐬���Ȃ����D
 * 
 * @execution DoughnutMain
 * 
 * @source DoughnutMain.java
 * 
 * @subquestion API�d�l�@Doughnut�@�𖞑�����悤�Ɂ@Doughnut.java�@���������Ȃ����D
 * 
 * @api Doughnut
 * 
 * @author miura
 * 
 */
public class DoughnutMain {
	public static void main(String[] args) {
		Doughnut Doughnut1 = new Doughnut(150);
		Doughnut Doughnut2 = new Doughnut(400);
		
		String item1 = Doughnut1.getItem();
		String item2 = Doughnut2.getItem();
		int price1 = Doughnut1.getPrice();
		int price2 = Doughnut2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "�~");
		System.out.println(item2 + " " + price2 + "�~");
		System.out.println("���v" + sum + "�~");
	}
}