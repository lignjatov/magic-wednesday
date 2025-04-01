package mtg.statistics.app.service;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mtg.statistics.app.models.MtgMatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MtgMatchService {
    private final String defaultMatchName = "mtg_match.json";
    private final ObjectMapper jacksonObjectMapper = new ObjectMapper();
    Logger logging = LoggerFactory.getLogger(MtgMatchService.class);

    public List<MtgMatch> loadMatches() {
        return null;
    }

    public MtgMatch saveMatch(MtgMatch match) {
        try
        {
            File saveFile = new File(defaultMatchName);
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
