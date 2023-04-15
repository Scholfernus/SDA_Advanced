package pl.sdajavapol141.SDAPowtorkaZajec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String kod = "334-67";
        String kod2 = "hfjdk 334-67 hhjdk, 55-080 hjkghjygj ";
        String rok = "hhgjkh  1900 hjkhjk 2022 hjk";
        Pattern pattern = Pattern.compile("(\\d\\d\\d-\\d\\d)");
        Pattern pattern1 = Pattern.compile("\\s\\d\\d\\d\\d\\s");
        Matcher matcher = pattern.matcher(kod);
        Matcher matcher2 = pattern.matcher(kod2);
        Matcher matcher1 = pattern1.matcher(rok);
        boolean CzyToKodPocztowy = matcher.matches();
        System.out.println(CzyToKodPocztowy);
        while (matcher2.find()){
            System.out.println(matcher.group());
        }
        while (matcher1.find()){
            System.out.println(matcher1.group());
        } while (matcher2.find()){
            System.out.println(matcher2.group());
        }
    }
}
