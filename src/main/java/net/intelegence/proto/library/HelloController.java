/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	19.04.2018 14:29:45
 * Last change: 19.04.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {
        LOG.debug("in function index!");
        int myNumber = 5;

        LOG.info("my number is {}", myNumber);

        try {

            Integer.parseInt("blubb");
        }catch(Exception e)
        {
            LOG.error("ooops {}",myNumber,  e);
        }

        return "Greetings from Spring Boot!";
    }
}

