// import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // System.out.println("Hello World");

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int n = sc.nextInt();
    // //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the character: ");
    //     char ch = sc.next().charAt(0);

    //Q1- Uppercase consonent and vowel / Lowercase vowel and consonent
    //  if (ch >= 'A' && ch <= 'Z') {
    //         System.out.println("UPPER CASE");
    //         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    //             System.out.println("UPPER CASE VOWEL");
    //             for (int i = -21; i >= -31; i--) {
    //                 System.out.println(i);
    //             }
    //         } else {
    //             System.out.println("UPPER CASE CONSONENT");
    //             for (int i = 31; i <= 41; i++) {
    //                 System.out.println(i);
    //             }
    //         }
    //       }
    //       else if (ch >= 'a' && ch <= 'z')
    //       {
    //         System.out.println("lower case");
    //         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //             System.out.println("lower case vowel");
    //             for (int i = 51; i >= 41; i--) {
    //                 System.out.println(i);
    //             }
    //         } else {
    //             System.out.println("lowercase consonent");
    //             for (int i = -51; i <= 41; i++) {
    //                 System.out.println(i);
    //             }
    //         }
    //       }
    //       else{
    //         System.out.println("inavlid character ");
    //       }
    // }

    // for loop print numbers from a certain range 
    // for (int a=10 ; a<=25; a++){
    // System.out.println(a);
    // }
    // System.out.println("==========================");
    // for (int b=45 ; b>=21; b--){
    // System.out.println(b);
    // }
    // System.out.println("==========================");
    // for (int c=-21 ; c>=-45; c++){
    // System.out.println(c);
    // }

    // do-while loop Q) check if even or odd and if even print the range from -10 to -20 using
    // do-while loop and if odd print the range from -53 to -43 using while
    // if ( a%2==0){
    // System.out.println("Even NUmber");
    // int b = -10;
    // do {
    // System.out.println(b);
    // b--;
    // }
    // while (b>=-20);
    // }
    // else {
    // System.out.println("Odd Number");
    // int i = -53;
    // while (i<=-43) {
    // System.out.println(i);
    // i++;
    // }
    // }

    //Q2- print odd numbers from range 35 to 45 
    // for (int a =35; a<=45 ; a++){
    //     if (a%2!=0){
    //         System.out.println(a);
    //     }     
    // }

    //Q3- given a number n for each interger i in the range from 1 to n inclusive , print out one vlaue lines as follows 
    //if i is a multipple of both 3 and 5 , print FizzBuzz
    // if i is a multipple 3 and not 5 , print Fizz
    // if i is not a multipple 3 but is of 5 , print Buzz
    // if i is not a multipple of both 3 and 5 , print i
        // for(int i=1; i<=n;i++){
        //     if (i%3==0 && i%5==0){
        //         System.out.println("FizzBuzz");
        //     }
        //     else if (i%3==0 && i%5!=0){
        //         System.out.println("Fizz");
        //     }
        //     else if (i%3!=0 && i%5==0){
        //         System.out.println("Buzz");
        //     }
        //     else{
        //         System.out.println(i);
        //     } 
        // }
     
    //Q4- to print factrors of given input number 
    // for (int i =1 ; i<=n ; i++){
    //     if (n%i==0){
    //         System.out.println(i);
    //     }
    // }

    //Q5- To check if the numbers are prime numbers or not
    // int count = 0;
    // for (int i=1; i<=n ; i++){
    //     if (n%i==0){   
    //        count++;
    //     }
    // }
    // if (count==2){
    //     System.out.println("Prime number");
    // }
    // else {
    //     System.out.println("Not a prime number ");
    // }
    
    //Q6- print all the prime number between the range 75 to 35
    // for (int i = 75 ; i>=35; i--){
    //     int count = 0;
    //     for(int j =1 ; j<=i; j++)
    //     if (i%j==0){
    //         count++;
    //     }
    // }
    // if (count == 2){
    //     System.out.println(i + "It is a prime number");
    // }

    //Q7- write a program to add all the even numbers from range 11 to 33
    // int sum = 0;
    // for (int i=11; i<=33;i++){
    //     if (i%2==0){
    //         sum += i ;   
    //     }
    // }
    // System.out.print("Sum of the numbers from range 11 to 33 is "+ sum);

    //Q8- write a program to swap two variables using third variable
    // int a = 10;
    // int b = 30;
    // System.out.println("Before Swapping "+ a +" "+ b);
    // int c = a;
    // a = b;
    // b = c;
    // System.out.println("After swapping "+ a +" "+ b);

    //Q9- write a progream to swap two variable without using third varibale
    // int a = -50;
    // int b = 80;
    // System.out.println("before swapping "+ a + " "+ b);
    // a = a + b;
    // b = a - b ;
    // a = a - b;
    // System.out.println("after swapping "+ a + " "+ b);

    //Q10- write a program to factorial of given number
    // int fact = 1;
    // for (int i = n; i >= 1 ; i--){
    //     fact = fact * i ;
    // }
    // System.out.println(n+"!="+ fact);
    
    //Q11- write a program to print factorial of all prime numbners from the range 1 to 10
    //  for (int i = 1 ; i<=10 ; i++){
    //     int count = 0;
    //     for (int j =1 ; j <=i; j++){
    //         if(i%j==0){
    //             count ++;
    //         }
    //     }
    //     if(count == 2){
    //         int fact = 1;
    //         for (int n = i ; n >= 1; n--){
    //             fact = fact * n;
    //         }
    //         System.out.println(i + "!= " + fact);
    //     }
    //  }

    //Q12- write a program to check the given number is perfect number or not
    // int sum = 0;
    // for (int i = 1 ; i < n ; i++){
    //     if (n%i==0){
    //         System.out.println(i);
    //         sum = sum + i;
    //     }
    // }
    // System.out.println("Sum of n number is "+sum);
    // if(sum == n){
    //     System.out.println("It is a perfect number");
    // }
    // else{
    //     System.out.println("It is not a perfect number");
    // }
        
    //Q13- write a program to print all the perfect numbers from 1 to 100
    // for (int i = 1 ; i <=100 ; i ++){
    //     int sum = 0;
    //     for (int j = 1; j <i ; j++){
    //         if(i%j==0){
    //             sum = sum + j;
    //     }
    // }
    // if (sum == i){
    //     System.out.println(i + "It is a perfect number ");
    // }
    // else{
    //     System.out.println(i +"It is not a perfect number");
    // }
    // }
    //Q14- write a program to print first 10 fibonacii numbers.
    // int a = 0 , b = 1;
    // System.out.print(a+" "+ b+" ");
    //     for (int i = 1; i<=8; i++){
    //         int c = a + b;
    //         System.out.print(c + " ");
    //         a = b;
    //         b = c;
    //     }
    
    //Q15- Find the maximun numbers from 3 inputs 
    // Scanner sa = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int a = sa.nextInt();
    // Scanner sb = new Scanner (System.in);
    // System.out.println("Enter the number");
    // int b = sb.nextInt();
    // Scanner sc = new Scanner (System.in);
    // System.out.println("Enter the number ");
    // int c = sc.nextInt();
    // if ( a > b && a > c  ){
    //     System.out.println(a + " has the maximun value");
    // }
    // else if( b > a && b > c){
    //         System.out.println(b + "has the maximun value");
    //     }
    // else {
    //     System.out.println(c+ " has sthe maximun vallue");
    // }

}
}

