
public class İkizasallar39_90 {
//ikiz asallar.
    public static void main(String[] args) {
        int y=0;
            for(int i=2; i<1000; i++){
                y=i+2;
                if(asal(i)==0 && asal(y)==0){
                    System.out.println("("+i+", "+y+")");
                }
                else continue;
            }
        }
        public static int asal(int x){
            int c = 0;
            for(int i=2; i<=Math.sqrt(x); i++){
                if(x%i==0) c++;
            }
            if(c==0) return 0;
            else return 1;
        
    }
    
}
