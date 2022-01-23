package week1.task9;

public class PalindromWords {
    public boolean checkPalindrome(String word){
        int i=0;
        int j=word.length()-1;

        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
               return false;
            }
            i++;
            j--;

        }
        return true;


    }
}
