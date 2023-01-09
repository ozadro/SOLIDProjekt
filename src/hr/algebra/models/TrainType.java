package hr.algebra.models;

public enum TrainType {
    SMALL("Small"),
    LARGE("Large");

    private final String size;

    TrainType(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
