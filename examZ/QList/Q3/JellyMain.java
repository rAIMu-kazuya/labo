/**
 * 
 * @question �N�b�L�[�@�i��o���@Cookie.java, Jelly.java�j
 * 
 * ���̖��́C���َq(�N�b�L�[, �[���[)�������v���O�����ł��D (1)�`(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Cookie ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Cookie1
 * scale 1.2
 * align center
 * class Cookie
 *
 * @subquestion �N���X�} Jelly ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Jelly1
 * scale 1.2
 * align center
 * class Jelly
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� JellyMain.java ���쐬���Ȃ����D
 * 
 * @execution JellyMain
 * 
 * @source JellyMain
 * 
 * @subquestion API�d�l�@Jelly�@�𖞑�����悤�Ɂ@Jelly.java�@���������Ȃ����D
 * 
 * @api Jelly
 * 
 * @author miura
 * 
 */
public class JellyMain {
	public static void main(String[] args) {
		Jelly Jelly1 = new Jelly(100);
		Jelly Jelly2 = new Jelly(150);
		
		String item1 = Jelly1.getItem();
		String item2 = Jelly2.getItem();
		int price1 = Jelly1.getPrice();
		int price2 = Jelly2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1 + "�~");
		System.out.println(item2 + " " + price2 + "�~");
		System.out.println("���v" + sum + "�~");
	}
}