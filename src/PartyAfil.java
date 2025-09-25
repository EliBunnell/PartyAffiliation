import java.util.Scanner;

public class PartyAfil
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String party = "";

        System.out.print("chose your party affiliation (D, R, I): ");
        party = input.nextLine().toUpperCase(); //D I R or something else

        if(party.equals("R"))
            {
                System.out.println("You get a republican elephant");
            }
        else if(party.equals("D"))
        {
            System.out.println("You get a democratic donkey ");
        }
        else if(party.equals("I"))
        {
            System.out.println("You get an indpendent man");
        }
        else
        {
            System.out.println("I dont recognize your party: " + party);
        }


    }
}
