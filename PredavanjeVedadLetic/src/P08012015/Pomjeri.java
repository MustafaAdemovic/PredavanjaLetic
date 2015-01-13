package P08012015;

public class Pomjeri {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			int left = a[i] + 1;

			System.out.print(left + " ");

		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			int right = a[i] - 1;
			System.out.print(right + " ");
		}

	}

}
