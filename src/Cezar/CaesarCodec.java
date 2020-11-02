package Cezar;

import java.util.HashMap;
import java.util.Map;

public class CaesarCodec implements Coder {
    int key;
     String[] Alphabet = new String[26];
    public void createAlphabet(){
        for (char i=0;i<26;i++){
            Alphabet[i]= String.valueOf((char) (65+i));
        }
    }
    public CaesarCodec(int key) {
        this.key = key;
    }


    @Override
    public String decode(String input) {
        String answer= "";
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<26;i++){
            int q = (i - key)%26;
            if(q<0)q=q+26;
            map.put(Alphabet[i],Alphabet[q]);
        }
        for(int i=0;i<input.length();i++){

           answer = answer + map.get(String.valueOf(input.charAt(i)));
        }
        return answer;
    }

    @Override
    public String encode(String input) {
        String answer= "";
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(Alphabet[i],Alphabet[(i+key)%26]);
        }
        for(int i=0;i<input.length();i++){

            answer = answer + map.get(String.valueOf(input.charAt(i)));
        }
        return answer;
    }



}
