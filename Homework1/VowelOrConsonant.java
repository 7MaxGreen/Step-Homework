
    public class VowelOrConsonant {
         public static void main(String[] args) {

             char vowel= 'a';
             char consonant = 'b';

             if(vowel == 'a' || vowel == 'e' || vowel == 'i' || /* vowel == "î" || vowel == "ă" ||*/ vowel == 'o' || vowel == 'u' ||
                vowel == 'A' || vowel == 'E' || vowel == 'I' || /* vowel == "Î" || vowel == "Ă" ||*/ vowel == 'O' || vowel == 'U') 
                {
                    System.out.println("Frist variable is a vowel");
                } else 
                 {
                    System.out.println("First variable is a consonant");
                 }

             switch(consonant)
             {
                 case 'a' : System.out.println("Second variable is a vowel"); break;
                 case 'e' : System.out.println("Second variable is a vowel"); break;
                 case 'i' : System.out.println("Second variable is a vowel"); break;
                 case 'o' : System.out.println("Second variable is a vowel"); break;
                 case 'u' : System.out.println("Second variable is a vowel"); break;
                 case 'A' : System.out.println("Second variable is a vowel"); break;
                 case 'E' : System.out.println("Second variable is a vowel"); break;
                 case 'I' : System.out.println("Second variable is a vowel"); break;
                 case 'O' : System.out.println("Second variable is a vowel"); break;
                 case 'U' : System.out.println("Second variable is a vowel"); break;

                 default: System.out.println("Second variable is a consonant"); break;
                 
             }
        
        }
    }