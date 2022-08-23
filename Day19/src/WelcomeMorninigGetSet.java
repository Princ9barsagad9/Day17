class Task3 extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.print("welcome ");
        }
    }
}
class Task4 extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.print("first ");
        }
    }
}
public class WelcomeMorninigGetSet {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("task 1 started");
        Task1 task3=new Task1();
        task3.start();
        Task4 task4=new Task4();
        task4.setPriority(10);
        task4.start();
        System.out.println("task 2 started");
        for(int i=1;i<100;i++){
            System.out.print("GoodMorning ");
        }
        System.out.println();
        System.out.println("all completed");
        System.out.println("priority of task4: "+task4.getPriority());
    }
}
