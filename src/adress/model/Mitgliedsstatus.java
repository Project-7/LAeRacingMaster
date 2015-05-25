package adress.model;


import java.io.Serializable;
/**
 *
 * @author MarkusH und RobertK
 * @version 1.0
 */
public class Mitgliedsstatus implements Serializable {

    private int statusID;
    private String mitglied_seit;
    private String austrittsdatum;
    private String mitgliedsstatus;

    public Mitgliedsstatus() {
    }

    public Mitgliedsstatus(int statusID, String mitglied_seit, String austrittsdatum, String mitgliedsstatus) {
        this.statusID = statusID;
        this.mitglied_seit = mitglied_seit;
        this.austrittsdatum = austrittsdatum;
        this.mitgliedsstatus = mitgliedsstatus;
    }

    public Mitgliedsstatus(String mitglied_seit, String austrittsdatum, String mitgliedsstatus) {
        this.mitglied_seit = mitglied_seit;
        this.austrittsdatum = austrittsdatum;
        this.mitgliedsstatus = mitgliedsstatus;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getMitglied_seit() {
        return mitglied_seit;
    }

    public void setMitglied_seit(String mitglied_seit) {
        this.mitglied_seit = mitglied_seit;
    }

    public String getAustrittsdatum() {
        return austrittsdatum;
    }

    public void setAustrittsdatum(String austrittsdatum) {
        this.austrittsdatum = austrittsdatum;
    }

    public String getMitgliedsstatus() {
        return mitgliedsstatus;
    }

    public void setMitgliedsstatus(String mitgliedsstatus) {
        this.mitgliedsstatus = mitgliedsstatus;
    }

}
