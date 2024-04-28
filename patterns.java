import java.util.Scanner;
import java.io.*;

public class patterns {

    
    // static void  name(int x , int n){
    //     if(x>n) return ;
        
    //     System.out.println("Coding Ninjas");
    //     name (x+1, n);
    // }
    public static void main(String[] args) {

        //CMSS Interview Questions 
        //Revrse a string
        // String str= "SahilBhoslae";
        // String nstr="";
        // char ch;
        // for(int i=0; i<str.length(); i++){
        //     ch= str.charAt(i);
        //     nstr = ch+nstr;
        // }
        // System.out.println("Reversed string ="+ nstr);
        
        //factorial of a number
        // int n = 5;
        // int fact = 1;
        // for(int i = 1; i<=n; i++){
        //     fact= fact * i;
        // }
        // System.out.println(n + "!="+fact);

        // sum of n number 
        // int n = 10;
        // int sum = 0;
        // for(int i=1; i<=n; i++){  
        //     if(i%2!=0){
        //         sum = sum + i;
        //         System.out.println(i);
        //     }
        // }
        // System.out.println(sum);

        //abcd pattern
        // for (int i = 4; i>=1;i--){
        //     char ch = 'a';
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        //1 - 0 pattern
        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if (sum%2==0) {
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        //Pyramid pattern
        // int n = 4;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        


    
        //Hollow Rectangle
        // for (int i=1; i<=a; i++){
        //     for (int j =1; j<=b; j++){
        //         if (i==1 || j==1 || i==a || j==b) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    
        //Half Pyramid
        // for (int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //Inverted half pramids
        // for (int i=a; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        //Inverted Half Pyramid and rotate by 180 deg
        // for(int i=1; i<=a; i++){
        //     //for spaces
        //     for (int j =1; j<=a-i; j++){
        //         System.out.print(" ");
        //     }
        //     //for star 
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        //Half Pyramid with numbers
        // for (int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Inverted Half Pyramid with number
        // for(int i=1; i<=a; i++){
        //     for(int j=1; j<=a-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Floyd's triangle
        // int num=1;
        // for(int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }

        //0-1 Triangle
        // for(int i =1; i<= a; i++){
        //     for(int j=1; j<=i; j++){
        //         int sum = i+j;
        //         if (sum%2==0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Print number in pyramid format 
        // int n = 5 ;
        // for (int i = 1; i<=n; i++){
        //     for(int j=1 ; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j =1; j<=i; j++){
        //     System.out.print(i+" ");
        //     }
        // System.out.println();  
        // }     
    
        // int n= 4;
        // for(int i =1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
    //Classwork
    
    //Normal Star 5*5
    // int n = 5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1; j<=n; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //Candy Pattern 
    // int a = 3;
    // int b = 5;
    // for (int i =1 ; i<=b; i++){
    //     for(int j =1; j<=b; j++){
    //         if (i==1||i==a || (j==1 && i<=a)||(j==5 && i<=a)||(j==a && i>=a)) {
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }

    //Hollow pattern
    // int n=2;
    // for(int i=1; i<=n; i++){
    //     //for spaces
    //     for(int j =1; j<=n; j++){
    //         System.out.print(" ");
    //     }
    //     //for star
    //     for(int j=2; j<n-2;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    
    //SLant Line of Star 
    // int b = 5;
    // for (int r =1 ; r<=b; r++){
    //     for(int c =1; c<=b; c++){
    //         if (r==c){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }

    //Inverse slant 
    // int b = 5;
    // for (int r =1 ; r<=b; r++){
    //     for(int c =1; c<=b; c++){
    //         if (r+c==6){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }

    //No cross pattern
    // int n = 5;
    // for(int i =1; i<=n; i++){
    //     for(int j=1; j<=n;j++){
    //         if(!(i==j) && !(i+j==6)){
    //             System.out.print(" * ");
    //         }
    //         else{
    //             System.out.print("   ");
    //         }
    //     }
    //     System.out.println();
    // }
    
    //Valley Pattern
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     for(int j=1; j<=2*(n-i); j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i; j>=1; j--){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number");
    // int n =  sc.nextInt();

    
//     for(int i=1; i<=n;i++){
//         for(int j=1; j<=n;j++){
//             if(i==1 || j==1 || i==n ||j==n ||(j+i==6)){
//                 System.out.print(i);
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }


// for(int i=1; i<=n;i++){
//     for(int j =1 ; j<=n-i; j++){
//         for(int j=1; j<=n-i; j++){
//             System.out.println(" ");
//         }
//         for
//     }
//     System.out.println();
// }

//              for(int i=1; i<=n; i++){
//             //for spaces
//             for (int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             //for star 
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

    //     int num =0;
    //     for(int i=1; i<=n; i++){
            

    //         for (int j =1; j<=n; j++){
    //             if(i<=j){
    //                 System.out.print(num);
    //                 num++;
    //             } 
    //             else{
    //                 System.out.print(" ");
    //             }
    //     }
    //     System.out.println();
    // }
    
        // for(int i=1; i<=n; i++){
        //     for (int j =1; j<=n; j++){
        //         if(i+j>=6){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }      
        //     }
        //     System.out.println();

        // }


        // int sum =0;
		// int og = n;
		// while(n!=0){
            
		// 	int d = n%10;
		// 	sum = sum + (d*d*d);
		// 	n = n/10;
		// }
		// if(sum==og){
		// 	System.out.println("true");
		// }
		// else{
		// 	System.out.println("false");

		// }

      

        

    }
}
