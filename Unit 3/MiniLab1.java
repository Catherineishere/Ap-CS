import java.util.*;

public class MiniLab1 {


    public static void main (String[] args){
        ArrayList<String> favorites = new ArrayList<String>();
        Scanner inputReader = new Scanner (System.in);
        String userInput;
        for ( int index = 0; index< 6; index++)
        {
            System.out.println("What is you favorite colour _____");
            userInput = inputReader.nextLine();
            favorites.add(userInput);
        

            for ( int i = 0; i< favorites.size(); i++){
                System.out.println(favorites.get(i));
            }
        }


        
    }
    
}
