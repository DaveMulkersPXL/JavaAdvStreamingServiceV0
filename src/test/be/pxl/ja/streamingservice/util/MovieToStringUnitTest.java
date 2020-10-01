package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieToStringUnitTest {

    @Test
    public void stringWithDate () {
// ARRANGE
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);
        // ACT
        movie.setReleaseDate(LocalDate.of(1997,1,1));
// ASSERT
        assertEquals ("Titanic(1997))", movie.toString());
    }

    @Test
    public void stringNoDate () {
// ARRANGE
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);
        // ACT
// ASSERT
        assertEquals ("Titanic", movie.toString());
    }
}
