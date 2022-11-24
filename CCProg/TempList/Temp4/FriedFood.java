public class FriedFood implements SideDish {
    private String food;
    private int price;
    /**
	 * コンストラクタです．引数(price:int)は価格です．
	 * 具材を引数foodで，価格を引数priceで渡します．
	 * それぞれ，インスタンス変数food，priceに代入します．
	 * 
	 * @param food
     * @param price
	 */
    public FriedFood(String food, int price) {
		this.food = food;
		this.price = price;
    }
    /**
	 * 具材を返却します．
	 * 
	 * @return
	 */
    public String getFood() {
        return this.food;
    }
    /**
	 * 価格を返却します．
	 * 
	 * @return
	 */
    public int getPrice() {
        return this.price;
    }
    /**
	 * 名前を返却します．
	 * 名前は，具材と「フライ」の文字列を連結し，返却します．
	 * （例）具材が「あじ」の場合，「あじフライ」を返却します．
	 * 
	 * @return
	 */
    public String getName() {
        return this.food + "フライ";
    }
    /**
	 * 名前と価格を表示し，改行します．
	 * （例）具材が「あじ」,価格が200円の場合，
	 * 「あじフライ200円」を表示し，改行します．
	 * 
	 * @param
	 */
    public void print() {
		System.out.println(this.getName() + this.price + "円");
    }
}