package mtg.statistics.app.models;

import java.time.LocalDate;
import java.util.List;

public class MtgDay {
    LocalDate dateOfMeetup;
    List<MtgMatch> mtgMatches;

    public MtgDay() {
        this.dateOfMeetup = LocalDate.now();
    }

    public MtgDay(LocalDate dateOfMeetup) {
        this.dateOfMeetup = dateOfMeetup;
    }

    public void addMatch(MtgMatch match) {
        mtgMatches.add(match);
    }
}
