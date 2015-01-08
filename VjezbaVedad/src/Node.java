
public class Node {
	private int value;
	private Node next;
	
	public Node(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node other){
		this.next = other;
	
	}
	@Override
	public String toString() {
		return "" + value;
	}

}
