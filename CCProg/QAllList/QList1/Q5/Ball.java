public class Ball {

	private String item = "�{�[��";
	private int weight;
	/**
	 * �R���X�g���N�^�ł��D����(weight:int)�͏d���ł��D
	 * 
	 * �d��(����weight)���C���X�^���X�ϐ�weight�ɑ�����܂��D
	 * 
	 * @param ??
	 */
	public Ball(int weight) {
    this.weight = weight;
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
	 * �d����ԋp���܂��D
	 * 
	 * �C���X�^���X�ϐ�weight��ԋp���܂��D
	 * 
	 * @return
	 */
	public int getWeight() {
		return this.weight;
	}
}