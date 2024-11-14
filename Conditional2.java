
import java.util.Scanner;

public class Conditional2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int Marks= sc.nextInt();
        if(Marks>90){
            System.out.println("Gread A");
        }else{
            System.out.println("Gread B");
        }
        if (Marks<60){
            System.out.println("Gread c");
        }
    }
    
}
