package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(0),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(18);

    private int minimum_age;

    Rating(int minimum_age){
        this.minimum_age = minimum_age;
    }

    public int getMinimum_age() {
        return minimum_age;
    }
}
