package net.intelegence.proto.library.model;

import java.time.LocalDate;

// * Project:     library-app


public class Autor {

    private LocalDate geburtsdatum;
    private int alter;
    private String name;



    /**
     *
     */
    public Autor() {
        super();
    }

    /**
     * @param geburtsdatum
     * @param alter
     * @param name
     */
    public Autor(LocalDate geburtsdatum, int alter, String name) {
        super();
        this.geburtsdatum = geburtsdatum;
        this.alter = alter;
        this.name = name;
    }

    /**
     * @return the geburtsdatum
     */
    public LocalDate getGeburtsdatum() {
        return this.geburtsdatum;
    }

    /**
     * @param geburtsdatum the geburtsdatum to set
     */
    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    /**
     * @return the alter
     */
    public int getAlter() {
        return this.alter;
    }
    /**
     * @param alter the alter to set
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.alter;
        result = prime * result + (this.geburtsdatum == null ? 0 : this.geburtsdatum.hashCode());
        result = prime * result + (this.name == null ? 0 : this.name.hashCode());
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
        Autor other = (Autor) obj;
        if (this.alter != other.alter) {
            return false;
        }
        if (this.geburtsdatum == null) {
            if (other.geburtsdatum != null) {
                return false;
            }
        } else if (!this.geburtsdatum.equals(other.geburtsdatum)) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Autor [geburtsdatum=" + this.geburtsdatum + ", alter=" + this.alter + ", name=" + this.name + "]";
    }




    }

