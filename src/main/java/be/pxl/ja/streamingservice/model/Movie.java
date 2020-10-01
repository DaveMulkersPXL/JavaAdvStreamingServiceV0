package be.pxl.ja.streamingservice.model;
import java.time.LocalDate;
public class Movie extends Content implements Playable{

    public static final int LONG_PLAYING_TIME = 145;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating){
        super (title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0)
            duration = -duration;
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime () {
        return duration > LONG_PLAYING_TIME;
    }

   public String getPlayingTime () {
// TODO: implement this method correctly
        if (duration == 0 )
            return "?";
        else if (duration < 60)
            return duration + " min";
        else if (duration % 60 == 0)
            return (duration / 60) + " h";
        else
            return (duration / 60) + " u " + (duration % 60) + " min";
    }


    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder(super.toString ())
                ;
        if (releaseDate != null) {
            builder.append(" (").append(releaseDate.getYear ()).
                    append(")");
            }
        return builder.toString ();
        }

}
