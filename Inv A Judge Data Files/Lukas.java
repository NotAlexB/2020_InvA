import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Lukas{
  public static void main(String [] args) throws IOException{
    Scanner s = new Scanner(new File("lukas.dat"));
    String [] a = s.nextLine().split(",");
    int i = s.nextInt();
    while(i --> 0){
      boolean sto = true;
      String test = s.next();
      if(Arrays.asList(a).indexOf(test) != -1 || test.equals("true") || test.equals("false") || test.equals("null")){
        sto = false;
      }
      char [] c = test.toCharArray();
      if(!Character.isAlphabetic(c[0])&& !(c[0] == '$') && !(c[0] == '_')){
        sto = false;
      }
      c[0] = 'a';
      for(char ch : c){
        if(!Character.isLetterOrDigit(ch) && ch != '_' && ch != '$'){
          sto = false;

        }
      }
      if(sto){
        out.println("VALID");
      }
      else{
        out.println("INVALID");
      }
    }
  }
}