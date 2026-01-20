
import java.util.Scanner;


public class BelajarInputOutput {

    
    public static void main(String[] args) {
        Scanner inputUser= new Scanner(System.in);
            System.out.print("Inputkan Nama Anda: ");
        String nama= inputUser.nextLine();
            System.out.println("Nama yang di Input: "+nama);
            
            System.out.print("Berapakah Nomor Absen Anda: ");
         int absen= inputUser.nextInt();
            System.out.println("Nomor Absen Anda: "+absen);
    }
    
}
