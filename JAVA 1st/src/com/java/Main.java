package com.java;

import java.security.PublicKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        employee name = new employee();
//        name.employeeid();
//        name.employeename();
//        System.out.println("employeeid-" + name.employeeid());
//        System.out.println("name-" + name.employeename());
//        department depart = new department();
//        depart.getdepartmen1();
//        System.out.println("department-" + depart.getdepartmen1());
//        accounts acc = new accounts();
//        acc.getabsentdays();
//        acc.getpresentdays();
//        System.out.println("present days-" + acc.getabsentdays());
//        System.out.println("absent days-" + acc.getpresentdays());
//        eben address = new eben();
//
//        System.out.println("address-" + address.getaddress());
//        System.out.println("hose no-" + address.gethouseno());
//        mobiles oppo = new mobiles();
//        System.out.println("vivo-" + oppo.brandValueIndia());
//        System.out.println("vivo-" + oppo.brandValueWW());
//        cricket marketvalue = new cricket();
//        System.out.println("kholi Market Value-" + marketvalue.neymar());
//        accident patient = new accident();
//        System.out.println("no of car accident-" + patient.getcaraccident());
//        System.out.println("no of bike accident-" + patient.getbikeaccident());
//        System.out.println("hospital name-" + patient.gethospitalname());
//        System.out.println("no of beds" + patient.getnoofbeds());
//        System.out.println("no of rooms-" + patient.getnoofrooms());
//        treatments treat = new treatments();
//        System.out.println(treat.homecare());


//
//        String input="agettkgaee";
//        int i=0;
//        for (i=0;i<input.length();i++);
//        {
//            char c=input.charAt(i);
//            int count=0;
//            for (int j=i+1;j<input.length();j++);{
//                if (input.charAt('j')==c){
//                    count=count+1;
//                }
//        }
//        if (count==0){
//           String s=Character.toString(c);
//        }
//        }
        calculation cal=new calculation();
        int total=cal.sum();
        System.out.println(total);
        cal.getfullname();
        System.out.println(cal.getfullname());
        String myname=cal.getfullname();
        System.out.println(myname);
        cal.horsename();

    }
}
class calculation{
    public int sum(){
        int num1=2;
        int num2=4;
        int sum=num1+num2;
        return sum;
    }
    public String getfullname(){
        String firstname="jebin";
        String lastname="jeee";
        String fullname=firstname+lastname;
        if (firstname=="jebin"){
            return fullname;
        }
        else {return "ponsing";}
    }
    public void horsename(){
        int a=12;
        System.out.println("horsename");

    }
}

//class Employee{
//    String user="";
//    String pass="";
//    public void GetLoginDetails(String username, String password){
//        user=username;
//        pass=password;
//        System.out.print(user);
//        System.out.print(pass);
//    }
//}











/*	// write your code here
        String name="helo world";
        System.out.println(name);

        int ageOfPerson=18;
        boolean indianCitizen=true;
        System.out.println(ageOfPerson==18&&indianCitizen==true);

        int ageOfPerson1=18;
        boolean Citizen=false;
        System.out.println(ageOfPerson1==18||Citizen==true);

        String personName;
        int rollNO;
        String citizen;
        Scanner input=new Scanner(System.in);
        System.out.println("personName-");
        System.out.println("rollno-");
        System.out.println("citizen-");
        personName=input.next();
        rollNO=input.nextInt();
        citizen=input.next();
        System.out.println("personName-"+personName);
        System.out.println("rollno-"+rollNO);
        System.out.println("citizen-"+citizen);

        float inkpen=50;
        float ballpen=20;
        float cost1;
        Scanner input1=new Scanner(System.in);
        cost1=input.nextFloat();
        if(cost1>=inkpen){
            System.out.println("you can buy your inkpen");
        }else if(cost1>=ballpen){
            System.out.println("you can buy your ballpen");
        }else{
            System.out.println("you cant buy a pen");
        }

    }
}

        class shape
        {
            int length=10,width=20;
            public void display()
            {
                System.out.println("I am the shape - Super class");
            }
        }
class circle
{
    float radius, centerAxis=0.0f; // state, properties, data members of a class
    int rims=15;
    float spokes=150;

    public void drawball(){
        System.out.println();
    }
    public void ring(){
        System.out.println();
    }
    public void wheel(){
        System.out.println();
    }

    public void display() // functionality
    {
        System.out.println("I am the shape - Super class");
    }
}
class vechile extends circle
{
    int length=10,width=20;
    circle circleObject=new circle();





}
class triangle
{
    int length=10,width=20;
    public void display()
    {

        System.out.println("I am the shape - Super class");
    }
}

         class rectangle extends shape {
             public void drawRectangle() {
                 //length*width - inherit the length and width members from the super class - shape
                 shape measurementObject = new shape();
                 System.out.println("Area of rectangle is" + measurementObject.length * measurementObject.width);
                 System.out.println("I am the circle class - Entered to draw circle");
             }

             public static void main(String args[]) {
//                rectangle obj= new rectangle();
//                obj.drawRectangle();
                 //drawRectangle();
                 for (int i = 0; i < 2; i++) { //outer loop executes one time
                     for (int j = 0; j < 2; j++) { // inner loop executes until the condition is false. 0,1,2
                         System.out.print("*");// when j=0; it prints 1 *; j=1 it prints 1 * totally 2 * j=2- condition false
                         // therefore it redirects to the outer loop/parent loop
                     }
                     System.out.println("\n");
                 }

 */





