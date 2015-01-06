import java.util.Arrays;

import javax.print.attribute.standard.PrinterState;

public class DinamicArrayOfStringTest {

	public static void main(String[] args) {
		DinamicArrayOfString aaa = new DinamicArrayOfString(1);

		aaa.add("Prvi");
		printState(aaa);

		aaa.add("Drugi");

		aaa.add("Treci");

		aaa.add("Peti");
	}

	public static void printState(DinamicArrayOfString aaa) {
		for (int i = 0; i < aaa.getMyCount(); i++) {
			System.out.println(aaa.getAt(i) + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(aaa.get()));
		System.out.println("Size of dinamical array is: " + aaa.getMyCount());
		System.out.println("Size of array length is: " + aaa.getMyArrayLength());
		System.out.println();

	}

}
