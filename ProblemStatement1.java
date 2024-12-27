/*
Problem Statement:
Take input from a student their name,age and class
take input their marks scored in English,Maths,Science,Sst and Hindi subjects out of 100
output their percentage along with their personal records
 */

import java.sql.SQLOutput;
import  java.util.Scanner;
public class ProblemStatement1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Class: ");
        int cls=sc.nextInt();

        System.out.println("Enter Marks scored in English: ");
        int eng=sc.nextInt();
        System.out.println("Enter Marks scored in Maths: ");
        int math=sc.nextInt();
        System.out.println("Enter Marks scored in Science: ");
        int sci=sc.nextInt();
        System.out.println("Enter Marks scored in Sst: ");
        int sst=sc.nextInt();
        System.out.println("Enter Marks scored in Hindi: ");
        int hindi=sc.nextInt();

        int totalmarks = eng+math+sci+sst+hindi;


        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Class :"+cls);
       double percent= ((double)totalmarks/500)*100;

        System.out.println("The percentage scored by "+name+" is : "+ percent);

    }
}
