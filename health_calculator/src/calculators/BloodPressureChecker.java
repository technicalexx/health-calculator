package calculators;

public class BloodPressureChecker {
    
    private int systolic;
    private int diastolic;

    public BloodPressureChecker(int systolic, int diastolic){
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        if (systolic > 0) {
            this.systolic = systolic;
        }
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        if (diastolic > 0) {
            this.diastolic = diastolic;
        }
    }

    public void checkPressure(int systolic, int diastolic) {
        if (systolic < 120 && diastolic < 80) {
            System.out.println("\nYour blood pressure is normal.");
        } else if (systolic <= 129 && diastolic < 80) {
            System.out.println("\nYour blood pressure is elevated.");
        } else if (systolic <= 139 || diastolic <= 89) {
            System.out.println("\nYou have a high blood pressure (HYPERTENSION, Stage 1).");
        } else if (systolic >= 140 || diastolic >= 90) {
            System.out.println("\nYou have a high blood pressure (HYPERTENSION, Stage 2).");
        } 

        if (systolic > 180 || diastolic > 120) {
            System.out.println("You're experiencing HYPERTENSIVE CRISIS. Consult your doctor immediately!!!");
        }
    }
}
