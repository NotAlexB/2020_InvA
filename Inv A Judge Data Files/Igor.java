import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Igor{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("igor.dat"));
        int i = s.nextInt();
        while(i --> 0){
            ArrayList<Character> sto = new ArrayList<Character>();
            String str = s.next();
            int palLen = 0;
            int strLen = str.length();
            for(char c : str.toCharArray()){
                if(sto.contains(c)){
                    palLen += 2;
                    strLen -= 2;
                    sto.remove(sto.indexOf(c));
                }
                else{
                    sto.add(c);
                }
            }
            if(strLen > 0){
                palLen += 1;
                strLen -= 1;
            }
            out.println(palLen * palLen+ strLen);
        }

    }
}