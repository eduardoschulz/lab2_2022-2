package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {
    Scanner input = new Scanner(System.in);

public String inputS(String s){
    System.out.printf("%s", s);
    String recv;
    try{
        recv = input.nextLine();
    }catch (InputMismatchException e){
        input.reset();
        input.next();
        return " ";
    }
    return recv;
}
public String inputS(){
    String recv;
    try{
        recv = input.nextLine();
    }catch (InputMismatchException e){
        input.reset();
        input.next();
        return " ";
    }
    return recv;
}
public int inputInt(String s){
    System.out.printf("%s", s);
    int recv;
    try{
       recv = input.nextInt();
    }catch (InputMismatchException e){
       input.reset();
       System.out.printf("\nOpção Inválida! Digite outro número: ");
       input.next();
       return -1;
    }
    return recv;
}
public int inputInt(){
    int recv;
    try{
        recv = input.nextInt();
    }catch (InputMismatchException e){
        input.reset();
        System.out.printf("\nOpção Inválida! Digite outro número: ");
        input.next();
        return -1;
    }
    return recv;
}}