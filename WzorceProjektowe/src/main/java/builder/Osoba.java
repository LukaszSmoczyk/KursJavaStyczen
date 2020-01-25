package builder;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String adres;
    private List<Osoba> rodzenstwo;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getAdres() {
        return adres;
    }

    public List<Osoba> getRodzenstwo() {
        return rodzenstwo;
    }

    // BUilder dla klasy osoby
    public static class Builder{

        private String imie;
        private String nazwisko;
        private int wiek;
        private String adres;
        private List<Osoba> rodzenstwo = new ArrayList<>();

        public Builder ustawImie(String imie){
            this.imie = imie;
            return this;
        }
        public Builder ustawNazwisko(String nazwisko){
            this.nazwisko = nazwisko;
            return this;
        }
        public Builder ustawWiek(int wiek){
            this.wiek = wiek;
            return this;
        }
        public Builder ustawAdres(String adres){
            this.adres = adres;
            return this;
        }
        public Builder dodajRodzenstwo(Osoba osoba){
            this.rodzenstwo.add(osoba);
            return this;
        }

        public Osoba build() {
            if (this.imie == null){
                throw new IllegalStateException("Musisz podać imię");
            }
            if (this.nazwisko == null){
                throw new IllegalStateException("Musisz podać nazwisko");
            }
            Osoba osoba = new Osoba();
            osoba.imie = this.imie;
            osoba.nazwisko = this.nazwisko;
            osoba.adres = this.adres;
            osoba.wiek = this.wiek;
            osoba.rodzenstwo = this.rodzenstwo;
            return osoba;
        }
    }
}
