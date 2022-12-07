
public class Markovsayisi53_104 {
//(1,1,1)  (1,1,2)  (1,2,5)  (1,5,13)
    public static void main(String[] args) {
        for (int x = 1; x <= 50; x++) {
            for (int y = x; y <= 50; y++) {
                for (int z = y; z <= 50; z++) {
                    if (x*x+y*y+z*z==3*x*y*z) {
                        System.out.println("İlk sayı  " +x+ ", ikinci sayı  "+y+",Üçüncü sayı  " +z);
                    }
                }
            }
        }
    }
    
}
