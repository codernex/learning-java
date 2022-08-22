<p>
Today i start learning java
<br>
In my first day of learning I learn Java Data type, variables & Input Output;
</p>

Basically There two data types in java:
<ol>
 <li>
    Primitive Data Types such as Byte, Char, Integer, Boolean, Long, Short, Float, Double


</li>

<li>
Non-Primitive Data types such as Array, String, Classes
</li>
</ol>

<p>
    There are multiple way to print something on terminal   
    <br>
   And Used Scanner class to take input from user.
</p>

```
/**
    Vaiable Declaration
*/
    type variableName=typedValue;
    
    int age=30;
    
 /**
    Print Something On terminal
 */  
 
    System.out.print(int) //Print data on same line
    
    System.out.println(int) //Print data on new line
    
 /**
 Take input from user
 **/
 
 import java.util.Scanner;
 
 Scanner sc= new Scanner(System.in);
 
 int age= sc.nextInt() //For Integer Input
 String str= sc.next() //It will take the first word as input
 
 str= sc.nextLine() //It will take whole sentence as input   

```