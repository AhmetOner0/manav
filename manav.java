package patikadev;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5,toplam;
        
        System.out.print("kaç kg elma aldığınızı yazınız: ");
        elma = inp.nextDouble();

        System.out.print("kaç kg armut aldığınızı yazınız: ");
        armut = inp.nextDouble();

        System.out.print("kaç kg domates aldığınızı yazınız: ");
        domates = inp.nextDouble();

        System.out.print("kaç kg muz aldığınızı yazınız: ");
        muz = inp.nextDouble();

        System.out.print("kaç kg patlıcan aldığınızı yazınız: ");
        patlıcan = inp.nextDouble();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlıcan * 5);
        System.out.print("toplam ücret: "+toplam);








    }
}
