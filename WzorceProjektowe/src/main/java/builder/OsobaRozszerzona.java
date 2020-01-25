package builder;

import java.util.ArrayList;
import java.util.List;

public class OsobaRozszerzona {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String adres;
    private List<OsobaRozszerzona> rodzenstwo;

    public static BuildImie rozpocznijBudowanie(){
        return new BuilderRozszerzony();
    }

    private static class BuilderRozszerzony implements BuildImie, BuildWiek, BuildNazwisko, BuildAdres, BuildProperly {
        private String imie;
        private String nazwisko;
        private int wiek;
        private String adres;
        private List<OsobaRozszerzona> rodzenstwo = new ArrayList<>();

        @Override
        public BuildNazwisko ustawImie(String imie) {
            this.imie = imie;
            return this;
        }

        @Override
        public BuildWiek ustawNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        @Override
        public BuildAdres ustawWiek(int Wiek) {
            this.wiek = wiek;
            return this;
        }

        @Override
        public BuildProperly ustawAdres(String adres) {
            this.adres = adres;
            return this;
        }

        @Override
        public BuildProperly dodajRodzenstwo(OsobaRozszerzona osobaRozszerzona) {
            this.rodzenstwo.add(osobaRozszerzona);
            return this;
        }

        @Override
        public OsobaRozszerzona build() {
            OsobaRozszerzona osobaRozszerzona = new OsobaRozszerzona();
            osobaRozszerzona.imie = this.imie;
            osobaRozszerzona.nazwisko = this.nazwisko;
            osobaRozszerzona.adres = this.adres;
            osobaRozszerzona.wiek = this.wiek;
            osobaRozszerzona.rodzenstwo = this.rodzenstwo;
            return osobaRozszerzona;
        }
    }

    public interface BuildImie {
        BuildNazwisko ustawImie(String imie);
    }

    public interface BuildNazwisko {
        BuildWiek ustawNazwisko (String nazwisko);
    }

    public interface BuildWiek {
        BuildAdres ustawWiek (int Wiek);
    }

    public interface BuildAdres {
        BuildProperly ustawAdres (String adres);
    }

    public interface BuildProperly {
        BuildProperly dodajRodzenstwo(OsobaRozszerzona osobaRozszerzona);
        OsobaRozszerzona build();
    }

}
