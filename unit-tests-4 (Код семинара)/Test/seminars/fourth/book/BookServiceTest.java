package seminars.fourth.book;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testFindBookById() {
        BookRepository bookRepository = mock(BookRepository.class);

        BookService bookService = new BookService(bookRepository);

        Book mockedBook = new Book("1", "Book1", "Author1");

        Mockito.when(bookRepository.findById("1")).thenReturn(mockedBook);

        Book result = bookService.findBookById("1");

        assertEquals(mockedBook, result);

        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void testFindAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);

        BookService bookService = new BookService(bookRepository);

        List<Book> mockedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );

        Mockito.when(bookRepository.findAll()).thenReturn(mockedBooks);

        List<Book> result = bookService.findAllBooks();

        assertEquals(mockedBooks, result);

        verify(bookRepository, times(1)).findAll();
    }
}