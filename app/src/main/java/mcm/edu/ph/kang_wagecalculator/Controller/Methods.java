package mcm.edu.ph.kang_wagecalculator.Controller;


public class Methods {

    public double solveRegular(String employeeType, double hours){
        double regular;
        if (employeeType.equals("Regular")){
            regular = hours * 100;
        } else if (employeeType.equals("Probationary")){
            regular = hours * 90;
        } else {
            regular = hours * 75;
        }
        return regular;
    }

    public double solveTW(Double regular){

        return regular + 0;

    }

}

