import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        int j = str.length();
        
        if(1 <= j && j <= 10){
            if(1 <= n && n <=5){
                for(int i = 1; i <= n; i++){
                    System.out.print(str);
                  }
             }
        }
        
    }
}