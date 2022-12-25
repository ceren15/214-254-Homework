
import java.util.Scanner;


public class Tersyazdırma81_7_43 {

    public static void main(String[] args) {
        
        //Klavyeden girilen kelimeyi ortadan bölerek herbir parçasını tersten yazdıran program.
        //Abc|def
        Scanner input=new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String txt=input.nextLine();
        for (int i = txt.length()/2-1; i >=0; i--) {
            System.out.print(txt.charAt(i));
        }
        for (int i = txt.length()-1; i >=txt.length()/2; i--) {
            System.out.print(txt.charAt(i));
        }

    }
    
}
