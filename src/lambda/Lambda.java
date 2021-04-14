package lambda;

public class Lambda {

    public void exempleWithThread() {
        Thread threadNormal = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread normal");
            }
        });

        Thread threadwithLambda = new Thread(() -> {System.out.println("Thread avec lambda");});

        threadNormal.start();
        threadwithLambda.start();
    }
}
