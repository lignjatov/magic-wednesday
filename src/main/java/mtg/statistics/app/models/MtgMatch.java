package mtg.statistics.app.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("unused")
@Getter @Setter
@AllArgsConstructor
public class MtgMatch {
    @JsonProperty("winner")
    private Player winner;

    @JsonProperty("participants")
    private List<Player> participants;

    @JsonProperty("dateOfMatch")
    private LocalDate dateOfMatch;
}
