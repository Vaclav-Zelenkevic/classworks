package lt.vtmc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.eisgroup.javaexam.library.Book;
import com.eisgroup.javaexam.library.Library;

public class LibraryImplementation implements Library {

	private List<Book> books = new ArrayList<>();

	@Override
	public Collection<Book> findByAuthor(String author) {
		List<Book> booksByAuthor = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				booksByAuthor.add(book);
			}
		}
		return booksByAuthor;
	}

	@Override
	public Book findByTitle(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null; // Very BAD practice!!! return new throwable
	}

	@Override
	public Collection<Book> getBooksSortedByPageCount() {
		// TODO
		return null;
	}

	@Override
	public int getNumberOfBooks() {
		return books.size();
	}

	@Override
	public void takeABook(Book book) {
		if (books.contains(book)) {

		} else {
			books.add(book);
		}
	}

}
