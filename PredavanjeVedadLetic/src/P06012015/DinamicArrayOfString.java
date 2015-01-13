import java.util.Arrays;

public class DinamicArrayOfString {
	private String[] myArray;
	private int myCount;
	private static final int INITIAL_NUMBER_OF_ELEMENTS = 4;

	public DinamicArrayOfString(int initialNoOfElements) {
		super();
		myArray = new String[initialNoOfElements];
		myCount = 0;
	}

	public int getMyCount() {
		return myCount;
	}
	public int getMyArrayLength() {
		return myArray.length;
	}
	

	/*
	 * Da ne pisemo isti kod u oba konstruktora this nam oznacava ovaj prvi
	 * konstruktor i u njega sada dodajemo IINITIAL_NUMBER_OF_ELEMENTS tako da
	 * imamo i u ovom drugom konstruktoru sve kao u prvom.
	 */
	public DinamicArrayOfString() {
		this(INITIAL_NUMBER_OF_ELEMENTS);
	}

	public void add(String str) {
		if (myCount == myArray.length)// ako je brojac jednak duzini niza

			myArray = Arrays.copyOf(myArray, myArray.length * 2);// prosirili
																	// smo niz
																	// za jednu
																	// njegovu
																	// duzinu
		myArray[myCount] = str;
		myCount++;
	}

	public void set(int offset, String str) {
		if (offset < 0 || offset >= myCount)
			throw new ArrayIndexOutOfBoundsException("Your offset " + offset + " doesn't belong to [0, " + (myCount - 1) + "].");
		myArray[offset] = str;
	}

	public String getAt(int offset) {
		if (offset < 0 || offset >= myCount)
			throw new ArrayIndexOutOfBoundsException("Your offset " + offset + " doesn't belong to [0, " + (myCount - 1) + "].");
		return myArray[offset];
	}

	public String[] get() {
		return Arrays.copyOf(myArray, myCount);
	}

	public void remove(int offset) {
		if (offset < 0 || offset >= myCount)
			throw new ArrayIndexOutOfBoundsException("Your offset " + offset + " doesn't belong to [0, " + (myCount - 1) + "].");
		for (int i = offset; i < myCount - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		myCount--;
		if(myCount < myArray.length /3){
			myArray = Arrays.copyOf(myArray, myArray.length / 2);
		}

	}

}
