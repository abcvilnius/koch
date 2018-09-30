import java.util.*;
public class Greatest_common_Divisor
{

    public static void main (String[]args){
            Scanner input = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    int d = 0;
    int e=0;
    int temp = 0;
    //finds the lowest value
    if(n1 < n2) {
        temp = n1;
        n1 = n2;
        n2 = temp;
    }

    for(d = n2;(n2%d!=0 || n1%d!= 0);d--){


    }

    System.out.println("The Greatest Common Divisor of " + n1 + " and " + n2 + " is " + d);

    }

}
