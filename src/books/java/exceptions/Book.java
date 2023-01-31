package books.java.exceptions;

public class Book {
	
	protected String title;
	protected int pages;
	protected String author;
	protected String editor;
	
	// COSTRUTTORE
	
	public Book(String title, int pages, String author, String editor) throws Exception {
		super();
		this.title = title;
		validateTitle(title);
		this.pages = pages;
		validatePages(pages);
		this.author = author;
		validateAuthor(author);
		this.editor = editor;
		validateEditor(editor);
	}
	
	//VALIDAZIONE TITOLO
	
	public void validateTitle(String title) throws Exception {
		if(title.length()==0) {
			
			throw new Exception("Titolo non valido!");
		}
	}
	
	// VALIDAZIONE PAGINA
	public void validatePages(int pages) throws Exception {
		if(pages == 0) {
			
			throw new Exception("Inserire Pagine Correttamente!");
		}
	}
	// VALIDAZIONE AUTORE
	public void validateAuthor(String author) throws Exception {
		if(author.length()==0) {
			
			throw new Exception("Inserire Autore Correttamente!");
		}
	}
	
	// VALIDAZIONE EDITORE 
	public void validateEditor(String editor) throws Exception {
		if(author.length()==0) {
			
			throw new Exception("Inserire Editore Correttamente!");
		}
	}
	
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "LIBRO:" + title + ", PAGINE:" + pages + ", author:" + author;
	}
	
	
	//GETTERS AND SETTERS

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	

	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}
	

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
	

	
}