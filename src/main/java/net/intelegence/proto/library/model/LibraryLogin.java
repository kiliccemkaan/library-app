/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	29.06.2018 09:55:05
 * Last change: 29.06.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library.model;

/**
 * LibraryLogin - TODO Cem Kaan Kilic please document me!
 *
 * @author Cem Kaan Kilic
 *
 */
public class LibraryLogin {

    private String name;
    private Integer memberid;
    private String passwort;

    public LibraryLogin() {
        // bleibt leer
    }

    public LibraryLogin(String name, Integer memberid , String passwort) {
        super();
        this.name = name;
        this.memberid = memberid;
        this.passwort = passwort;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Integer getMemberid() {
        return this.memberid;
    }

    public final void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public final String getPasswort() {
        return this.passwort;
    }

    public final void setWohnort(String passwort) {
        this.passwort = passwort;
    }

}
