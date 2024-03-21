package calculators;

public class BMICalculator {

    private double height;  // in inches
    private double weight;  // in pounds
    // private int age;
    // private char gender;

    
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
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


    public double calculateBMI(double height, double weight) {
        double bmi = (weight / Math.pow(height, 2)) * 703;
        return bmi;
    }
}
