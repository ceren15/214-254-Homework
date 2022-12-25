
import java.util.Random;
import java.util.Scanner;

public class Tas_Kagit_Makas82 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("0.secenek Taş,  ");
        System.out.print("1.secenek Kağıt, ");
        System.out.print("2.secenek Makas , ");
        System.out.println("Seçimizi yapınız : ");
        
        String [] secenek={"tas","kagit","makas"};
        int player1=input.nextInt();
        Random rnd = new Random();
        int player2 = rnd . nextInt ( 3 ) ;
        
        if (secenek[player1].equals("tas")&& secenek[player2].equals("kagit")) {
            System.out.println("Kazanan pc: "+player2);
        }
        if (secenek[player1].equals("kagit")&& secenek[player2].equals("tas")) {
            System.out.println("Kazanan sizsiniz : "+player1);
        }
        if (secenek[player1].equals("tas")&& secenek[player2].equals("makas")) {
            System.out.println("Kazanan sizsiniz : "+player1);
        }
        if (secenek[player1].equals("makas")&& secenek[player2].equals("tas")) {
            System.out.println("Kazanan pc: "+player2);
        }
        if ((secenek[player1].equals("tas")&& secenek[player2].equals("tas"))||(secenek[player1].equals("kagit")&& secenek[player2].equals("kagit"))||(secenek[player1].equals("makas")&& secenek[player2].equals("makas"))) {
            System.out.println("Berbere");
        }
        if (secenek[player1].equals("makas")&& secenek[player2].equals("kagit")) {
            System.out.println("Kazanan sizsiniz : "+player1);
        }
        if (secenek[player1].equals("kagit")&& secenek[player2].equals("makas")) {
            System.out.println("Kazanan pc: "+player2);
        }

        
    }
    
}
