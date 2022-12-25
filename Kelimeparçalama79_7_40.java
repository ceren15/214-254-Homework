
import java.util.Scanner;


public class Kelimeparçalama79_7_40 {

    public static void main(String[] args) {
        
        //Klavyeden girilen kelimeyi ortadan bölerek -sırasıyla- ikinci parçadan ileri
        //ve birinci parçadan geri doğru birer karakter alarak yazdıran program.
        //Elekt | ronik =rtokneilkE
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kelime giriniz : ");
        String txt=input.nextLine();
        for (int i = 0; i <txt.length()/2; i++) {
            System.out.print(txt.charAt(txt.length()/2+i));
            System.out.print(txt.charAt(txt.length()/2-1-i));
        }
    }
}
