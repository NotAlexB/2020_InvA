import java.util.*;
import java.io.*;
import static java.lang.System.*;

class DryRun{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("dryrun.dat"));
        int i = s.nextInt();
        while(i --> 0){
            out.println("I like " + s.next() + ".");
        }

    }
}