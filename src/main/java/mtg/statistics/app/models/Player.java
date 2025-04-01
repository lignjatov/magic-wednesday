package mtg.statistics.app.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Replace with Lombok
//No serializer found for class exception got when using Lombok
public class Player {
    private String playerName;
    private String commander;
    private String deckPlayed;
    private int healthTotal;
    private String comment;

    public Player(String playerName, String commander, String deckPlayed, int healthTotal, String comment) {
        this.playerName = playerName;
        this.commander = commander;
        this.deckPlayed = deckPlayed;
        this.healthTotal = healthTotal;
        this.comment = comment;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public String getDeckPlayed() {
        return deckPlayed;
    }

    public void setDeckPlayed(String deckPlayed) {
        this.deckPlayed = deckPlayed;
    }

    public int getHealthTotal() {
        return healthTotal;
    }

    public void setHealthTotal(int healthTotal) {
        this.healthTotal = healthTotal;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
