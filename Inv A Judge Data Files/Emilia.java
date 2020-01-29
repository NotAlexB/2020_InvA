import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Emilia{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("emilia.dat"));
        int i = s.nextInt();
        while(i --> 0){
            int h = (int)((360 - s.nextDouble()) / 30 + 3); 
            double m = ((360 - s.nextDouble()) / 6 + 15) % 60;
            //out.println(h + " " + m);
            if(h > 12){
                h = h % 12;
            }
            out.printf("%02d:%02.0f\n",h,m);

        }

    }
}