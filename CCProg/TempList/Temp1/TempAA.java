public class TempAA {

	private String item = "TempAB";
	private int TempFB;
	/**
	 * �R���X�g���N�^�ł��D����(TempFB:int)��TempEB�ł��D
	 * 
	 * TempEB(����TempFB)���C���X�^���X�ϐ�TempFB�ɑ�����܂��D
	 * 
	 * @param ??
	 */
	public TempAA(int TempFB) {
    this.TempFB = TempFB;
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
	 * TempEB��ԋp���܂��D
	 * 
	 * �C���X�^���X�ϐ�TempFB��ԋp���܂��D
	 * 
	 * @return
	 */
	public int TempGB() {
		return this.TempFB;
	}
}