//any of the three synchronized implementation will work
public class MultithreadingSynchronizedDemo {
    public static void main(String args[]) {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend(" Hi ", snd);
        ThreadedSend S2 = new ThreadedSend(" Bye ", snd);

        s1.start();
        S2.start();

        try {
            s1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}


class Sender {
    public synchronized void send(String msg) { //Example 1: Synchronized method
        synchronized (this) { //Example 1: Synchronized sender block inside method
            System.out.println("Sending\t" + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread  interrupted.");
            }
            System.out.println("\n" + msg + "Sent");
        }
    }
}

class ThreadedSend extends Thread {
    String msg;
    Sender sender;

    public ThreadedSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {//Example 1: Synchronized sender obj
            sender.send(msg);
        }

    }
}
