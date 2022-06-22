package at.technikum.datetime;
import at.technikum.datetime.DateTime;
import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class DateTimeController {
    LocalDate date = LocalDate.now();

    @GetMapping("/api/date")
    public LocalDate date(){
        return date;
    }
}
