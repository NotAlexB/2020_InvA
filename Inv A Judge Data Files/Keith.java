import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Keith{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("keith.dat"));
        ArrayList<Double> a = new ArrayList<Double>();
        while (s.hasNext()) {
            double val = s.nextDouble() / s.nextDouble();
            a.add(val);
            out.printf("%.2f\n",val);
        }
        double[] b = new double[a.size()];
        for (int i = 0; i < a.size(); i++) b[i] = (Math.round(a.get(i)*100) / 100.0);
        Arrays.sort(b);
        float max = (float)b[b.length - 1];
        out.printf("Min = %.2f\n" , b[0]);
        out.printf("Max = %.2f\n", max);
    }
}