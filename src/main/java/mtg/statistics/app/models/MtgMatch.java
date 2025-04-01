package mtg.statistics.app.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

//Replace with Lombok
//No serializer found for class exception got when using Lombok
public class MtgMatch {
    private Player winner;
    private List<Player> participants;
    private LocalDate dateOfMatch;

    public MtgMatch(List<Player> participants, Player winner, LocalDate dateOfMatch) {
        this.winner = winner;
        this.dateOfMatch = dateOfMatch;
        this.participants = participants;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Player> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Player> participants) {
        this.participants = participants;
    }

    public LocalDate getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(LocalDate dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }
}
