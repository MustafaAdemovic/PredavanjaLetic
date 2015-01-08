
public class NodeTest {

	public static void main(String[] args) {
		NodeList list = new NodeList();
		
		list.add(new Node(0));
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(4));
		list.add(new Node(5));
		list.add(new Node(6));
		list.add(new Node(7));
		list.add(new Node(8));
		list.add(new Node(9));
		list.add(new Node(10));
		System.out.println(list.toString());
		list.remove(9);
		
		System.out.println(list.toString());
		list.remove(0);
		System.out.println(list.toString());
		
		Node array[] = list.toArray();
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i] + " ");
		}

	}

}
