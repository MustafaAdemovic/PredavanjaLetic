package P08012015;

public class PozitivNegativ {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		printNegativPozitiv(array);
		System.out.println();
		selectionSort(array);
		System.out.println();
		printArray(array);
		
		

	}
/**
 * Ispisuje niz
 * @param array2
 */
	private static void printArray(int[] array2) {
		for(int i = 0; i < array2.length; i++){
			System.out.print(array2[i] + " ");
		}
	
		
	}
/**
 * Selektuje niz
 * @param array2
 */
	private static void selectionSort(int[] array2) {

		for (int i = 0; i < array2.length -1 ; i++) {
			for (int j = i + 1; j < array2.length; j++) {
				if (array2[j] < array2[i]) {
					int temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}

	}
/**
 * Ispisuje dva niza pozitivne i negativne
 * @param array2
 */
	public static void printNegativPozitiv(int[] array2) {

		System.out.println("Negativ numbers in array are: ");
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] < 0)
				System.out.print(array2[i] + " ");

		}

		System.out.println("\n\nPositive numbers in array are:");
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > 0)
				System.out.print(array2[i] + " ");
		}

	}

}
