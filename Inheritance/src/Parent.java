
public class Parent {
	
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	void display() {
		System.out.println("Hii, I am parent");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
	}
	
}
