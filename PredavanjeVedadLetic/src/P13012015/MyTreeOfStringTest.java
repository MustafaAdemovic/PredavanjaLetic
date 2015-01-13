package P13012015;

public class MyTreeOfStringTest {

	public static void main(String[] args) {
		MyTreeOfStrings a = new MyTreeOfStrings();
		
		a.add("23");
		a.add("41");
		a.add("10");
		a.add("11");
		a.add("8");
		a.add("7");
		System.out.println("Preorder");
		a.preOrderPrint();
		
		System.out.println();
		
		System.out.println("PostOrder");
		a.postOrderPrint();
		
		System.out.println();
	
		System.out.println("Inorder");
		a.inOrderPrint();
	

	}

}
