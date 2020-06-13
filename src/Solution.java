import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //int a=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i)-48;
            System.out.println(c);
            arr[c]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println(i+":"+arr[i]);
            }
        }
    }
}
