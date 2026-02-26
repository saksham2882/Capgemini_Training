package Module_Exercise;

import java.util.ArrayList;

public class GameService {

    public static ArrayList<Game> games = new ArrayList<>();

    public GameService() {
        games.add(new Game("SnowBird", "Danny", 300));
        games.add(new Game("FreshFood", "Ram", 450));
        games.add(new Game("Batsman", "Kate", 400));
        games.add(new Game("Pokiman", "Steeve", 600));
        games.add(new Game("YammyTommy", "Narayan", 350));
    }

    public ArrayList<Game> viewAll(){
        return games;
    }

    public String authorSearch(String author){

        for(Game game : games){
            if(game.getAuthorName().equalsIgnoreCase(author.trim())){
                return game.getGameName();
            }
        }

        return "NOT FOUND";
    }
}
