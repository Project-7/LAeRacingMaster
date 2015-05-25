package adress.model;


import java.io.Serializable;

/**
 *
 * @author MarkusH und RobertK
 * @version 1.0
 */
public class Mitglied extends Person implements Serializable{
    
    private int mitgliederID;
    private int angemeldet;
    private String email_eRacing;
    private String fuehrerschein;
    private String vermerk;
    private int werkstattregeln;
    private int serverzugang;
    private String staatsangehoerigkeit;
    private int foto_vorhanden;
    private String Position;
    //private Object con = ERacing_Main.verbindungsaufbau();

    public int getMitgliederID() {
        return mitgliederID;
    }

    public int isAngemeldet() {
        return angemeldet;
    }

    public String getEmail_eRacing() {
        return email_eRacing;
    }

    public String getFuehrerschein() {
        return fuehrerschein;
    }

    public String getVermerk() {
        return vermerk;
    }

    public int isWerkstattregeln() {
        return werkstattregeln;
    }

    public int isServerzugang() {
        return serverzugang;
    }

    public String getStaatsangehoerigkeit() {
        return staatsangehoerigkeit;
    }

    public int isFoto_vorhanden() {
        return foto_vorhanden;
    }

    public String getPosition() {
        return Position;
    }

    public void setAngemeldet(int angemeldet) {
        this.angemeldet = angemeldet;
    }

    public void setEmail_eRacing(String email_eRacing) {
        this.email_eRacing = email_eRacing;
    }

    public void setFuehrerschein(String fuehrerschein) {
        this.fuehrerschein = fuehrerschein;
    }

    public void setVermerk(String vermerk) {
        this.vermerk = vermerk;
    }

    public void setWerkstattregeln(int werkstattregeln) {
        this.werkstattregeln = werkstattregeln;
    }

    public void setServerzugang(int serverzugang) {
        this.serverzugang = serverzugang;
    }

    public void setStaatsangehoerigkeit(String staatsangehoerigkeit) {
        this.staatsangehoerigkeit = staatsangehoerigkeit;
    }

    public void setFoto_vorhanden(int foto_vorhanden) {
        this.foto_vorhanden = foto_vorhanden;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public Mitglied(){
           //default constr
    }
    
    public Mitglied(String vorname, String name, String telefonnr, String email, String strasse_Hsnr, int plz, String ort,int angemeldet, String email_eRacing, String fuehrerschein, String vermerk, int werkstattregeln, int serverzugang, String staatsangehoerigkeit, int foto_vorhanden, String Position) {
        super(vorname, name, telefonnr, email, strasse_Hsnr, plz, ort);
        this.angemeldet = angemeldet;
        this.email_eRacing = email_eRacing;
        this.fuehrerschein = fuehrerschein;
        this.vermerk = vermerk;
        this.werkstattregeln = werkstattregeln;
        this.serverzugang = serverzugang;
        this.staatsangehoerigkeit = staatsangehoerigkeit;
        this.foto_vorhanden = foto_vorhanden;
        this.Position = Position;
    } 

    /**
     *
     * @param mitgliederID Fortlaufende, eindeutige Nummer des Mitglieds. Beginnend ab 1000. In Datenbank Autoincrement (AI)
     * @param vorname
     * @param name
     * @param telefonnr
     * @param email
     * @param strasse_Hsnr
     * @param plz
     * @param ort
     * @param angemeldet
     * @param email_eRacing
     * @param fuehrerschein
     * @param vermerk
     * @param werkstattregeln
     * @param serverzugang
     * @param staatsangehoerigkeit
     * @param foto_vorhanden
     * @param Position
     */
    public Mitglied(int mitgliederID, String vorname, String name, String telefonnr, String email, String strasse_Hsnr, int plz, String ort,int angemeldet, String email_eRacing, String fuehrerschein, String vermerk, int werkstattregeln, int serverzugang, String staatsangehoerigkeit, int foto_vorhanden, String Position) {
        super(vorname, name, telefonnr, email, strasse_Hsnr, plz, ort);
        this.mitgliederID= mitgliederID;
        this.angemeldet = angemeldet;
        this.email_eRacing = email_eRacing;
        this.fuehrerschein = fuehrerschein;
        this.vermerk = vermerk;
        this.werkstattregeln = werkstattregeln;
        this.serverzugang = serverzugang;
        this.staatsangehoerigkeit = staatsangehoerigkeit;
        this.foto_vorhanden = foto_vorhanden;
        this.Position = Position;
    }
}
