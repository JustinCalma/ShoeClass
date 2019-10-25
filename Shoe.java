public class Shoe {
	int size;
	String color;
	
	public Shoe(String color, int size ) {
		this.size = size;
		this.color = color;
	}
	
	public String getType() {
		return "shoes";
	}
	
	public String describe() {
		return color + " "+ getType() + ", size " + size;
	}
	/*
	public static void main(String[] args) {
		Shoe sh1 = new Shoe ("grey", 5);
		System.out.println(sh1.describe());
		Boot b1 = new Boot ("white", 7, 3);
		System.out.println(b1.describe());
		Sneaker s1 = new Sneaker("brown",9,10,"white");
		System.out.println(s1.describe());
	}*/
}

class Boot extends Shoe {
	int height;
	
	public Boot(String color, int size, int height) {
		super(color, size);
		this.height = height;
	}
		
	public String getType() {
		return "boots";
	}
	
	public String describe() {
		return super.describe() + ", height " + height; 
	}
}

class Sneaker extends Boot {
	String lace_color;
	
	public Sneaker(String color, int size, int height, String lace_color) {
		super(color, size, height);
		this.lace_color = lace_color;
	}
	
	public String getType() {
		return "sneakers";
	}
	
	public String describe() {
		return super.describe() + ", lace color " + lace_color; 
	}
}
	
	

