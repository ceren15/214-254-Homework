
import java.util.Scanner;


public class Diziskalerçarpım71_7_9 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int N=oku.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        
        for (int i = 0; i <a.length; i++) {
            System.out.print("A dizisinin "+(i+1)+" inci elemanı : ");
            a[i]=oku.nextInt();
        }
        System.out.println();
        for (int i = 0; i <b.length; i++) {
            System.out.print("B dizisinin "+(i+1)+" ini elemanı : ");
            b[i]=oku.nextInt();
        }
        int SC=0;
        for (int i = 0; i <N; i++) {
            SC+=a[i]*b[i];
        }
        System.out.print("A ve B dizilerinin skaler çarpımı : "+SC);
    
    }
    
}
