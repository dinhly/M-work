import java.util.Scanner;
public class rocketshipmeth {

 public static void main (String[] args){
  Scanner input = new Scanner (System.in);
  System.out.println("Size ? ;D");
  
  int num = input.nextInt();
  
  coneM(num);
  separatorM(num);
  firstboxp1M(num);
  fboxp2M(num);
  separatorM(num);
  secondboxp1M(num);
  sboxp2M(num);
  separatorM(num);
  coneM(num);
  
 }
 public static void coneM(int size){
   
   int line = 0;
   int space = 0;
   int slashes = 0;
  
  for(line = 1 ; line <= (size * 2 - 1) ; line++){ //Cone 
   
   for(space = size * 2 -1 ; space >= line; space--){
    System.out.print(" "); 
   }
   for(slashes = line ; slashes >= 1; slashes--){
    System.out.print("/");
   }
   System.out.print("**");
   for(slashes = line ; slashes >= 1; slashes--){
    System.out.print("\\");
    }
   System.out.println();
   }
  }

 public static void separatorM(int size){
  
  int equalStar = 0;
 
  System.out.print("+"); //Seperator
      for (equalStar = 1; equalStar <= size * 2; equalStar++){
       System.out.print("=*");

      }
      
   System.out.println("+"); 
 }
      
 public static void firstboxp1M(int size){ //First Box 1
  
  int line = 0;
  int dot = 0;
  int half = 0;
  int slashCombo = 0;

  for(line = 1 ; line <= size ; line++){ 
   System.out.print("|");
   
   for (half = 1;half <= 2; half++){
    for(dot = size - 1;dot >= line; --dot){
     System.out.print(".");
     }
    for(slashCombo = 1; slashCombo <= line; slashCombo++){
     System.out.print("/\\");
    }
    for(dot = size - 1 ;dot >= line; --dot){
    System.out.print(".");
    }
   }
   System.out.println("|"); 
    }
 }

 public static void fboxp2M(int size){ //First Box  2
  
   int line = 0;
   int dot = 0;
   int half = 0;
   int slashCombo = 0;

  for(line = 1 ; line <= size ; line++){ 
   System.out.print("|");
   for (half = 1;half <= 2; half++){
    for(dot = 2; dot <= line;++dot){
     System.out.print(".");
     }
    for(slashCombo = size; slashCombo >= line ;slashCombo--){
     System.out.print("\\/");
    }
    for(dot = 2; dot <= line;++dot){
     System.out.print(".");
    }
   }
   System.out.println("|"); 
    }
 }

 public static void secondboxp1M(int size){ //Second box  1
   
   int line = 0;
   int dot = 0;
   int half = 0;
   int slashCombo = 0;
  
   for(line = 1 ; line <= size ; line++){ 
    System.out.print("|");
    for (half = 1;half <= 2; half++){
     for(dot = 2; dot <= line;++dot){
      System.out.print(".");
      }
     for(slashCombo = size; slashCombo >= line ;slashCombo--){
      System.out.print("\\/");
     }
     for(dot = 2; dot <= line;++dot){
      System.out.print(".");
     }
    }
    System.out.println("|"); 
     }
 }

 public static void sboxp2M(int size){ //Second box  2
    
    int line = 0;
    int dot = 0;
    int half = 0;
    int slashCombo = 0;
 
    for(line = 1 ; line <= size ; line++){
     System.out.print("|");
     
     for (half = 1;half <= 2; half++){
      for(dot = size - 1;dot >= line; --dot){
       System.out.print(".");
       }
      for(slashCombo = 1; slashCombo <= line; slashCombo++){
       System.out.print("/\\");
      }
      for(dot = size - 1 ;dot >= line; --dot){
      System.out.print(".");
      }
     }
     System.out.println("|"); 
     
     }

 }
 
}