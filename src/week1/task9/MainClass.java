package week1.task9;

public class MainClass {
    public static void main(String[] args) {
        PalindromWords palindromWords = new PalindromWords();
        boolean check = palindromWords.checkPalindrome("ata");
        if(check){
            System.out.println("yes, it's palindrom");
        }
        else {
            System.out.println("not it's not palindrom");
        }
    }
}
