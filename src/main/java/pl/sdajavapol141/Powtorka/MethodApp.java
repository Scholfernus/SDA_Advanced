package pl.sdajavapol141.Powtorka;

public class MethodApp {
    public static void main(String[] args) {

        String b1 = bulka(0.1);
        String b2 = bulka(0.5);
        System.out.println(b2);
        System.out.println(b1);
    }
    public static String bulka(double maka){
        System.out.println("Weź mąkę");
        System.out.println("Wymieszaj mąkę z wodą");
        int ileBulek = (int)(maka/0.1);
        return "Bułka ".repeat(ileBulek);
    }
}
