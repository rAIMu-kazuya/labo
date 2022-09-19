public class GumMain {
	public static void main(String[] args) {
		Gum gum1 = new Gum(100);
		Gum gum2 = new Gum(150);
		
		String item1 = gum1.getItem();
		String item2 = gum2.getItem();
		int price1 = gum1.getPrice();
		int price2 = gum2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + "Å@" + price1 + "â~");
		System.out.println(item2 + "Å@" + price2 + "â~");
		System.out.println("çáåv" + sum + "â~");
	}
}