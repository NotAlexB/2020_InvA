import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Maurcio{
  public static void main(String [] args) throws IOException{
    Scanner s = new Scanner(new File("maurcio.dat"));
    int i = s.nextInt();
    while(i --> 0){
      int len = s.nextInt();
      int wid = s.nextInt();
      int [][] sto = new int [len][wid];
      int maxVal = len * wid;
      int maxLen = (maxVal + "").length() + 1;
      int stoVal = 1;
      if(len > wid){
        for(int a = 0; a < wid; a++){
          for(int b = 0; b < len; b++){
            if(a % 2 == 0){
              sto[b][a] = stoVal;
              stoVal++;
            }
            else{
              stoVal--;
              sto[b][a] = stoVal;
            }
          }
          stoVal += len;
        }
      }
      else{
        for(int a = 0; a < len; a++){
        for(int b = 0; b < wid; b++){
          if(a % 2 == 0){
            sto[a][b] = stoVal;
            stoVal++;
          }
          else{
            stoVal--;
            sto[a][b] = stoVal;
          }
        }
           stoVal += wid;
        }
      }
    for(int [] a : sto){
      for(int b : a){
        out.printf("%"+maxLen+"d",b);
      }
      out.println();
    }
      out.println("==========");
    }
    s.close();
  }
}