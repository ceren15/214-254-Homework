
import java.util.Scanner;


public class Matris_Yedekkosegen83_8_14 {

    public static void main(String[] args) {
        //Klavyeden girilen NxN tipindeki A matrisinin yedek köşegenin üstünde kalan elemanların toplamını hesaplayan program.
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(i+" inci satır "+j +" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        int toplam=0;
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                if (i+j<N) {
                    toplam+=A[i][j];
                }
            }
        }
        System.out.println("Toplam : "+ toplam);
    }
}
