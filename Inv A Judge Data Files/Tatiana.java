import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Tatiana {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(new File("tatiana.dat"));
    int ind = s.nextInt();
    double [] stoVal = new double [ind];
    for(int i = 0; i < ind; i++){
      double sum = 0;
      int num = s.nextInt();
      for(int a = 0; a < num; a++){
        sum +=  s.nextDouble();
      }
      stoVal[i] = sum;
    }
    double totAvg = 0;
    for(int d = 0; d < ind; d++){
      totAvg += stoVal[d];
    }
    totAvg = totAvg / ind;
    for(int c = 0; c < ind; c++){
      out.printf("%02d   %6.2f   %+7.2f\n",c+1,stoVal[c],stoVal[c] - totAvg);
    }
  }
}