import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Brian{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("brian.dat"));
        int i = s.nextInt();
        while(s.hasNext()){
            int b = s.nextInt();
            out.println("In the year " + b + ", Brian will be coding in Java " + ((b-1995) / 2) + "!");
        }

    }
}