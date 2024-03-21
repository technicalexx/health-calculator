package calculators;

public class CaloriesCalculator {

    private int age;
    private double height;
    private double weight;
    private String gender;
    private String activityLevel;

    public CaloriesCalculator(){

    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getActivityLevel() {
        return activityLevel;
    }
    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }


    public double calculateCalories(String gender, double height, double weight, 
                                    int age, String activityLevel) {
        double bmr = 0;
        double activityMultiplier = 1;
        if (gender.equals("male")) {
            bmr = (12.7 * height) + (6.23 * weight) - (6.8 * age) + 66;
        }
        else if (gender.equals("female")) {
            bmr = (4.7 * height) + (4.35 * weight) - (4.7 * age) + 655;
        }
        switch (activityLevel) {
            case "none":
                activityMultiplier = 1.2;
                break;
            case "low":
                activityMultiplier = 1.375;
                break;
            case "moderate":
                activityMultiplier = 1.55;
                break;
            case "high":
                activityMultiplier = 1.725;
                break;
            case "extreme":
                activityMultiplier = 1.9;
        }
            return bmr * activityMultiplier;
    }
}
