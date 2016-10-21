import java.util.Scanner;
class Exercise3{

  public static void main(String args[]){
      System.out.print("Enter shift: ");
      Scanner reader = new Scanner(System.in);
      int s = reader.nextInt();

      System.out.print("Enter phrase: ");
      String phrase = reader.next();
      char[] letter = new char[phrase.length()];
      char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      int[] number = new int[phrase.length()];
      for(int i=0; i<phrase.length(); i++){
        letter[i] = phrase.charAt(i);
      }
      for(int i=0; i<phrase.length(); i++){
        for(int j=0; j<26; j++){
          if(letter[i] == alphabet[j]){
            if((j + s) < 26 ){
              letter[i] = alphabet[(j+s)];
              break;
            }else{
              letter[i] = alphabet[(j+s)-26];
              break;
            }
          }
        }
      }



      for(int i=0; i<phrase.length(); i++){
        System.out.print(letter[i]);
      }

  }
}
