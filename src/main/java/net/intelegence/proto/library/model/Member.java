/**
 * Project:     library-app
 * Author:	Cem Kaan Kilic
 * Name:	$Id$
 * Revision: 	$Revision$
 * Created:	06.06.2018 10:01:46
 * Last change: 06.06.2018
 * (c) 2018 by in-telegence GmbH
 * History:
 *    $Log$
 */
package net.intelegence.proto.library.model;

import java.time.LocalDate;

/**
 * Members - TODO Cem Kaan Kilic please document me!
 *
 * @author Cem Kaan Kilic
 *
 */
public class Member {

    private String name;
    private LocalDate geburtsdatum;
    private int alter;
    private String straße;
    private int telefonnummer;
    private String memberid;
    private String passwort;

    /**
     *
     */
    public Member() {
        super();
    }
    /**
     * @param name
     * @param geburtsdatum
     * @param alter
     * @param straße
     * @param telefonnummer
     * @param memberid
     * @param passwort
     */
    public Member(String name, LocalDate geburtsdatum, int alter, String straße, int telefonnummer, String memberid, String passwort) {
        super();
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.alter = alter;
        this.straße = straße;
        this.telefonnummer = telefonnummer;
        this.memberid = memberid;
        this.passwort = passwort;
    }
    /**
     * @return the passwort
     */
    public String getPasswort() {
        return this.passwort;
    }
    /**
     * @param passwort the passwort to set
     */
    public void setPasswort(String passwort) {
        this.passwort = passwort;
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
     * @return the straße
     */
    public String getStraße() {
        return this.straße;
    }

    /**
     * @param straße the straße to set
     */
    public void setStraße(String straße) {
        this.straße = straße;
    }

    /**
     * @return the telefonnummer
     */
    public int getTelefonnummer() {
        return this.telefonnummer;
    }

    /**
     * @param telefonnummer the telefonnummer to set
     */
    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    /**
     * @return the memberid
     */
    public String getMemberid() {
        return this.memberid;
    }
    /**
     * @param memberid the memberid to set
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid;
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
        result = prime * result + (this.memberid == null ? 0 : this.memberid.hashCode());
        result = prime * result + (this.name == null ? 0 : this.name.hashCode());
        result = prime * result + (this.passwort == null ? 0 : this.passwort.hashCode());
        result = prime * result + (this.straße == null ? 0 : this.straße.hashCode());
        result = prime * result + this.telefonnummer;
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
        if (!(obj instanceof Member)) {
            return false;
        }
        Member other = (Member) obj;
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
        if (this.memberid == null) {
            if (other.memberid != null) {
                return false;
            }
        } else if (!this.memberid.equals(other.memberid)) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.passwort == null) {
            if (other.passwort != null) {
                return false;
            }
        } else if (!this.passwort.equals(other.passwort)) {
            return false;
        }
        if (this.straße == null) {
            if (other.straße != null) {
                return false;
            }
        } else if (!this.straße.equals(other.straße)) {
            return false;
        }
        if (this.telefonnummer != other.telefonnummer) {
            return false;
        }
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Member [name=" + this.name + ", geburtsdatum=" + this.geburtsdatum + ", alter=" + this.alter + ", straße=" + this.straße + ", telefonnummer=" + this.telefonnummer + ", memberid=" + this.memberid + ", passwort="
                + this.passwort + "]";
    }




    }