package com.step.FindLetter;

public class FindLetter {

    public void findL(char[] array){
       for(int i=0; i<array.length; i++){
           switch(array[i])
           {
               case 'a' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'e' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'i' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'o' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'u' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'A' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'E' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'I' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'O' : System.out.println(array[i] + " letter is a vowel"); break;
               case 'U' : System.out.println(array[i] + " letter is a vowel"); break;

               default: System.out.println(array[i] + " letter is a consonant"); break;

           }
       }
    }
}
