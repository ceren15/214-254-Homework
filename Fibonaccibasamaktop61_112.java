
public class Fibonaccibasamaktop61_112 {

    public static void main(String[] args) {
        int s;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                s=i+j;
                if (s==1 || s==2 || s==3 || s==5 || s==8 || s==13) {
                    System.out.println(10*i+j);
                }
            }
        }
    }
    
}
