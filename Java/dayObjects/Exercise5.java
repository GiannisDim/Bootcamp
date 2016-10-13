import java.util.Scanner;
public class Exercise5{

  public static void main(String args[]){
    String[][] tictac = new String[3][3];
    for(int i =0; i<3;i++){
      for(int j=0;j<3;j++){
        tictac[i][j] = " ";
      }
    }
    int result = 1;
    int moves = 0;
    drawFunction(tictac);
    do{
        int pl = 0 ;
        int player1 = 0;
        int player2 = 0;

        while(player1 == 0){
          int x = message("player1", 'x');
          int y = message("player1", 'y');
          if(tictac[x][y] != "X" && tictac[x][y] != "O"){
            tictac[x][y] = "X";
            moves = moves + 1;
            player1 = 1;
          }else{
            System.out.println("This spot is already used!");
          }
        }
        drawFunction(tictac);
        pl = check(tictac);
        if(pl == 1){
          System.out.println("Gongrats player1 is the winner !!");
          break;
        }
        if(moves == 9){
          System.out.println("It's a draw !");
          break;
        }

        while(player2 == 0){
          int x = message("player2",'x');
          int y = message("player1", 'y');
          if(tictac[x][y] != "X" && tictac[x][y] != "O"){
            tictac[x][y] = "O";
            moves = moves + 1;
            player2 = 1;
          }else{
            System.out.println("This spot is already used!");
          }
        }
        drawFunction(tictac);
        pl = check(tictac);
        if(pl == 2){
          System.out.println("Gongrats player2 is the winner !!");
          break;
        }
        if(moves == 9){
          System.out.println("It's a draw !");
          break;
        }

      }while(result == 1);

  }

  public static void drawFunction(String[][] a){
      for(int i=0; i<3; i++){
        System.out.print('|');
        for(int j=0; j<3; j++){
          System.out.print(a[i][j]+'|');
        }
        System.out.println();
      }
  }


  public static int check(String[][] table){
    int sum1 = 0;
    int sum2 = 0;
    int m = 0;
        //checking rows
          for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(table[i][j] == "X"){
                  sum1 = sum1 + 1;
                }else if(table[i][j] == "O"){
                  sum2 = sum2 + 1;
                }
            }
            m = checkSum(sum1,sum2);
            if(m == 0){
              sum1 = 0;
              sum2 = 0;
            }else{
              return m;
            }
          }


            //checking columns
            for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                  if(table[j][i] == "X"){
                    sum1 = sum1 + 1;
                  }else if(table[j][i] == "O"){
                    sum2 = sum2 + 1;
                  }
              }
              m = checkSum(sum1,sum2);
              if(m == 0){
                sum1 = 0;
                sum2 = 0;
              }else{
                return m;
              }
            }



              // checking diagonals
              for(int i=0; i<3; i++){
                if(table[i][i] == "X"){
                  sum1 = sum1 + 1;
                }else if(table[i][i] == "O"){
                  sum2 = sum2 + 1;
                }
              }

              m = checkSum(sum1,sum2);
              if(m == 0){
                sum1 = 0;
                sum2 = 0;
              }else{
                return m;
              }



              for(int i=0; i<3; i++){
                if(table[i][2-i] == "X"){
                  sum1 = sum1 + 1;
                }else if(table[i][2-i] == "O"){
                  sum2 = sum2 + 1;
                }
              }

              m = checkSum(sum1,sum2);
              if(m == 0){
                sum1 = 0;
                sum2 = 0;
              }else{
                return m;
              }

            return m;
  }

  public static int checkSum(int a, int b){
    int p = 0;
    if(a == 3){
      p = 1 ;
    }else if(b == 3){
      p = 2 ;
    }else{
      p = 0;
    }
    return p;
  }


  public static int message(String player, char c){
      int x = 0;
      do{
        System.out.print(player+" give a value for "+c+": ");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        x = a;
        if(x<0 || x>2){
          System.out.println("Wrong value!");
        }
      }while(x<0 || x>2);

      return  x ;
  }

}
