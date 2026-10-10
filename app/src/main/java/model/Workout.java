package model;

public class Workout {

    private int id;
    private String firebaseId;
    private String name;
    private int duration;
    private int calories;
    private String date;
    public Workout() {
    }
    public Workout(
            int id,
            String name,
            int duration,
            int calories,
            String date
    ) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.calories = calories;
        this.date = date;
    }
    public Workout(
            String firebaseId,
            String name,
            int duration,
            int calories,
            String date
    ) {
        this.firebaseId = firebaseId;
        this.name = name;
        this.duration = duration;
        this.calories = calories;
        this.date = date;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getFirebaseId() {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getWorkoutName() {
        return name;
    }

    public void setWorkoutName(String workoutName) {
        this.name = workoutName;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}