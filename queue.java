/* program for queue using 2 stacks
 *@author:preethi
*/

import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();

       Stack<Integer> s1=new Stack<Integer>();
       Stack<Integer> s2=new Stack<Integer>();       
       for(int i=0;i<n;i++){
           int in=s.nextInt();
           if(in==1){
               s1.push(s.nextInt());
           }
           else if(in==2){
               if(s2.isEmpty()) {
                    while(!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }  
                s2.pop();
           }
            else{
                if(s2.isEmpty()) {
                    while(!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
               }
               System.out.println(s2.peek()); 
            }
        }
    }
}