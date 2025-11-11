// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
   public NumberGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      byte var3 = 1;
      byte var4 = 100;
      byte var5 = 7;
      int var6 = 0;
      int var7 = 1;
      boolean var8 = true;
      System.out.println("\ud83c\udfaf Welcome to the Number Guessing Game!");

      while(true) {
         while(var8) {
            System.out.println("\n--- Round " + var7 + " ---");
            int var9 = var2.nextInt(var4 - var3 + 1) + var3;
            int var10 = 0;
            boolean var11 = false;
            System.out.println("I'm thinking of a number between " + var3 + " and " + var4 + ".");
            System.out.println("You have " + var5 + " attempts to guess it!");

            while(var10 < var5) {
               System.out.print("Attempt " + (var10 + 1) + ": Enter your guess → ");
               if (!var1.hasNextInt()) {
                  System.out.println("⚠️ Please enter a valid number!");
                  var1.next();
               } else {
                  int var12 = var1.nextInt();
                  ++var10;
                  if (var12 == var9) {
                     System.out.println("✅ Correct! You guessed the number in " + var10 + " attempts.");
                     var6 += var5 - var10 + 1;
                     var11 = true;
                     break;
                  }

                  if (var12 < var9) {
                     System.out.println("⬆️ Too low! Try again.");
                  } else {
                     System.out.println("⬇️ Too high! Try again.");
                  }
               }
            }

            if (!var11) {
               System.out.println("❌ You've run out of attempts! The number was " + var9 + ".");
            }

            System.out.println("\ud83c\udfc6 Your current score: " + var6);
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String var13 = var1.next().trim().toLowerCase();
            if (!var13.equals("yes") && !var13.equals("y")) {
               var8 = false;
            } else {
               ++var7;
            }
         }

         System.out.println("\n\ud83c\udfc1 Game Over!");
         System.out.println("Final Score: " + var6);
         System.out.println("Thanks for playing!");
         var1.close();
         return;
      }
   }
}
