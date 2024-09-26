public class FullTime extends Teacher {
    int anualSalary;
    String unit;

   

    public FullTime(){
        super();
        int anualSalary = 0;
        String unit  = "";
    }

    public FullTime(int anualSalary, String unit){
        this.anualSalary = anualSalary;
        this.unit = unit;

    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



}
