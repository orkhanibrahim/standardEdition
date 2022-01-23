package week1.task8;

public class MultiplyNumbers {
    public void multiplyFromOneToTen(int a){
        for(int i=1;i<=10;i++){
            int result = i*a;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        MultiplyNumbers multiplyNumbers = new MultiplyNumbers();
        multiplyNumbers.multiplyFromOneToTen(4);
    }
}
