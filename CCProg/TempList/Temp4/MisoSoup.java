public class MisoSoup implements SideDish {
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
    public MisoSoup(String food, int price) {
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
	 * 名前は，具材と「みそ汁」の文字列を連結し，返却します．
	 * （例）具材が「野菜」の場合，「野菜みそ汁」を返却します．
	 * 
	 * @return
	 */
    public String getName() {
        return this.food + "みそ汁";
    }
    /**
	 * 名前と価格を表示し，改行します．
	 * （例）具材が「野菜」,価格が100円の場合，
	 * 「野菜みそ汁100円」を表示し，改行します．
	 * 
	 * @param
	 */
    public void print() {
        System.out.println(this.getName() + this.price + "円");
    }
}