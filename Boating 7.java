import java.io.*;
import java.util.*;

public class Solution {
   public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int r1=75*B;
        int r2=30*C;
        if(r1+r2<=A)
        {
            System.out.println("Boat is stable");
        }
        else
        {
            System.out.println("Boat will drown");
        }
    }
}
