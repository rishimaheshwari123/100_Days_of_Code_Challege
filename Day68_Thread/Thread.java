/*
Question -> 
  Thread class provide constructors and methods to create and perform operations on a thread.
  Thread class extends Object class and implements Runnable interface.
    */

Solution ->
  class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My Thread Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class  YourThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy222!");
            i++;
        }
    }
}
public class tut_70_Thread {
    public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();
    YourThread y = new YourThread();
    y.start();
    }
}
