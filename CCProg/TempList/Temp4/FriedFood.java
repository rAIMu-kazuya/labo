public class FriedFood implements SideDish {
    private String food;
    private int price;
    /**
	 * �R���X�g���N�^�ł��D����(price:int)�͉��i�ł��D
	 * ��ނ�����food�ŁC���i������price�œn���܂��D
	 * ���ꂼ��C�C���X�^���X�ϐ�food�Cprice�ɑ�����܂��D
	 * 
	 * @param food
     * @param price
	 */
    public FriedFood(String food, int price) {
		this.food = food;
		this.price = price;
    }
    /**
	 * ��ނ�ԋp���܂��D
	 * 
	 * @return
	 */
    public String getFood() {
        return this.food;
    }
    /**
	 * ���i��ԋp���܂��D
	 * 
	 * @return
	 */
    public int getPrice() {
        return this.price;
    }
    /**
	 * ���O��ԋp���܂��D
	 * ���O�́C��ނƁu�t���C�v�̕������A�����C�ԋp���܂��D
	 * �i��j��ނ��u�����v�̏ꍇ�C�u�����t���C�v��ԋp���܂��D
	 * 
	 * @return
	 */
    public String getName() {
        return this.food + "�t���C";
    }
    /**
	 * ���O�Ɖ��i��\�����C���s���܂��D
	 * �i��j��ނ��u�����v,���i��200�~�̏ꍇ�C
	 * �u�����t���C200�~�v��\�����C���s���܂��D
	 * 
	 * @param
	 */
    public void print() {
		System.out.println(this.getName() + this.price + "�~");
    }
}