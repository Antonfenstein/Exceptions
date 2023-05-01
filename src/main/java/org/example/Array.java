package org.example;

import java.util.Random;

public class Array {
    public static int returnArrayElement(int index)
    {

   int myArray[] = new int[5];
   Random random = new Random();
   for (int i = 0; i< myArray.length; i++){
  myArray[i]= random.nextInt();
            }
   return myArray[index];
}
}
