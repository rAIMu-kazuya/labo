public class Doughnut {

	private String item = "�h�[�i�c";
	private int price;
	/**
	 * �R���X�g���N�^�ł��D����(price:int)�͉��i�ł��D
	 * 
	 * ���i(����price)���C���X�^���X�ϐ�price�ɑ�����܂��D
	 * 
	 * @param ??
	 */
	public Doughnut(int price) {
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