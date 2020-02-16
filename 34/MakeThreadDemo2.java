class MakeThreadDemo2{
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        
        t1.start();
        t2.start();

        System.out.println("End : " + Thread.currentThread().getName());
    }
}

class Task extends Thread{
    public void run(){
        int n1 = 100;
        int n2 = 200;

        String name = Thread.currentThread().getName();

        System.out.println(name + " : " + (n1 + n2));
    
    }
}