import java.util.*;
class Palindrome {
 public static void main(String[] args)
 {
  Solution s = new Solution();
  System.out.println(s.isPalindrome(121));
 }
    public boolean isPalindrome(int x)
      {
       int temp=x, sum=0;
       while(temp>0) 
       {
        int rem=temp%10;
        sum=sum*10+rem;
        temp=temp/10;
       }
       if(sum==x)
       return true;
       else
       return false;
      }
}