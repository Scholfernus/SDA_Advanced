package pl.sdajavapol141.SDAPowtorkaZajec;

public class MethodApp {
    public static void main(String[] args) {

        String b1 = bulka(0.1,1,4);
        String b2 = bulka(0.5,1.5,7);
        System.out.println(b2);
        System.out.println(b1);
     //   MethodApp app =new   MethodApp();
    }
    public String bulka(Ingredients ingredients){
        return "";
    }
    public static String bulka(double maka, double woda, double jajka){
        System.out.println("Weź mąkę");
        System.out.println("Wymieszaj mąkę z wodą");
        int ileBulek = (int)(maka/0.1);
        return "Bułka ".repeat(ileBulek);
    }
}
