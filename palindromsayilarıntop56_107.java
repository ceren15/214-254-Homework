
import java.util.Scanner;
//n basamak sayısına göre palindrom tamsayıların toplam sayısını bulup yazdıran program.
public class palindromsayilarıntop56_107 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int n=oku.nextInt();
        System.out.println(9*Math.pow(10, (n-1)/2));
    }
    
}
