package mtg.statistics.app.models;
import java.util.List;

public class MtgMatch {
    /*
     Considering using a HashMap like <String, Player>
     It would make accessing each players stats a lot easier
     since access would be done via key instead of going through each
     person and checking their name. However, having the name both as
     a key and as an attribute is another potential solution if a bit
     redundant
    */
    List<Player> players;
    String winner;
}
