package day09_practice.restourant;

public class Mutfak {

    public  String yemekler="Adana Kebap, Urfa Ciger, Kusbasi, Kusleme";
    public  String araSicak="Yayla corba, mercimek, dugun corba, corba";
    public  String tatlilar="baklava, sutlac, gullac, kazandibi, kunefe";
    public  String icecekler="ayran,salgam,kola";

    public Mutfak(String AdanaKebap, String mercimek, String kunefe, String salgam) {

        this.yemekler=AdanaKebap;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;

    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
