
import java.util.Scanner;

 class Matris_Alt_Ucgen86_8_18 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        int [][]B=new int[N][N];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(i+" inci satır "+j +" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                if (i>j) {
                    B[i][j]=A[i][j];
                }
                else{
                    B[i][j]=0;
                }
            }
        }
        System.out.println();
        System.out.println("B matrisi");
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(B[i][j]);
            }
        }
    }
    
}
