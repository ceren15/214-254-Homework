
import java.util.Scanner;
//AB doğru parçasının altın oran şeklinde AC ve CB ye bölünmesi.
/*
1.Başla
2.Kullanıcıdan doğru parçasının uzunluğunu al
3.cb=2*ab/1+(5^^0.5)
4.ac=ab-cd
5.Yaz ac ve cb
6.Bitir.
*/

public class Altınoranbölme32_83 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Doğru parçasının uzunluğu : ");
        int ab=oku.nextInt();
        double cb=2*ab/(1+Math.pow(5, 0.5));
        double ac =ab-cb;
        System.out.println(ac);
        System.out.println(cb);   
    }
}
