package io.github.rainsunny.network.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @author wangjie
 *         4/28/17
 */
@RestController
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @GetMapping("/hello")
    public String hello() {
        return "Hello, it works!";
    }

    @PostMapping(path = "/fraud/network_score", produces = MediaType.APPLICATION_JSON_VALUE)
    public ScoreResponse score(@RequestBody ScoreRequest sq) {

        logger.debug("Received: " + sq);

        ScoreResponse sp = new ScoreResponse();
        int n = new Random().nextInt();
        if (n % 2 == 0) {
            sp.setError_code(0);
            sp.setNetwork_score(0.33);
        } else {
            sp.setError_code(1);
            sp.setError_msg("Illegal arguments");
        }

        return sp;
    }
}
