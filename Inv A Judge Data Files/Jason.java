import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Jason{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("jason.dat"));
        s.nextLine();
        while(s.hasNext()){
            double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
            double vertex = -b/(2*a);
            double y = a * Math.pow(vertex,2) + (b*vertex) + c;
            out.printf("(%.3f,%.3f)-->",vertex,y);
            if (a > 0) out.println("UPWARD");
            else if (a < 0) out.println("DOWNWARD");
        }
    }
}