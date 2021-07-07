package io.tigranes.bootstrap;

import io.tigranes.model.Author;
import io.tigranes.model.Book;
import io.tigranes.model.Publisher;
import io.tigranes.repos.AuthorRepository;
import io.tigranes.repos.BookRepository;
import io.tigranes.repos.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        Author tigran = new Author("Tigran","Ghazinyan",new HashSet<>());
//        Publisher publisher = new Publisher("Antares","Melkomov 30","Yerevan","Yerevan","1213",new HashSet<>());
//        Book introductionToPhotography = new Book("Introduction to Photography","145095234874",new HashSet<>(), publisher);
//        tigran.getBooks().add(introductionToPhotography);
//        introductionToPhotography.getAuthors().add(tigran);
//
//        authorRepository.save(tigran);
//        publisherRepository.save(publisher);
//        bookRepository.save(introductionToPhotography);
//
//        System.out.println("authorRepository: number of authors - " + authorRepository.count());
//        System.out.println("publisherRepository: number of publishers - " + publisherRepository.count());
//        System.out.println("bookRepository: number of books - " + bookRepository.count());


    }
}
