import java.lang.reflect.Array;

/*
 * Dodavanje i brisanje clanova bolje u linkovanojlistama nego u dinamickim nizovima, a pristupanju odredjenom clanu bollje u dinamickim nizovima.
 */
public class NodeList {
	private Node first;
	
	public void add(Node element){//metoda za dodavanje clanova u listu kao parametar uzima neki broj(element) koji mu proslijedimo
		
		if(first == null){// slucaj kada nam je lista  prazna
			first = element;//ako je lista prazan kao prvi clan stavljamo element(broj) broj koji mu mi dodijelimo
		}else{
			Node current = first;//pravimo karent koji cemo pomjerati na svaki clan krenuvsi od first clana da ne bi pomijerali clan first
			while(current.getNext() != null){//Provjeravamo je li svaki sljedeci current razlicit od nule
				current = current.getNext();//ako je razlicit current nam postaje svaki sljedeci clan npr. ako je bio curent 1 s metodom getNext on postoje 2.
			}
			current.setNext(element);//metoda setNext ima zadatak da ubaci novi clan u listu
		}
		
	}

	public void remove(int index) {//metoda za brisanje kao parametar uzima index clana koji hocemo da obrisemo
		int counter = 0;//postavljamo brojac koji ima pocetnu vrijednost 0
		Node current = first;
		if(index == 0){//ako je index nula
			first = first.getNext();// prvi clan liste  postaje sljedeci clan
		}
		/*
		 * Petlja kaze sve dok je counter manji od indexa curent prebacuj na
		 * sljedeci broj, a svaki put kada prebaci current na sljedeci, counter
		 * se poveca za jedan tako da ako je index 3 counter se svaki put poveca
		 * za 1 dok ne dodje do 3 a kako se povecava caunter tako i current
		 * prelazi na sljedeci broj tako ako je index 3 brojac ce biti 3 i current 3,
		 * u ovom slucaju idemo index - 1 jer idemo do prethodnog broja, broja koji hocemo da sklonimo
		 */
		while (counter < index -1) {
			current = current.getNext();
			counter++;
		}
		/*
		 * Prethodni broj nam je prev i njemu dodijeljujemo current, remove je
		 * broj koji brisemo, next je broj poslije broja koji brisemo neki broj
		 * brisemo tako sto njega izvadimo a povezemo predhodni i sljedeci to
		 * smo uradili metodom prev.setNext(next)
		 */
		Node prev = current;
		Node remove = current.getNext();
		Node next = remove.getNext();
		prev.setNext(next);

	}
	
	public Node[] toArray() {

		Node current = first;
		int counter = 0;
		while (current != null) {
			current = current.getNext();
			counter++;
		}
		Node[] array = new Node[counter];
		Node nesto = first;
		for (int i = 0; i < array.length; i++) {
			array[i] = nesto;
			nesto = nesto.getNext();
		}
		return array;
	}
	/*
	 * Funkcija za povecanje niza *2 ako hocemo za citavu njegovu velicinu, a +1 ako hocemo samo za jedan clan
	 * koristi se u dinamickim klasama
	 */
//   public void resize(){
//		Tip [] temp = array;
//		array = new array[temp.length *2];
//		for(int i = 0; i < array.length; i++){
//			array[i] = temp[i];
//		}
//	}
	//Interator omogucava kretanje kroz niz
	//Offset direktno pristupa clanu niza
	public String toString(){
		String str = "";
		Node current = first;
		while(current != null){
			str +=" " + current.getValue();
			current = current.getNext();
		}
		return str;
	}

}
