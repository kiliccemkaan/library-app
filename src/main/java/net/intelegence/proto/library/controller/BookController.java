/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	29.06.2018 10:17:24
 * Last change: 29.06.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.intelegence.proto.library.model.Book;
import net.intelegence.proto.library.service.BookService;


// TODO: Auto-generated Javadoc
/**
 * The Class ProductController.
 */
@Controller
public class BookController {

    /** The product service. */
    private BookService bookService;

    /**
     * Instantiates a new product controller.
     *
     * @param productService the product service
     */
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
        // neues Object ProductService
    }

    /**
     * Gets the products.
     *
     * @param model the model
     * @return the products
     */
    @GetMapping("/booklist")
    public String getBooks(Model model) {
        model.addAttribute("books", this.bookService.getBooks());
        return "booklist";
    }

    /**
     * Adds the product.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/addBook")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "addBook";
        // gibt ein neu hinzugefügtes Produkt wieder
    }

    /**
     * Adds the product.
     *
     * @param product the product
     * @return the string
     */
    @PostMapping("/addBook")
    public String addBook(Book book) {
        this.bookService.addBook(book);
        return "redirect:/booklist";
        //
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the string
     */
    @GetMapping("book/delete/{id}")
    public String delete(@PathVariable String id) {
        this.bookService.deleteBook(id);
        return "redirect:/booklist";
    }

}
