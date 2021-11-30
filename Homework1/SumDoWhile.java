public class SumDoWhile{
    public static void main (String[] args){

    int n = 10;
    int i = 0;
    int sum = 0;

        do{
            sum = sum + i;
            i++;
            
        }while(i<=n);
        System.out.println(sum);
    }
}