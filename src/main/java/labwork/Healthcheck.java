package labwork;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class Healthcheck {

    @GetMapping("/healthcheck")
    public ResponseEntity<Map<String, Object>> healthcheck() {
        Map<String, Object> checkAnswer = new HashMap<>();

        ZoneId kyivTime = ZoneId.of("Europe/Kiev");
        ZonedDateTime now = ZonedDateTime.now(kyivTime);

        String formatDate = now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        checkAnswer.put("Status", "Service is working fine.");
        checkAnswer.put("Data", formatDate);

        return ResponseEntity.ok(checkAnswer);
    }
}
