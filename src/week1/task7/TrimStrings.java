package week1.task7;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 7: Bir dene method yaz, methoda 2dene deyishen gelecek, 1dene int, 1dene list sheklinde string.
 * Senin methodun, listeki her bir elementi verilen int qeder kesmelidi, eskik olanin qabagina 0 qoymalidi.
 * Misalcun, verilecek int limit=3, string list= "1212","12","121" ; result: "121", "012","121"
 */
public class TrimStrings {


    public void truncateString(int size, List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            if(string.length()<size){
                String s ="0";
                while (string.length() < size) {
                    string = s + string;
                }
                System.out.println(string);
            }
            else if(string.length()>size){
                char[] charArray = new char[size];
                for(int j=0;j<charArray.length;j++){
                    charArray[j] = stringList.get(i).charAt(j);
                }
                System.out.println(charArray);
            }
            else if(string.length()==size){
                System.out.println(stringList.get(i));
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("24332");
        arrayList.add("434");
        arrayList.add("23");
        TrimStrings trimStrings = new TrimStrings();
        trimStrings.truncateString(10,arrayList);
    }
}
