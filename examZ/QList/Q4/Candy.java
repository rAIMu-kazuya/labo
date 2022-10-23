public class Candy {

	private String item = "�L�����f�B";
	private int price;
	/**
	 * コンストラクタです．引数(price:int)は価格です�?
	 * 
	 * 価格(引数price)をインスタンス変数priceに代入します�?
	 * 
	 * @param ??
	 */
	public Candy(int price) {
    this.price = price;
	}
	/**
	 * 品名を返却します�?
	 * 
	 * インスタンス変数itemを返却します�?
	 * 
	 * @return
	 */
	public String getItem() {
		return item;
	}
	/**
	 * 価格を返却します�?
	 * 
	 * インスタンス変数priceを返却します�?
	 * 
	 * @return
	 */
	public int getPrice() {
		return this.price;
	}
}