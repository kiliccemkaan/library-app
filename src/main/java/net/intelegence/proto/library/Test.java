/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	27.04.2018 15:05:33
 * Last change: 27.04.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.intelegence.proto.library.model.Autor;
import net.intelegence.proto.library.model.Book;

/**
 * Test - TODO Cem Kaan Kilic please document me!
 *
 * @author Cem Kaan Kilic
 *
 */
public class Test {

    private static final Logger LOG = LoggerFactory.getLogger(Test.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        Autor peter = new Autor();
        peter.setName("Peter Mafay");

        peter.setGeburtsdatum(LocalDate.of(1985, 04, 30));

        Book book = new Book();
        book.setTitel("mein Titel");
        book.setAutor(peter);


        LOG.debug("mein Buch: {}", book);

        Book book2 = new Book("mein zweiter titel", "Bernd Autor", "222-4565", "Ein Geschichte über die Insel Java", 12);
        book2.setTitel("werfwerfwefrewf");

        System.out.println("Mein Buch: " + book2);
        System.out.println("mein Titel:" + book2.getTitel());

        System.out.println("Mein Autor:" + book2.getAutor());

    }

}
