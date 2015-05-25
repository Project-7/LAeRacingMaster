package adress.model;


import java.io.Serializable;
/**
 *
 * @author MarkusH und RobertK
 * @version 1.0
 */
public class Kontodaten implements Serializable {

    private int kontoID;
    private String kreditinstitut;
    private int kontonr;
    private int blz;
    private String iban;
    private String bic;

    public Kontodaten() {
    }

    public Kontodaten(int kontoID, String kreditinstitut, int kontonr, int blz, String iban, String bic) {
        this.kontoID = kontoID;
        this.kreditinstitut = kreditinstitut;
        this.kontonr = kontonr;
        this.blz = blz;
        this.iban = iban;
        this.bic = bic;
    }

    public Kontodaten(String kreditinstitut, int kontonr, int blz, String iban, String bic) {
        this.kreditinstitut = kreditinstitut;
        this.kontonr = kontonr;
        this.blz = blz;
        this.iban = iban;
        this.bic = bic;
    }

    public int getKontoID() {
        return kontoID;
    }

    public void setKontoID(int kontoID) {
        this.kontoID = kontoID;
    }

    public String getKreditinstitut() {
        return kreditinstitut;
    }

    public void setKreditinstitut(String kreditinstitut) {
        this.kreditinstitut = kreditinstitut;
    }

    public int getKontonr() {
        return kontonr;
    }

    public void setKontonr(int kontonr) {
        this.kontonr = kontonr;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBlz() {
        return blz;
    }

    public void setBlz(int blz) {
        this.blz = blz;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

}
