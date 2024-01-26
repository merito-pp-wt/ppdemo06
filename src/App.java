import java.util.Scanner;

public class App {
	Scanner sc;  // zmienna odnosząca się do obiektu klasy Scanner

	public App() {
		sc = new Scanner(System.in);
	}

	/**
	 * Wyświetla komunikat i zwraca wczytaną linię tekstu.
	 *
	 * @param message wyświetlany komunikat
	 * @return        wczytana linia tekstu

	 */
	public String input(String message){
		System.out.print(message);
		return sc.nextLine();
	}

	public void game1() {
		String name = "Ola";
		String guess;

		System.out.println("Spróbuj zgadnąć jakie imię mam na myśli.");
		System.out.println("Jeśli tylko naciśniesz Enter - zakończysz grę");
		do {
			guess = input("Zgadnij jakie imię mam na myśli? ");
		} while( ! ( guess.equalsIgnoreCase(name) || guess.isBlank() ) );

		if(guess.equalsIgnoreCase(name)){
			System.out.println("Gratulacje! Imię odgadnięte poprawnie!");
		} else {
			System.out.println("Spróbuj jeszcze raz!");
		}
	}

	public void game2() {
		String name = "Banan";
		String guess = "";

		while( ! guess.equalsIgnoreCase(name) ) {
			guess = input("Zgadnij jaki owoc mam na myśli? ");
			if( guess.isBlank() )
				break;
		}

		if( guess.equalsIgnoreCase(name) )
			System.out.println("Gratulacje!");
		else
			System.out.println("Spróbuj jeszcze raz!");
	}

	public void game3() {
		String name = "Wtorek";
		String guess = "";

		System.out.println("Zgadnij jaki dzień tygodnia mam na myśli?\nMasz 3 próby");

		for(int i = 0; i < 3; i++) {
			guess = input("Podaj dzień tygodnia: ");
			if( guess.equalsIgnoreCase(name) || guess.isBlank() )
				break;
		}

		if( guess.equalsIgnoreCase(name) )
			System.out.println("Gratulacje! Zgadłaś!");
		else
			System.out.println("Spróbuj jeszcze raz!");
	}
}
