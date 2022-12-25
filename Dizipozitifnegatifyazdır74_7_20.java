
import java.util.Scanner;
//Klavyeden girilen N elemanlı bir A dizisindeki pozitif elemanları B dizisine ve negatif elemanları da C dizisine yerleştiren program

public class Dizipozitifnegatifyazdır74_7_20 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int n=oku.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for (int i = 0; i <a.length; i++) {
            System.out.print((i+1)+" inci sayi : ");
            a[i]=oku.nextInt();
        }
        int x=0,y=0;
        for (int i = 0; i <a.length; i++) {
            if (a[i]==0) {
            }
            if (a[i]>0) {
                x++;
                b[x]=a[i];
                System.out.println("B dizisinin elamanı : "+b[x]);
              
            }else if(a[i]<0){
                y++;
                c[y]=a[i];
                System.out.println("C dizisinin elemanı : "+c[y]);
            }
            
        }
        
    }
    
}
