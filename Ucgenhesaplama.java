import java.util.Scanner;

public class Ucgenhesaplama {
    public static void main(String[] args){
    //-----------DEĞŞKENLER TANIMLANDI---------------
        double akenar, bkenar, ckenar;

    //-----------İNPUT İÇİN TANIMLAMALAR YAPILDI------------
        Scanner input = new Scanner(System.in);
        System.out.print("A kenar uzunluğunu giriniz: ");
        akenar = input.nextInt();
        System.out.print("B kenar uzunluğunu giriniz: ");
        bkenar = input.nextInt();
        System.out.print("C kenar uzunluğunu giriniz: ");
        ckenar = input.nextInt();

    //---------------HESAPLAMALAR İÇİN FORMULLER BELİRLENDİ-------
        double uformul = (akenar + bkenar + ckenar)/2;
        double ucgencevre = 2*uformul;
        System.out.println("Üçgenin çevresi: "+ucgencevre);
        double hipotenus = Math.sqrt ((akenar * akenar) + (bkenar * bkenar));
        System.out.println("Üçgenin Hipotenüsü: "+ hipotenus);
        double alan = Math.sqrt(uformul * (ucgencevre - akenar) * (ucgencevre - bkenar) * (ucgencevre - ckenar));
        System.out.println("Üçgenin Alanı: "+alan);





    }
}
