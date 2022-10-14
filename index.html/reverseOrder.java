import java.util.Scanner;

public class reverseOrder {

      public static void main(String[] args) {
         //instansiasi objek dari class Scanner untuk baca input
         Scanner input = new Scanner(System.in);

         //deklarasi array untuk menyimpan beberapa nilai
         double[] bilangan = new double [7];
 
         //menampilkan ukuran Array
         System.out.println("Ukuran dari array adalah: " + bilangan.length);
 
         //meminta input dari user
         for(int index = 0;index < bilangan.length; index++){
             System.out.println("Masukkan bilangan ke- " + (index+1) + ": ");
             bilangan[index] = input.nextDouble();
         
         }
        //menampilkan bilangan yang telah diinput oleh user dalam urutan terbalik/reverse order
         System.out.println("Bilangan dalam urutan terbalik adalah: ");
         for(int index = bilangan.length-1; index >= 0; index--){
             System.out.println(bilangan[index] + " ");
         
 
     }
    }
}
    

