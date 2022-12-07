
public class İkibasamaklıasalsayi36_87 {
//Her iki basamağı da asal sayı olan iki basamaklı pozitif tamsayıları listeleyen program
    public static void main(String[] args) {
        System.out.println("İki basamağı da asal sayı olan iki basamaklı pozitif tamsayılar:");
        for (int i = 2; i <= 7; i++) {  //onlar basamağı için döngü
            for (int j = 2; j <= 7; j++) {  //birler basamağı için döngü
               if (i==2 || i==3 || i==5 || i==7 ) { //asal sayılara eşitlik sağlanır
                   if (j==2 || j==3 || j==5 || j==7) {  //asal sayılara eşitlik sağlanır
                   System.out.println(10*i+j);  //mesela i=2 ve j=3 için 10*i+j=23 olur yani burada iki basamaklı sayı bulunur, yazdırılır
               } 
            }
        }
    }
    }
    
}
