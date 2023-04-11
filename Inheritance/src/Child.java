
public class Child extends Parent{

	void display() {
		System.out.println("I am cute Child. My name is Anupriya");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
		System.out.println(p.add(5, 6));
	}
}
