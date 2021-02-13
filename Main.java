import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Please, enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();

    scanner.close();
    
    greetUser(name);
  }

  //I will use void because there is nothing to return, this method just should print something out  
  public static void greetUser(String name){
      System.out.println("Hi there " + name);
  } 
}