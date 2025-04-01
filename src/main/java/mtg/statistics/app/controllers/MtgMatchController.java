package mtg.statistics.app.controllers;

import mtg.statistics.app.models.MtgMatch;
import mtg.statistics.app.service.MtgMatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mtg")
public class MtgMatchController {

    private final MtgMatchService matchService;

    public MtgMatchController(MtgMatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/hello")
    public String helloThere() {
        return "Hello there buddy";
    }

    @GetMapping("/match")
    public List<MtgMatch> getAllMatches() {
        return null;
    }

    @PostMapping("/match")
    public MtgMatch saveMatch(@RequestBody MtgMatch match) {
        return matchService.saveMatch(match);
    }
}
