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