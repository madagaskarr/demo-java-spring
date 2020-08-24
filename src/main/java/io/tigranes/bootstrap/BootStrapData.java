package io.tigranes.bootstrap;

import io.tigranes.model.Author;
import io.tigranes.model.Book;
import io.tigranes.repos.AuthorRepository;
import io.tigranes.repos.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author tigran = new Author("Tigran","Ghazinyan",new HashSet<>());
        Book introductionToPhotography = new Book("Introduction to Photography","145095234874",new HashSet<>());
        tigran.getBooks().add(introductionToPhotography);
        introductionToPhotography.getAuthors().add(tigran);

        authorRepository.save(tigran);
        bookRepository.save(introductionToPhotography);


    }
}
