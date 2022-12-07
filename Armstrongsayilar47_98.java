
public class Armstrongsayilar47_98 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                     int s=100*i+10*j+k;
                    if (s ==Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3)) {
                        System.out.println("Armstrong Sayılar : " +s);
                    }
                }
            }
        }
    }
    
}
