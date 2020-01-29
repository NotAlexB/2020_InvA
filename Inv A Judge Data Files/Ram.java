import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Ram{
    public static void main(String [] args)throws IOException{
        Scanner s = new Scanner(new File("ram.dat"));
        boolean hasQuote = true;
        while(s.hasNext()){
            Scanner s2 = new Scanner(s.nextLine());
            while(s2.hasNext()){
                String sto = s2.next();
                String sto2 = "";
                char [] c = sto.toCharArray();
                String punct = "";
                for(int i = c.length-1; i >= 0; i--){
                    if(Character.isLetterOrDigit(c[i]) || c[i] == '/' || c[i] == '\''){
                        sto2 += c[i]; 
                    }
                    
                    else if(c[i] == '"'){
                        if(hasQuote){
                            sto2 = c[i] + sto2;
                            hasQuote = false;
                        }
                        else{
                            punct += c[i];
                            hasQuote = true;
                        }

                    }
                    else{
                        punct += c[i];
                    }
                }
                out.print(sto2 +  punct + " ");
        }
            out.println();
        }

    }
}