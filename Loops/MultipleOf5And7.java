package Loops;


public class MultipleOf5And7 {
    public static void main(String[] args) {
        
        int i = 1;
        while(true){
            if(i % 5 == 0 && i % 7 == 0){
                System.out.print("Found Ans: " + i);
                break;
            }
            i++;
        }
    }
}
