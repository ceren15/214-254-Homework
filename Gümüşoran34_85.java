
import java.util.Scanner;
//2*a+b/a==a/b==Gümüş Oran
/*
1.Başla
2.Kullanıcıdan doğru parçasının uzunluğunu al
3.b=u/(2+2^^5)
4.a=u-b
5.Yaz a ve b
6.Bitir.
*/

public class Gümüşoran34_85 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Doğru parçasının uzunluğu : ");
        int u=oku.nextInt();
        double b=u/(2+Math.pow(2, 5));
        double a=u-b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
