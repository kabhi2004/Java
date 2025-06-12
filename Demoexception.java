package Gitcode;
import java.util.Scanner;
public class Demoexception {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Integer arr[]=new Integer[10];
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println("Enter the no.");
                arr[i]=scan.nextInt();
            }
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("There is error in the code"+ e);

        }
        scan.close();
    }
    
}
