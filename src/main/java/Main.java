import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int yturn = (int) (Math.random() * 2);

    int[] nacarr = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    boolean yturnb;
    System.out.println("NOUGHTS(ones) AND CROSSES(twos)!!!!\n\n");
    if (yturn == 0) {
      System.out.println("Player 1 starts");
      yturnb = true;
    }else{
      System.out.println("Player 2 starts");
      yturnb = false;
    }
    Scanner ginput = new Scanner(System.in);
    boolean gamefinished = false;
    while (gamefinished == false){
      System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);

      System.out.println("What is your move? (Answer 1-9");
      String inpts = ginput.nextLine();
      int inpti = Integer.parseInt(inpts);
      if (nacarr[inpti - 1] == 0){
          if (yturnb == true){
            nacarr[inpti - 1] = 1;
            yturnb = false;
          }else{
            nacarr[inpti - 1] = 2;
            yturnb = true;
          }
      }else{
          System.out.println("Oops, that's not valid! Try again.");
          continue;

      }
      //horizontal
      int[] win1 = {nacarr[0], nacarr[1], nacarr[2]};
      int[] win2 = {nacarr[3], nacarr[4], nacarr[5]};
      int[] win3 = {nacarr[6], nacarr[7], nacarr[8]};
      //vertical;
      int[] win4 = {nacarr[0], nacarr[3], nacarr[6]};
      int[] win5 = {nacarr[1], nacarr[4], nacarr[7]};
      int[] win6 = {nacarr[2], nacarr[5], nacarr[8]};
      //diagonal
      int[] win7 = {nacarr[0], nacarr[4], nacarr[8]};
      int[] win8 = {nacarr[2], nacarr[4], nacarr[6]};

      if (win1[0] == win1[1] && win1[1] == win1[2]){
          if (win1[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }else if (win2[0] == win2[1] && win2[1] == win2[2]){
          if (win2[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }else if (win3[0] == win3[1] && win3[1] == win3[2]){
          if (win3[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }else if (win4[0] == win4[1] && win4[1] == win4[2]){
          if (win4[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }
      //set2
      if (win5[0] == win5[1] && win5[1] == win5[2]){
          if (win5[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }else if (win6[0] == win6[1] && win6[1] == win6[2]){
          if (win6[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }else if (win7[0] == win7[1] && win7[1] == win7[2]){
          if (win7[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }else if (win8[0] == win8[1] && win8[1] == win8[2]){
          if (win8[0] == 0){
              continue;
          }else{
              System.out.println(nacarr[0] + "|" + nacarr[1] + "|" + nacarr[2] + "\n" + nacarr[3] + "|" + nacarr[4] + "|" + nacarr[5] + "\n" + nacarr[6] + "|" + nacarr[7] + "|" + nacarr[8]);
              System.out.println("YOU WIN1!");
              break;
          }
      }
    }
    ginput.close();

  }