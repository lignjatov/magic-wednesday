package mtg.statistics.app.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@SuppressWarnings("unused")
@Getter @Setter
@AllArgsConstructor
public class Player {
    @JsonProperty("playerName")
    private String playerName;

    @JsonProperty("commander")
    private String commander;

    @JsonProperty("deckPlayed")
    private String deckPlayed;

    @JsonProperty("healthTotal")
    private int healthTotal;

    @JsonProperty("comment")
    private String comment;

}
