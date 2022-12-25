
import java.util.Scanner;


public class Harfyıldızuyumu80_7_41 {

    public static void main(String[] args) {
        
    //Klavyeden büyük harflerle girilen kelimenin harflerini ve alfabedeki sıraları kadar "*" karakterini ayrı ayrı satırlara yazdıran.
         //ABC = A* B** C*** D**** E*****
        Scanner input=new Scanner(System.in);
        System.out.print("Büyük harflerle kelime giriniz : ");
        String txt=input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i)+" -> " );
            for (int j = 0; j <txt.charAt(i)-64; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
         
    
    }
    
}
