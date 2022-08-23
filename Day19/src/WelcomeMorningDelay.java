class Task2 extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.print("welcome ");
        }
    }
}
public class WelcomeMorningDelay {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("task 1 started");
        Task1 task2=new Task1();
        Thread.sleep(2000);
        task2.start();
        System.out.println("task 2 started");
        for(int i=1;i<100;i++){
            System.out.print("GoodMorning ");
        }
    }
}
