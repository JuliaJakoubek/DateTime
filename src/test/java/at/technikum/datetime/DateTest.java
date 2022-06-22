package at.technikum.datetime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateTest {
    @BeforeEach
    LocalDate date = LocalDate.now();

    @Test
    public void testYear(){
        int result = date.getYear();
        assertTrue(result < 2023);
    }

}
