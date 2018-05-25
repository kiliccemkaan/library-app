/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	27.04.2018 10:16:55
 * Last change: 27.04.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library.model;

public class Book {
    // Felder (Fields)
    private String titel;

    private Autor autor;

    private String isbnNummer;

    private String beschreibung;

    private int    seitanzahl;

    // Konstruktoren (Constructor)

    public Book() {
        // empty
    }

    /**
     * @param titel
     * @param autor
     * @param isbnNummer
     * @param beschreibung
     * @param seitanzahl
     */
    public Book(String titel, Autor autor, String isbnNummer, String beschreibung, int seitanzahl) {
        super();
        this.titel = titel;
        this.autor = autor;
        this.isbnNummer = isbnNummer;
        this.beschreibung = beschreibung;
        this.seitanzahl = seitanzahl;
    }

    // Eigenschaften (Properties)

    /**
     * @param string
     * @param string2
     * @param string3
     * @param string4
     * @param i
     */
    public Book(String string, String string2, String string3, String string4, int i) {
        // TODO Auto-generated constructor stub
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return this.autor;
    }

    /**
     * @param
     *            the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor ;
    }

    /**
     * @return the isbnNummer
     */
    public String getIsbnNummer() {
        return this.isbnNummer;
    }

    /**
     * @param isbnNummer
     *            the isbnNummer to set
     */
    public void setIsbnNummer(String isbnNummer) {
        this.isbnNummer = isbnNummer;
    }

    /**
     * @return the beschreibung
     */
    public String getBeschreibung() {
        return this.beschreibung;
    }

    /**
     * @param beschreibung
     *            the beschreibung to set
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * @return the seitanzahl
     */
    public int getSeitanzahl() {
        return this.seitanzahl;
    }

    /**
     * @param seitanzahl
     *            the seitanzahl to set
     */
    public void setSeitanzahl(int seitanzahl) {
        this.seitanzahl = seitanzahl;
    }

    // Methoden (Methods)

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.autor == null ? 0 : this.autor.hashCode());
        result = prime * result + (this.beschreibung == null ? 0 : this.beschreibung.hashCode());
        result = prime * result + (this.isbnNummer == null ? 0 : this.isbnNummer.hashCode());
        result = prime * result + this.seitanzahl;
        result = prime * result + (this.titel == null ? 0 : this.titel.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        if (this.autor == null) {
            if (other.autor != null) {
                return false;
            }
        } else if (!this.autor.equals(other.autor)) {
            return false;
        }
        if (this.beschreibung == null) {
            if (other.beschreibung != null) {
                return false;
            }
        } else if (!this.beschreibung.equals(other.beschreibung)) {
            return false;
        }
        if (this.isbnNummer == null) {
            if (other.isbnNummer != null) {
                return false;
            }
        } else if (!this.isbnNummer.equals(other.isbnNummer)) {
            return false;
        }
        if (this.seitanzahl != other.seitanzahl) {
            return false;
        }
        if (this.titel == null) {
            if (other.titel != null) {
                return false;
            }
        } else if (!this.titel.equals(other.titel)) {
            return false;
        }
        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Book [titel=" + this.titel + ", autor=" + this.autor + ", isbnNummer=" + this.isbnNummer + ", beschreibung=" + this.beschreibung + ", seitanzahl=" + this.seitanzahl + "]";
    }

    /**
     * @param string
     */

}
