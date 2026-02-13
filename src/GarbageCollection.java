import java.util.Scanner;

public class GarbageCollection {
    
    // TODO: Override the finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected");
        super.finalize();
    }
    
    // protected void finalize()
    // Inside it, print "Garbage Collected"

    public static void main(String[] args) {

        GarbageCollection gc = new GarbageCollection(); // Create an object of GarbageCollection class
        
        gc = null; // Make the object eligible for garbage collection
        System.gc(); // Request the JVM to perform garbage collection

    }
}
