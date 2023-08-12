import java.util.Scanner;

public class manav{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int kiloArmut,kiloElma,kiloDomates,kiloMuz,kiloPatlican;

        System.out.println("Kaç kilo armut istersiniz?: ");
        kiloArmut=input.nextInt();
        System.out.println("Kaç kilo elma istersiniz?: ");
        kiloElma=input.nextInt();
        System.out.println("Kaç kilo domates istersiniz?: ");
        kiloDomates=input.nextInt();
        System.out.println("Kaç kilo muz istersiniz?: ");
        kiloMuz=input.nextInt();
        System.out.println("Kaç kilo patlıcan istersiniz?: ");
        kiloPatlican=input.nextInt();

        double toplam;
        double armutKgFiyat=2.14,elmaKgFiyat=3.67,domatesKgFiyat=1.11, muzKgFiyat=0.95,patlicanKgFiyat=5.0;
        toplam=kiloArmut*armutKgFiyat+kiloElma*elmaKgFiyat+kiloDomates*domatesKgFiyat+kiloMuz*muzKgFiyat+kiloPatlican*patlicanKgFiyat;

        System.out.println("Ödemeniz Gereken Toplam Ücret: "+toplam);

    }
}