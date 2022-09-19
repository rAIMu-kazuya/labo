/**
 * PotatoChips
 * �|�e�g�`�b�v�X
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
 * @source GumMain???
 * 
 * @subquestion API�d�l�@Gum�@�𖞑�����悤�Ɂ@Gum.java�@���������Ȃ����D
 * 
 * @api Gum
 * 
 * @author miura
 * 
 */
public class PotatoChips {

	private String item = "�|�e�g�`�b�v�X";
	private int price;

	public PotatoChips(int price) {

	}
	public static String getItem() {
		return "";
	}
	public static int getPrice() {
		return 0;
	}
}

public class Gum {

	private String item = "�K��";
	private int price;
	/**
	 * �R���X�g���N�^�ł��D����(price:int)�͉��i�ł��D
	 * 
	 * ���i(����price)���C���X�^���X�ϐ�price�ɑ�����܂��D
	 * 
	 * @param ??
	 */
	public Gum(int price) {
    this.price = price;
	}
	/**
	 * �i����ԋp���܂��D
	 * 
	 * �C���X�^���X�ϐ�item��ԋp���܂��D
	 * 
	 * @return
	 */
	public String getItem() {
		return item;
	}
	/**
	 * ���i��ԋp���܂��D
	 * 
	 * �C���X�^���X�ϐ�price��ԋp���܂��D
	 * 
	 * @return
	 */
	public int getPrice() {
		return this.price;
	}
}

public class GumMain {
	public static void main(String[] args) {
		Gum gum1 = new Gum(100);
		Gum gum2 = new Gum(150);
		
		String item1 = gum1.getItem();
		String item2 = gum2.getItem();
		int price1 = gum1.getPrice();
		int price2 = gum2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + "�@" + price1 + "�~");
		System.out.println(item2 + "�@" + price2 + "�~");
		System.out.println("���v" + sum + "�~");
	}
}