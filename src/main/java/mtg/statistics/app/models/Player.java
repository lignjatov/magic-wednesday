package mtg.statistics.app.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Player {
    private String playerName;
    private String commander;
    private String deckPlayed;
    private int healthTotal;
    private String comment;
}
