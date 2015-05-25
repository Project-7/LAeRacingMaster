package adress.model;


import java.io.Serializable;

/**
 *
 * @author MarkusH und RobertK
 * @version 1.0
 */
public abstract class Person implements Serializable{
    
    private String vorname;
    private String name;
    private String telefonnr;
    private String email;
    private String strasse_Hsnr;
    private int plz;
    private String ort;

    public Person() {
    }

    public Person(String vorname, String name, String telefonnr, String email, String strasse_Hsnr, int plz, String ort) {
        this.vorname = vorname;
        this.name = name;
        this.telefonnr = telefonnr;
        this.email = email;
        this.strasse_Hsnr = strasse_Hsnr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStrasse_Hsnr() {
        return strasse_Hsnr;
    }

    public void setStrasse_Hsnr(String strasse_Hsnr) {
        this.strasse_Hsnr = strasse_Hsnr;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    
    
    
    
    
    
}
