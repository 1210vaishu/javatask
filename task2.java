import javax.swing.*;
public class task2 {
     public static void main(String[] args) {
        int compNumber = (int)
                (Math.random()*100+1);
        int userAns = 0;
        int count = 1;
        while (userAns != compNumber) {
            String response =
                    JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "NumberGuessingGame", 3);
            userAns =
                    Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAns, compNumber, count));
            count++;
        }

        }
        public static String determineGuess(int userAns, int compNumber, int count){
        if (userAns <=0 || userAns>100){
            return"Your guess is Incorrect";
        }
        else if (userAns == compNumber) {
            return"Correct!\nTotal Guesses:"+count;
        }
        else if (userAns > compNumber) {
            return"Your guess is much high, try again.\nTry Number:"+count;
        }
        else {
            return"Your guess is invalid\nTry Number:"+count;
        }
        }
}

