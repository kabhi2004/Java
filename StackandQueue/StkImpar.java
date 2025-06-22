import java.util.Scanner;
public class StkImpar {
    static int top=-1;
    static 
    int stk[]=new int[10];
    public static void main(String args[])
    {
      
      Scanner scan=new Scanner(System.in);
      
      while(true){
        System.out.println("Enter the choice");
      System.out.println("1 push the data");
      System.out.println("2 display the data");
      System.out.println("3 peek the data");
      System.out.println("4 pop the data");
      System.out.println("5 size of the data");
      System.out.println("-----------------------------------------");
      int choice=scan.nextInt(); 
      if(choice==1){
      int n=scan.nextInt();
      push(n);
      continue;
      }
      else if(choice==2)
       Display();
      else if(choice==3)
       peek();
      else if(choice==4)
       pop();
      else if(choice ==4)
       size();
      else
       break;
    }
    scan.close();
   
    }
     static void push(int n){
        if (top>10){
          System.out.println("Your stack is full");
          return;
        }
        top=top+1;
        stk[top]=n;
        return;

    }
    static void  Display()
    {
        for(int i=0;i<10;i++){
          if(stk[i]==0) return;
          System.out.println(stk[i]);
        }
    }
    static void peek()
    {
      if(top==-1)
      {
        System.out.println("this stack is empty");
      }
      System.out.println(stk[top]);
    }
    static void pop(){
      if(top==-1){
       System.out.println("Empty stack");
       return;
      }
     top=top-1;
    }
    static void size(){
     System.out.println(top+1);
    }
}
