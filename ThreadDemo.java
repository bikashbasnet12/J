class TestThread implements Runnable{
    String tname;
    TestThread(String n){
        tname =n;
        System.out.println("creating: "+tname);
    }
    public void run(){
        System.out.println("Running : "+tname);
        try{
            for(int i=4;i>0;i--){
                System.out.println("thread : "+tname +"printing: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
                System.out.println("thread"+tname + "interrupted");
            }
        System.out.println("thread: "+tname +" exiting");
    }
}
public class ThreadDemo {
    public static void main(String[]args){
        TestThread r = new TestThread("thread1");
        Thread t =new Thread(r);
        t.start();
        TestThread r1 = new TestThread("thread2");
        Thread t1 =new Thread(r1);
        t1.start();
    }
}
