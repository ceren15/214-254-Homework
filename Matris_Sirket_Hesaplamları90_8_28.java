
import java.util.Scanner;

public class Matris_Sirket_Hesaplamları90_8_28 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("Şirket sayısını giriniz :");
        int N=input.nextInt();
        int [][]A =new int[N][12];
        //Şirketin aylık kar oranları girilir.
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <12; j++) {
                System.out.println(i+" inci satır "+j +" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        //Her bir şirketin yıllık ortalama kar miktarları hesaplanır.
        double YK=0;//Yıllık kar toplamı
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <12; j++) {
                YK+=A[i][j];
            }
            YK=(double)YK/12;
            System.out.println(i+1+" Şirketin yıllık kar ortalaması : "+YK);
        }
//Her bir şirketin en az ve en fazla kar elde ettiği ayları ve miktarlarını tespit etmek için ise herbir satırdaki en küçük ve en büyük elemanlar bulunur.
        for (int i = 0; i <N; i++) {
            int Fzkar=A[i][0],Fzkaray=0,Azkar=A[i][0],Azkaray=0;
            for (int j = 1; j <12; j++) {
                if (A[i][j]<Azkar) {
                    Azkar=A[i][j];
                    Azkaray=j;
                }
                if (A[i][j]>Fzkar) {
                    Fzkar=A[i][j];
                    Fzkaray=j;
                }
            }
            System.out.println(i+1+".şirket için : "+Azkar+" = "+Azkaray +" / "+Fzkar+" = "+Fzkaray);
        }
//Herbir sütundaki en küçük değerli eleman o aya ait en az kar miktarını ve satır indisini de şirketi; herbir sütundaki en büyük değerli eleman da en yüksek kar miktarını gösterir.
            for (int j = 0; j <12; j++) {
                int Az=A[0][j],Azs=0,Fz=A[0][j],Fzs=0;
                for (int i = 1; i <N; i++) {
                    if (A[i][j]<Az) {
                        Az=A[i][j];
                        Azs=i;  
                    }
                    if (A[i][j]>Fz) {
                        Fz=A[i][j];
                        Fzs=i;
                    }
                }
                System.out.println(j+1+".ay için : "+Az+" = "+Azs+" / "+Fz+" = "+Fzs);
            }
    }
}
