
package mypackage.javaadv.threads;


public class MainThreads {

    public static void main(String[] args) {
        
        //Hardware Query
        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("Logic Processor: "+Runtime.getRuntime().availableProcessors());
        
        //Threads
        GenericThread threadOne=new GenericThread("Thread One");
        GenericThread threadTwo=new GenericThread("Thread Two");
        GenericThread threadThree=new GenericThread("Thread Three");
        GenericThread threadFour=new GenericThread("Thread Four");
        
        //Run() Method
        threadOne.run();
        
        threadTwo.run();
        
        threadThree.run();
        
        threadFour.run();
        
        //Start() Method->Execute the run methods in a new thread
        threadOne.start();
        
        threadTwo.start();
        
        threadThree.start();
        
        threadFour.start();
        
        
    }
}
