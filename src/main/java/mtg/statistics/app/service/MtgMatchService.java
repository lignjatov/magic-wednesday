package mtg.statistics.app.service;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mtg.statistics.app.config.MatchSettings;
import mtg.statistics.app.models.MtgMatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MtgMatchService {

    @Autowired
    private MatchSettings matchSavingSettings;

    @Value("${defaultMatchPrefix}")
    private String defaultMatchName;

    @Value("${saveDataDirectory}")
    private String saveDataLocation;

    private final ObjectMapper jacksonObjectMapper = new ObjectMapper();
    Logger logging = LoggerFactory.getLogger(MtgMatchService.class);

    public List<MtgMatch> loadMatches() {
        return null;
    }

    public MtgMatch saveMatch(MtgMatch match) {
        logging.info(matchSavingSettings.getSaveDataDirectory());
        try
        {
            File saveFile = new File(matchSavingSettings.getSaveDataDirectory() + ".json");
            jacksonObjectMapper.writeValue(saveFile, match);
            logging.info("Successfully saved file at location: {}", saveFile.getAbsolutePath());
        } catch (StreamWriteException e) {
            logging.error("Issue with Stream writer!");
        } catch (IOException e) {
            logging.error(e.getMessage());
        }
        return match;
    }
}
