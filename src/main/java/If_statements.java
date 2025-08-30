/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cpedr
 */
public class If_statements {
public static void main(String args[]){
    int time =10; 
    boolean Rain = false ;

if(!Rain){
    System.out.print("It is not raining");
}   
else{
System.out.print("It is raining");
}
String timeResult = (time == 10) ? "It is still noon":"It is daytime ";
System.out.print(timeResult);
}
}
