import java.util.*;
import java.io.*;
 class gradecalculator {
   public static void main(String[] args) {
    int n_sub,total=0;
    float avarage;
    int sub[]= new int[20];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total number of subjects");
    n_sub = sc.nextInt();
    System.out.println("Enter the marks of each subject");
    try{
    for(int i=0;i<n_sub;i++){
        sub[i]=sc.nextInt();
        total= total+sub[i];
    }
    avarage=total/n_sub;
    if(avarage>=80){
        System.out.println("You have achieve 'A' grade");
    }
    else if(80>avarage&&avarage>=70){
        System.out.println("You have achieve 'B' grade");
    }
    else if(70>avarage&&avarage>=60){
        System.out.println("You have achieve 'C' grade");
    }
    else if(60>avarage&&avarage>=50){
        System.out.println("You have achieve 'D' grade");
    }
    else if(50>avarage&&avarage>=33){
        System.out.println("You have achieve 'E' grade");
    }
    else if(33>avarage&&avarage>=0){
        System.out.println("You have achieve 'F' grade");
        System.out.println("Bad luck please try next year");
    }
   } 
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Some error occured");
    }
}
}