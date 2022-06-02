package mcm.edu.ph.kang_wagecalculator.Model;

public class Variables {

    private double hours, regWage;
    private String name,
            employeeType = "";

    public Variables() {}

        public double getEmpHours () {
            return hours;
        }
        public double getRW () {
            return regWage;
        }
        public String getEmpName () {
            return name;
        }
        public String getEmpType () {
            return employeeType;
        }


        public void setEmpHours ( double hours){
            this.hours = hours;
        }
        public void setRW ( double regWage){
            this.regWage = regWage;
        }
        public void setEmpName (String name){
            this.name = name;
        }
        public void setEmpType (String employeeType){
            this.employeeType = employeeType;
        }
}