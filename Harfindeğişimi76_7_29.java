
import java.util.Scanner;


public class Harfindeğişimi76_7_29 {

    public static void main(String[] args) {
        
        //Klavyden rastgele büyüklükte harfler girilen kelimenin harflerinin büyüklüklerinin tersini alarak yeniden yazdıran program.
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen büyük,küçük harlerle bir cümle yazınız : ");
        String txt=input.nextLine();
        for (int i = 0; i <txt.length(); i++) {
            if (txt.charAt(i)==Character.toLowerCase(txt.charAt(i))) {
                System.out.println(Character.toUpperCase(txt.charAt(i)));
            }else{
                System.out.println(Character.toLowerCase(txt.charAt(i)));
            }
            
        }
    }
    
}
