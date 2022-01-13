package at.htl.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name="personSeqGen", initialValue = 1000)
public class Person implements Serializable {

    @Id
    @GeneratedValue(generator = "personSeqGen")
    private Integer id;

    @Column(length = 30)
    private String vorname;

    @Column(length = 30, nullable = false)
    private String nachname;
    private String strasse;
    private String hausnr;
    private String plz;
    private String ort;

    public Person(Integer id, String vorname, String nachname, String strasse, String hausnr, String plz, String ort) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
    }

    public Person() {

    }

    //<editor-fold desc="Getter / Setter">
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    //</editor-fold>
}