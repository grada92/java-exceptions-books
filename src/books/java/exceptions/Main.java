package books.java.exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
			
		// SCANNER
		Scanner s = new Scanner(System.in);
	
		// VARIABILI LIBRO
		
		String title="";
		int pages=0;
		String author="";
		String editor="";
		Book newBook;
		
		int n = 0;
		
		// CHIEDO A UTENTE NUMERO LIBRI
		
		System.out.print("Quanti libri vuoi comprare?");
		n = s.nextInt();
		s.nextLine();
		
		
		Book[] library = new Book[n];
		
			try {
				for(int i = 0; i < n; i++) {
				System.out.println("Titolo del libro: " );
				title = s.nextLine().toLowerCase().trim();
				
				try {
					System.out.println("Numero di Pagine: ");
					pages = Integer.parseInt(s.nextLine());
				}catch(Exception e) {
					pages = 0;
				}
				
				System.out.println("Autore di questo libro: ");
				author = s.nextLine();
				System.out.println("Editore di questo libro: ");
				editor = s.nextLine();
				
				newBook = new Book(title, pages, author, editor);

				library[i] = newBook;
					
					for(int j = 0; j < library.length;j++) {
						System.out.println("LIBRI :" + " "+library[j]);
					}
				}
			
			// GESTIONE ERRORI
				
			}catch(Exception e) {
				System.out.printf(e.getMessage() + "%n");
				System.out.println("ERRORE! IMPOSSIBILE TROVARE LIBRO!");
				return;
				
			}
			
			// CHIUSURA SCANNER
			
			s.close();
	}

}