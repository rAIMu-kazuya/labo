public class Ball {

	private String item = "ボール";
	private int weight;
	/**
	 * コンストラクタです．引数(weight:int)は重さです．
	 * 
	 * 重さ(引数weight)をインスタンス変数weightに代入します．
	 * 
	 * @param ??
	 */
	public Ball(int weight) {
    this.weight = weight;
	}
	/**
	 * 品名を返却します．
	 * 
	 * インスタンス変数itemを返却します．
	 * 
	 * @return
	 */
	public String getItem() {
		return item;
	}
	/**
	 * 重さを返却します．
	 * 
	 * インスタンス変数weightを返却します．
	 * 
	 * @return
	 */
	public int getWeight() {
		return this.weight;
	}
}