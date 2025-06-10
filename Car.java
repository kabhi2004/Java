import java.util.*;
class Car{
    public static int count=0;
    String model;
    public Car(String model)
    {
        this.model=model;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String args[])
    {
        Car c1=new Car("honda");
        Car c2=new Car("maruti");
        System.out.println(getCount());
    }
}