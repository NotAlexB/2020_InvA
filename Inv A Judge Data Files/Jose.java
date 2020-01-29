import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Jose{
  public static void main(String [] args) throws IOException{
    Scanner s = new Scanner(new File("jose.dat"));
    Map<Character,Integer> m = new HashMap<Character,Integer>();
    int [] sto = new int [17];
    for(int i = 0; i < 23; i++){
      m.put((""+s.next()).charAt(0),s.nextInt());
    }
    for(int i = 0; i < 10; i++){
      m.put((i + "").charAt(0),i);
    }
    for(int i = 0; i < 17; i++){
      s.nextInt();
      sto[i] = s.nextInt();
    }
    int i = s.nextInt();
    s.nextLine();
    while(i --> 0){
      String stri = s.nextLine();
      char [] c = stri.toCharArray();
      int sum = 0;
      for(int ind = 0; ind < 17; ind++){
        if(c[ind] != '_'){
        sum += sto[ind] * m.get(c[ind]);
        }
      }
      sum = sum % 11;
      if(sum >= 10){
        c[8] = 'X';
      }
      else{
        c[8] = (""+sum).charAt(0);
      }
      for(char ch : c){
        out.print(ch);
      }
      out.println();
  }
  s.close();
}
}