package P13012015;

public class MyTreeOfStrings {
	private String data;
	private MyTreeOfStrings left;
	private MyTreeOfStrings right;

	public MyTreeOfStrings() {
		data = null;
		left = null;
		right = null;

	}

	public MyTreeOfStrings(String data) {
		this.data = data;
		left = null;
		right = null;

	}

	public String getData() {
		return data;

	}

	public void setData(String data) {
		this.data = data;

	}

	public MyTreeOfStrings getLeft() {
		return left;

	}

	public MyTreeOfStrings getRight() {
		return right;

	}

	public void add(String data) {
		if (this.data == null) {
			this.data = data;
			return;
		}
		if (this.data.compareToIgnoreCase(data) > 0) {
			if (left == null) {
				left = new MyTreeOfStrings(data);

			} else {
				left.add(data);
			}

		} else {
			if (right == null) {
				right = new MyTreeOfStrings(data);

			} else {
				right.add(data);

			}

		}

	}

	public void preOrderPrint() {

		System.out.println(data);
		if (left != null)
			left.preOrderPrint();

		if (right != null)
			right.preOrderPrint();

	}

	public void postOrderPrint() {

		System.out.println(data);
		if (right != null)
			right.preOrderPrint();

		if (left != null)
			left.preOrderPrint();

	}

	public void inOrderPrint() {

		if (left != null)
			left.preOrderPrint();

		System.out.println(data);

		if (right != null)
			right.preOrderPrint();

	}

}
