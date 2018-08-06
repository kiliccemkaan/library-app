/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	16.07.2018 14:36:30
 * Last change: 16.07.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import net.intelegence.proto.library.model.Book;

// TODO: Auto-generated Javadoc
/**
 * BookService - TODO Cem Kaan Kilic please document me!.
 *
 * @author Cem Kaan Kilic
 */

@Service
@Validated
public class BookService {

    /** The product repository. */
    private Map<String, Book> BookRepository = new HashMap<>();


    /**
     * Instantiates a new product service.
     */
    public BookService() {
        // blank
    }

    /**
     * Gets the products.
     *
     * @return the products
     */
    public Collection<Book> getBook() {
        return this.BookRepository.values();
    }

    /**
     * Adds the product.
     *
     * @param book the book
     */
    public void addBook(@Valid @NotNull Book book) {
        if (book.getId() == null) {
            book.setId(UUID.randomUUID().toString());
        }
        this.BookRepository.put(book.getId(), book);
    }

    /**
     * Gets the product.
     *
     * @param key the key
     * @return the product
     */
    public Optional<Book> getBook(@NotNull String id) {
        return Optional.ofNullable(this.BookRepository.get(id));
    }

    /**
     * Delete product.
     *
     * @param key the key
     */
    public void deleteBook(@NotNull String id) {
        this.BookRepository.remove(id);
    }

    /**
     * @return
     */
    public Collection<Book> getBooks() {
        return this.BookRepository.values();
    }

}