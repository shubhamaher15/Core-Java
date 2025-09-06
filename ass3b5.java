import game.Indoor;
import game.Outdoor;
class Main{
    public static void main(String[] args) {
     
        Indoor indoorGame = new Indoor();
        Outdoor outdoorGame = new Outdoor();

        System.out.println("Using Default Constructors:");
        indoorGame.display();
        outdoorGame.display();

     
        String[] indoorPlayers = {"Shubham", "Om", "Aditi"};
        String[] outdoorPlayers = {"Ravi", "ram", "Sahil"};

        Indoor customIndoor = new Indoor("Chess", indoorPlayers);
        Outdoor customOutdoor = new Outdoor("Football", outdoorPlayers);

        System.out.println("\nUsing Parameterized Constructors:");
        customIndoor.display();
        customOutdoor.display();
    }
}
