package edu.nm.concurrency.concurrency;


import edu.nm.concurrency.concurrency.basicThreads.FromCallable;
import edu.nm.concurrency.concurrency.basicThreads.FromRunnable;
import edu.nm.concurrency.concurrency.basicThreads.FromThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Concurrency {

    public void doSmt() throws ExecutionException, InterruptedException {
        new Thread(new FromRunnable()).start();
        new FromThread().start();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(new FromCallable(5));
        System.out.println("Thread name: " + future.get());
        executor.shutdown();

//        //pausing
//        String importantInfo[] = {
//                "Mares eat oats",
//                "Does eat oats",
//                "Little lambs eat ivy",
//                "A kid will eat ivy too"
//        };
//        for (int i = 0; i < importantInfo.length; i++) {
//            try {
//                //Pause for 4 seconds
//                Thread.sleep(1000);
//                if (Thread.interrupted()) {
//                    System.out.println("Thread interrupted");
//                }
//            } catch (InterruptedException ex) {
//                System.out.println("from interruption");
//                return;
//            }
//            //Print a message
//            System.out.println(importantInfo[i]);
//
//            // Delay, in milliseconds before
//            // we interrupt MessageLoop
//            // thread (default one hour).
//            long patience = 1000 * 60 * 60;
//
//            // If command line argument
//            // present, gives patience
//            // in seconds.
//            if (args.length > 0) {
//                try {
//                    patience = Long.parseLong(args[0]) * 1000;
//                } catch (NumberFormatException e) {
//                    System.err.println("Argument must be an integer.");
//                    System.exit(1);
//                }
//            }
//
//            threadMessage("Starting MessageLoop thread");
//            long startTime = System.currentTimeMillis();
//            Thread t = new Thread(new MessageLoop());
//            t.start();
//
//            threadMessage("Waiting for MessageLoop thread to finish");
//            // loop until MessageLoop
//            // thread exits
//            while (t.isAlive()) {
//                threadMessage("Still waiting...");
//                // Wait maximum of 1 second
//                // for MessageLoop thread
//                // to finish.
//                t.join(1000);
//                if (((System.currentTimeMillis() - startTime) > patience)
//                        && t.isAlive()) {
//                    threadMessage("Tired of waiting!");
//                    t.interrupt();
//                    // Shouldn't be long now
//                    // -- wait indefinitely
//                    t.join();
//                }
//            }
//            threadMessage("Finally!");
//        }
//    }
//
//    // Display a message, preceded by
//    // the name of the current thread
//    static void threadMessage(String message) {
//        String threadName =
//                Thread.currentThread().getName();
//        System.out.format("%s: %s%n",
//                threadName,
//                message);
//    }
//
//    private static class MessageLoop
//            implements Runnable {
//        public void run() {
//            String importantInfo[] = {
//                    "Mares eat oats",
//                    "Does eat oats",
//                    "Little lambs eat ivy",
//                    "A kid will eat ivy too"
//            };
//            try {
//                for (int i = 0;
//                     i < importantInfo.length;
//                     i++) {
//                    // Pause for 4 seconds
//                    Thread.sleep(4000);
//                    // Print a message
//                    threadMessage(importantInfo[i]);
//                }
//            } catch (InterruptedException e) {
//                threadMessage("I wasn't done!");
//            }
//        }



    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int reminder = (columnNumber - 1) % 26;
            char letter = (char) ('A' + reminder);
            sb.insert(0, letter);
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.toString();
    }
}



//    ProcessBuilder pb =
//            new ProcessBuilder("myCommand", "myArg1", "myArg2");
//    Map<String, String> env = pb.environment();
// env.put("VAR1", "myValue");
//         env.remove("OTHERVAR");
//         env.put("VAR2", env.get("VAR1") + "suffix");
//         pb.directory(new File("myDir"));
//         File log = new File("log");
//         pb.redirectErrorStream(true);
//         pb.redirectOutput(Redirect.appendTo(log));
//         Process p = pb.start();
//         assert pb.redirectInput() == Redirect.PIPE;
//         assert pb.redirectOutput().file() == log;
//         assert p.getInputStream().read() == -1;
