import java.util.Scanner;
public class practiceeee {
    
    public static void main(String[] args)
    //Procedence & Associativity 
     {
        //int a=6*5-44/2;
        /*
         * highest precedence  goes to the * and /. they are then 
         * evaluated on the basis of left to right associativity.
         * =30-34/2
         * =30-17
         * =13
         */
        //int b= 60/5-34*2;
        //System.out.println(a);
        //System.out.println(b);
        //int x=6;
        //int y=1;
        //int k=x*y/2;
        //System.out.println(k);
        //int a=10;
        //int b= 0;
        //int c= 0;
        //int d=b*b-(4*a*c)/(2*a);
        //System.out.println(d);

        
        // Cwh_10_resulting_data_type
        /*byte x= 5;
        int y = 6;
        short z=8;
        int a = y+z;
        float b= 6.54f+x;
        System.out.println(b);*/

        
        //Increment & Decrement Operators
        /* 
       int i=56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y=7;
        System.out.println(++y*8);*/

        // Study about "Strings"

       //String name = new String("CHANDAN");
       //String name = "CHANDAN";
      // System.out.print(name);
      // System.out.print(":"+name);
       //int a= 66;
       //float b = 5.6666f;
       //System.out.printf("the value of a is %d and the value of b is %f",a,b);
       //System.out.format("the value of a is %d and the value of b is %f",a,b);
       //Scanner sc = new Scanner(System.in);
       //String st = sc.next();
       //System.out.println(st);
       /*String a1 = new String("CHANDAN");
       String a = "CHANDAN";
       System.out.print(a);
       System.out.println(a1);*/

       /*String name="Chandan";
       int value = name.length();
       System.out.println(value); 
       
       String lstring = name.toLowerCase();
       System.out.println(lstring);
       String ustring = name.toUpperCase();
       System.out.println(ustring);*/

       /*String  nonTrimmedString = "    CHANDAN     ";
       System.out.println(nonTrimmedString);
       String trimmedString = nonTrimmedString.trim();
       System.out.println(trimmedString);*/
       //String name = "chandan";
       /* System.out.println(name.substring(6));
       System.out.println(name.substring(1,4));
       System.out.println(name.replace('a','p'));
       System.out.println(name.replace("cha", "rts"));
       System.out.println(name.startsWith("cha"));
       System.out.println(name.startsWith("aaa"));
       System.out.println(name.endsWith("an"));*/
       //System.out.println(name.charAt(4));
       //System.out.println(name.indexOf("da"));
      //String modifiedname="chandandan";
      //System.out.println(modifiedname.indexOf("cha"));
      //System.out.println(modifiedname.indexOf("dan",4));
      //System.out.println(modifiedname.lastIndexOf("dan",3)); 
      //System.out.println(name.equals("chandan"));
      //System.out.println(name.equals("cha"));
      //System.out.println(name.equalsIgnoreCase("chaNDan"));
      //System.out.println("i an chandu \n and fandu");

      //Problem 1

      /*String name = "Chandan Parida";
      name = name.toLowerCase();
      System.out.println(name);
      //problem 2

      String nam = "Sridhar Kumar Parida";
      nam=nam.replace(" ","_");
      System.out.println(nam);
      //problem 3
      String rep = "Dear <|Name|>,Thanks a lot !";
      rep=rep.replace("<|Name|>","Chandan");
      System.out.println(rep);

      //Problem 4
      String mystring="This contains     double and tripple spaces";
      System.out.println(mystring.indexOf("  "));
      System.out.println(mystring.indexOf("   "));
      System.out.println(mystring.indexOf("     "));
      //Problem 5
      String letter="Dear chandan,\n\t This java course is nice.\n\t thanks!";
      System.out.println(letter);*/


      //Conditionals in Java


      /*int age = 17;
      boolean ram = (age>=18);
      if(ram)
      {
        System.out.println("Yes boy, you can drive !!");
      }
      else{
        System.out.println("No boy, You cannot drive yet !!");
      }
      */
    //   boolean a=true;
    //   boolean b=false;
      /*if (a||b){
        System.out.println("yes");
      }
      else{
        System.out.println("No");
      }*/

    //   System.out.println("For Logical NOT..");
    //   System.out.print("NOt (A) is ");
    //   System.out.println(!a);
    //   System.out.print("NOt (B) is ");
    //   System.out.println(!b);


   // CWH class 17
  //  int age;
  //  System.out.print("ENTER YOUR AGE : ");
  //  Scanner sc = new Scanner(System.in);
  //  age= sc.nextInt();
   /*if (age>56){
    System.out.println("You are experianced!");
   }
    else if (age>46){
        System.out.println("You re semi-experienced!");
    
   }
   else if (age>36){
    System.out.println("You are semi-semi-experienced!");
   }
   else {
    System.out.println("You are not experienced!");
   }*/

   //CWH class 18

   //switch case control statements
  //  switch (age) {
  //   case 18:
  //   System.out.println("You are going to become a adult!");
      
  //     break;
  //     case 25:
  //     System.out.println("You are going to join a job !");
  //     break;
  //     case 60:
  //     System.out.println("You are going to get retired !");
  //     break;
   
  //   default:
  //   System.out.println("Enjoy your life !");
       
  //  }

       //Chapter 4 _Practice_ CWH_19

       //QUS 1
      //  int m1,m2,m3;
      //  Scanner sc=new Scanner(System.in);
      //  System.out.print("Enter your mark in physics : ");
      //  m1=sc.nextByte();
      //  System.out.print("Enter your mark in Chemistry : ");
      //  m2=sc.nextByte();
      //  System.out.print("Enter your mark in Mathmatics : ");
      //  m3= sc.nextByte();
      //  Float avg = (m1+m2+m3)/3.0f;
      //  if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
      //  System.out.println("Congratulations, You are been promoted !");
      //   }
      //   else{
      //     System.out.println("Sorry , You have not been promoted !");
      //   }

      // QUS_3

      // Scanner sc = new Scanner(System.in);
      // System.out.println("ENTER YOUR MONTHLY INCOME IN LAKHS");
      // Float tax = 0f;
      // Float income = sc.nextFloat();
      // if(tax<2.5f){
      //   tax=tax+ 0f;
      // }
      // else if (income>2.5f &&  income<5f){
      //   tax= tax +0.05f*(income-2.5f);
      // }
      // else if (income>5f&&income<=10f){
      //   // tax= tax +((income*20)/100);
      //   tax=tax+0.05f*(5.0f-2.5f);
      //   tax= tax +0.2f*(income-5f);
      // }
      // else if (income>10f&&income<=20f){
      //   tax=tax+0.05f*(5.0f-2.5f);
      //   tax=tax+0.2f*(10.0f-5f);
      //   tax= tax +0.3f*(income-10.0f);
      //   //tax= tax +((income*30)/100);
      //   // tax= tax +;
      // }
      // System.out.print("Total tax paid by you is :" +tax);

      // Scanner sc = new Scanner(System.in);
      // System.out.print("ENTER YOUR INCOME IN LAKHS :");
      // Float tax = 0f;
      // float income =sc.nextFloat() ;
      // if(income>=2.5f){
      //   tax=tax+0;
      // }
      // else if(income>2.5f&&income<5.0f){
      //   tax=tax+0.05f*(income-2.5f);

      // }
      // else if (income>=5.0f&&income<10.0f){
      //   tax=tax+0.05f*(5.0f-2.5f);
      //   tax=tax*0.2f*(income-5f);

      // }
      // else if (income>10.0f){
        
      //   tax=tax+0.05f*(5.0f-2.5f);
      //   tax=tax+0.2f*(10.0f-5.0f);
      //   tax=tax*0.3f*(income-10f);

      //  }
      //  System.out.println(tax);


      //QUS_4
      // Scanner sc=new Scanner(System.in);
      // System.out.print("WRITE A NUMBER IN BETWEEN 1-7 : ");
      // int day = sc.nextInt();
      // switch (day) {
      //   case 1 -> System.out.print("MONDAY");
      //   case 2 -> System.out.print("TUESDAY");
      //   case 3 -> System.out.print("WED");
      //   case 4 -> System.out.print("THUS");
      //   case 5 -> System.out.print("FRI");
      //   case 6 -> System.out.print("SAT.");
      //   case 7 -> System.out.print("SUNDAY");


      //QUS_5

      //CWH_20_challange rock,sciccer

      


        // System.out.println();
        // System.out.println("WELCOME TO ROCK, PAPER, SCISSORS GAME ");
        // Scanner input = new Scanner(System.in);

        // int user =-1 ;
        // while (user < 0 || user > 2) {
        //     System.out.println("CHOOSE YOURS: Rock(0), Paper(1), Scissors(2): ");
        //     if (input.hasNextInt()) {
        //         user = input.nextInt();
        //         if (user < 0 || user > 2) {
        //             System.out.println("Invalid choice. Please choose 0, 1, or 2.");
        //         }
        //     } else {
        //         System.out.println("Invalid input. Please enter a number.");
        //         input.next(); // consume the invalid input
        //     }
        // }

        // int computer = (int) (Math.random() * 3);
        // System.out.print("The computer chose: ");
        // switch (computer) {
        //     case 0:
        //         System.out.println("Rock");
        //         break;
        //     case 1:
        //         System.out.println("Paper");
        //         break;
        //     case 2:
        //         System.out.println("Scissors");
        //         break;
        // }

        // System.out.print("You chose: ");
        // switch (user) {
        //     case 0:
        //         System.out.println("Rock");
        //         break;
        //     case 1:
        //         System.out.println("Paper");
        //         break;
        //     case 2:
        //         System.out.println("Scissors");
        //         break;
        // }

        // if (computer == user) {
        //     System.out.println("It is a draw!");
        // } else {
        //     boolean win = (user == 0 && computer == 2) ||
        //                   (user == 1 && computer == 0) ||
        //                   (user == 2 && computer == 1);
        //     if (win) {
        //         System.out.println("You won!! \nCongratulations...");
        //     } else {
        //         System.out.println("You lose!! \nTry again...");
        //     }
        // }
          
          
      // }

      //CWH_CLS_21_LOOPS

      // System.out.println("Using loops :");
      // int i = 1;
      // while(i<=3){
      //   System.out.println(i);
      //   i++;
      //   System.out.println("Finish");
      //   while (true) {
      //     System.out.println("Randwa hai tu");
      //   }
      // }


      //CWH_22_CH4_do_While

      // int a = 10;
      // while (a<=5) {
      //   System.out.println(a);
      //   a++;
      // }
      // int b=0;
      // do {
      //   System.out.println(b);
      //   b++;
      // } while (b<=45 );
      
      //CWH_23_CH4_FOR_LOOPS 
      // for (int i = 1;i<=10;i++){
      //   System.out.println(i);
      // }
      // int n = 10;
      // for (int i = 0;i<n;i++){
      //   System.out.println(2*i+1);
      // }
      // for (int i = 5;i>0;i++){
      //   System.out.println(i);
      // }

      //CWH_24_BREAK_AND_CONTINUE

      // for  (int  i=0;i<50;i++){
      //   System.out.println(i);
      //   System.out.println("Java is great");
      //   if(i==2){
      //     System.out.println("Ending the loop");
      //     break;
      //   }
      // }





      // for  (int  i=0;i<50;i++){
        
      //   if(i==2){
      //     System.out.println("Ending the loop");
      //     continue;
      //   }
        
      //}



      // int i=0;
      // do{
      //   i++;
      //   if(i==2){
      //     System.out.println("Ending the loop");
      //     continue;
      //   }
      //   System.out.println(i);
      //   System.out.println("Java is great");
      // }
      // while(i<5);
      // System.out.println("Loops ends here");


     //CWH_25_PRACTICE_SET


     //PROBLEM_01

    //  int n = 4;
    //  for (int i=n;i>0;i-- ){
    //   for(int j=0;j<i;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println("\n");
      
    //  }
     

     //PROBLEM_02

    //  int sum = 0;
    //   int n=10;
    //   for(int i=0;i<n;i++){
    //     sum=sum+(2*i);
    //   }
    //   System.out.print("sum of even numbers is :");
    //   System.out.println(sum);

    //PROBLEM_03

    // System.out.println();
    // System.out.println("HERE YOU CAN GET THE NUMBER TABLE !");
   
    // Scanner sc = new Scanner(System.in);
    //   System.out.print("ENTER THE NUMBER :");
    //   int n =sc.nextInt() ;
    
    // for( int i=1;i<=10;i++){
    //   System.out.printf("%d X %d = %d \n" ,n,i,n*i);
    // }

    // System.out.println();
    // System.out.println("HERE YOU CAN GET THE NUMBER TABLE !");
    // Scanner sc = new Scanner(System.in);
    //   System.out.print("ENTER THE NUMBER :");
    //   int n =sc.nextInt() ;
    // for( int i=10;i>=1;i--){
    //   System.out.printf("%d X %d = %d \n" ,n,i,n*i);
    // }


    //PROBLEM_06


    //  int n=5;
    //  int i=1;
    //  int factorial=1;
    //  while (i<=n) {
    //   factorial *=i;
    //   i++;
    //  }
    //  System.out.println(factorial);


    //PROBLEM_09


  //   System.out.println();
  //   System.out.println("HERE YOU CAN GET THE NUMBER TABLE !");
  //   Scanner sc = new Scanner(System.in);
  //     System.out.print("ENTER THE NUMBER :");
  //     int n =sc.nextInt() ;
      
  //   for( int i=10;i>=1;i--){
  //     System.out.printf("%d X %d = %d \n" ,n,i,n*i);
      
  //     int sum = 0;
    
  //   for( int i=10;i>=1;i--){
  //     sum += n*1
  //     System.out.println(sum);
      
  //   }
  // }


  //CWH_26_ARRAY


  //There are three main ways to creat an arrey in java
  //1. Declaration and memory allocation



    // 2. Declaratin and then memory allocation

    // int [] marks = new int[5];
    // marks[0]=99;
    // marks[1]=45;
    // marks[2]=56;
    // marks[3]=87;
    // marks[4]=74;
    // System.out.println(marks[0]);

    // 3. Declaration , Memory allocation and initialization together

    // int []marks = {98,78,56,89,90};
    // System.out.println(marks[4]);

    //CWH_27_ARRAY
    
    // float []marks = {98,78,56,89,90};
    // System.out.println(marks.length);
    // System.out.println(marks[3]);

    //or

     
    //  String[]students = {"chandan","ramu","ranga","shiru","abhi"};
    //  System.out.println(students.length);
    //  System.out.println(students[2]);
    
     // live method

     //int []marks = {98,78,56,89,90};
    //System.out.println(marks.length);
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // System.out.println(marks[3]);
    // System.out.println(marks[4]);

    // Displaying the array (for loop)

    // for (int i=0;i<marks.length;i++){
    //   System.out.println(marks[i]);
    // }
    //reverce order using for loop

    // for(int i=marks.length -1;i>=0;i--){
    //   System.out.println(marks[i]);
    // }

    // Printing using for-each loop

    // int []marks = {98,78,56,89,90};

    // System.out.println("Printing using for-each loop");
    // for(int element:marks){
    //   System.out.println(element);
    // }


    //CWH_28_2D ARRAY


    //  int [][]flats;   //2D array
    //  flats = new int [2][3];
    //  flats[0][0]=101;
    //  flats[0][1]=102;
    //  flats[0][2]=103;
    //  flats[1][0]=201;
    //  flats[1][1]=202;
    //  flats[1][2]=203;

    //  System.out.println("Printing a 2D array using loop");
    //  for(int i=0;i<flats.length;i++){
    //   for(int j = 0;j<flats[i].length;j++){
    //     System.out.print(flats[i][j]);
    //     System.out.print(" ");
    //   }
    //   System.out.println(" ");
    //  }

    //CWH_29_PRACTICE SET_ARRRAY


    //PROBLEM_01


    // Float[]marks ={45.6f,65.87f,99.23f,77.34f,89.98f};
    // float sum = 0;
    // for(float element:marks){
    //   sum = sum + element;

    // }
    // System.out.println();
    // System.out.println("The sum of these numbers is" + sum);
    // System.out.println();

    //PROBLEM_02

    // Float[]marks ={45.6f,65.87f,99.23f,77.34f,89.98f};
    // float num = 45.9f;
    // boolean isInArray = false;
    // for(float element:marks){
    // if(num == element){
    //   isInArray = true;
    //   break;
    // }

    // }
    // if (isInArray){
    //   System.out.println("The value is present in the array");
    // }
    // else{
    //   System.out.println("The value is not present in the array");
    // }

    //PROBLEM_03

    //   Float[]marks ={45.6f,65.87f,99.23f,77.34f,89.98f};
    // float sum = 0;
    // for(float element:marks){
    //   sum = sum + element;
    // }
    // System.out.println("The value of avarage marks is "+sum/marks.length);


    // PROBLEM_04



    // int [][] mat1 = {{1,2,3},
    //                  {4,5,6}};
    // int [][] mat2 = {{2,4,9},
    //                  {6,8,2}};
    // int [][] result ={{0,0,0},
    //                   {0,0,0}};
    // for (int i=0;i<mat1.length;i++){
    //   for(int j =0;j<mat1[i].length;j++){
    //     System.out.format("Setting value for i=%d and j = %d\n",i,j);
    //     result[i][j]=mat1[i][j] + mat2[i][j];
    //   }
    // }
    // for (int i=0;i<mat1.length;i++){
    //   for(int j =0;j<mat1[i].length;j++){
    //     System.out.print(result[i][j]+" ");
    //     result[i][j]=mat1[i][j] + mat2[i][j];
    //   }
    //   System.out.println(" ");
    // }


    //PROBLEM_05


   /* int [] arr = {1,2,3,4,5,6,7};
    int l = arr.length;
    int n= Math.floorDiv(l,2);
    int temp; 
    for(int i =0;i<n;i++){
      //swap a[i] and a[l-1-i]
      //a  b  temp
      //|4| |3|  | |
      temp= arr[i];
      arr[i] = arr [l-i-1];
      arr[l-i-1] = temp;
    }
    for( int element:arr){
      System.out.print(element + "  ");
    } 
     */

     //PROBLEM_06
   
    //  int [] arr = {1,21,393,4,75,6,7};
    //  int max = 0;
    //  for(int e:arr){
    //   if(e>max){
    //     max=e;
    //   }
    //  }
    //  System.out.println();
    //  System.out.println("The value of the maximum eement in this array is : "+ max);
    //  System.out.println();

    //PROBLEM_07

    //Use the logic 

    // System.out.println(Integer.MIN_VALUE);
    // System.out.println(Integer.MAX_VALUE);

    // boolean isShorted = true;
    // int [] arr = {1,3,45,67,89,94};
    // for( int i = 0;i<arr.length-1;i++){
    //   if(arr[i]>arr[i+1]){
    //     isShorted =false;
    //     break;
    //   }
    // }
    // if(isShorted){
    //   System.out.println("The array is sorted");
    // }
    // else{
    //   System.out.println("The array is not sorted");
    // }

    //CWH_31_METHODS_OF_JAVA

     






    

    











   
      
    














      }
      

     }

