import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Sebastian {
    static class Words implements Comparable<Words>{
    public String string = "";
    public int sumVal = 0;
    public Words(){

    }
    public Words(String str){
      this.string = str;
      for(char c : this.string.toCharArray()){
        this.sumVal += c;
      }
    }
    public int compareTo(Words w){
      int sum = this.sumVal - w.sumVal;
      if(sum == 0){
        return this.string.compareTo(w.string);
      }
      else{
        return sum;
      }
    }
    public String toString(){
      return string;
    }
  }
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(new File("sebastian.dat"));
    ArrayList<Words> a= new ArrayList<Words>();
    ArrayList<String> g= new ArrayList<String>();
    while(s.hasNext()){
      String str = s.next();
      Words wor = new Words(str);
      if(!g.contains(wor.string)){
        a.add(wor);
        g.add(wor.string);
      }
    }
    Collections.sort(a);
    for(Words b : a){
      out.println(b.string);
    }
  }
}