package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Profile {

    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name) {
        this.name = name;
    }

    public Profile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        if (dateOfBirth == null)
                return -1;
        int age = LocalDate.now().getYear() - dateOfBirth.getYear();
        if (LocalDate.now().getDayOfYear() <  dateOfBirth.getDayOfYear()){
            age--;
        }
        return age;
    }

    public boolean allowedToWatch(Content content){
        if (content.getMaturityRating().getMinimum_age() > getAge())
            return false;
        else
            return true;
    }
}