//class garndfather{
//    public String getgrandpaDoorNO(){
//        return "6a";
//    }
//    public String getGrandpaAddress(){
//        return "tambamaa";
//    }
//    public String getGrandpaCarNO() {
//        return "TN0078";
//    }
//}
//class father extends garndfather {
//    public String getdoorNo() {
//        return "5a";
//    }
//
//    public String getAddress() {
//        return "tambaram";
//    }
//
//    public String getCarNO() {
//        return "TN007";
//    }
//}
//class jebin{
//
//    public String getdoorNo(){
//        return "5a";
//    }
//   // public String getAddress(){
//    //    return "tambaram";
//    //}
//    public String getCarNO() {
//        return "TN007";
//    }
//}
//
//
//class  clg{
//    public String clgname() {
//        return "karunya";
//    }
//}
//class student extends clg{
//    String name="";
//    public String getstudentname(){
//        return name;
//    }
//}
//class hari{
//    public String getaddress(){
//        return "camproad";
//    }
//    public int gethouseno(){
//        return 33;
//    }
//}
//class eben extends hari{
//
//}
//
//class employee{
//    public String employeename(){
//        return "jenim";
//    }
//    public String employeeid(){
//        return "192hbd8";
//    }
//}
//class department extends employee{
//    public String getdepartment(){
//        return "mech";
//    }
//    public String getdepartmen1(){
//        return "arts";
//    }
//    public String getdepartment2(){
//        return "computer";
//    }
//}
//class accounts extends department{
//    public int getpresentdays(){
//        return 55;
//    }
//    public int getabsentdays(){
//        return 33;
//    }
//}
//class mobiles{
//    public String brandOppo(){
//        return "";
//    }
//    public String brandValueIndia(){
//        return "100m";
//    }
//    public String brandValueWW(){
//        return "1230m";
//    }
//}
//class vivo extends mobiles{
//
//}
//
//class football{
//    public String playermarketvalue(){
//        return "";
//    }
//    public String messi(){
//        return "100m";
//    }
//    public String neymar(){
//        return "222m";
//    }
//}
//class cricket extends football{
//    public String Kholi(){
//        return "";
//    }
//
//}
class hospital{
    public String gethospitalname(){
        return "GH";
    }
    public float gethospitalincome(){
        return 45;
    }
    public int getnoofbeds(){
        return 200;
    }
    public int getnoofrooms(){
        return 200;
    }
}
class accident{
    public float getbikeaccidentratio(){
        float acc=56.98f;
        if (acc>100){
            System.out.println("bike acc");
        }
        return 44;
    }
    public int getcaraccident(){
        return 76;
    }
    public int getcurrentshock(){
        return 37;
    }
}
class treatments {
    public int indianpatient(){
        return 76;
    }
    public float indianhospitalinvestment(){
        return 550.97f;
    }
}
class patients{
    public int nonindianpatient(){
        return 876;
    }
    public boolean getvoternationality(String countryName){
        boolean indian=true;
        //String country="";

        if (countryName=="Indian"){
            //System.out.println("you can get treatment");
            return true;
        }
        else {
            //System.out.println("you cannot");
            return false;
        }
        //return true;
    }
}

















