import java.io.*;

import java.util.*;

public class Tileproblem {

  public static void main(String[] args)  {

    Scanner scn = new Scanner(System.in);
    System.out.println("enter the number of boards :");
    int n = scn.nextInt();
    int[] tp = new int[n + 1];
    tp[0] = 0;
    tp[1] = 1;
    tp[2] = 2;
    for (int i = 3; i < tp.length; i++)
    {
      tp[i] = tp[i - 1] + tp[i - 2];
    }
    
    System.out.println("the number of ways to tile the given board is :"+tp[n]);
  }
}