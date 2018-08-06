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

    private String id;

    // Felder (Fields)
    private String titel;

    private Autor autor;

    private Integer isbnNummer;

    private String beschreibung;

    private Integer    seitanzahl;

    // Konstruktoren (Constructor)

    public Book() {
        // empty
    }

    /**
     * @param titel
     * @param autor
     * @param isbnNummer
     * @param beschreibung
     * @param seitenzahl
     */
    public Book(String titel, Autor autor, Integer isbnNummer, String beschreibung, Integer seitenzahl) {
        super();
        this.titel = titel;
        this.autor = autor;
        this.isbnNummer = isbnNummer;
        this.beschreibung = beschreibung;
        this.seitanzahl = seitenzahl;
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



    // Methoden (Methods)

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the titel
     */
    public String getTitel() {
        return this.titel;
    }

    /**
     * @param titel the titel to set
     */
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
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return the isbnNummer
     */
    public Integer getIsbnNummer() {
        return this.isbnNummer;
    }

    /**
     * @param string the isbnNummer to set
     */
    public void setIsbnNummer(Integer integer) {
        this.isbnNummer = integer;
    }

    /**
     * @return the beschreibung
     */
    public String getBeschreibung() {
        return this.beschreibung;
    }

    /**
     * @param beschreibung the beschreibung to set
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * @return the seitanzahl
     */
    public Integer getSeitanzahl() {
        return this.seitanzahl;
    }

    /**
     * @param seitanzahl the seitanzahl to set
     */
    public void setSeitanzahl(Integer seitanzahl) {
        this.seitanzahl = seitanzahl;
    }

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
        result = prime * result + (this.seitanzahl == null ? 0 : this.seitanzahl.hashCode());
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
        if (this.seitanzahl == null) {
            if (other.seitanzahl != null) {
                return false;
            }
        } else if (!this.seitanzahl.equals(other.seitanzahl)) {
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



}
