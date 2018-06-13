/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	06.06.2018 09:02:41
 * Last change: 06.06.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library;

/**
 * BookControl - TODO Cem Kaan Kilic please document me!
 *
 * @author Cem Kaan Kilic
 *
 */
public class BookControl {
    private boolean BuchVorhanden;

    public boolean überprüfen() {
        boolean buchNichtAusgeliehen=true;
        if (buchNichtAusgeliehen){
            return this.BuchVorhanden = true;
        }else {
            return this.BuchVorhanden = false;

        }
    }

}

//Methode BuchNichtAusgeliehen