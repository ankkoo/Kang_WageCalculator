package mcm.edu.ph.kang_wagecalculator.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import mcm.edu.ph.kang_wagecalculator.Controller.Methods;
import mcm.edu.ph.kang_wagecalculator.Model.Variables;
import mcm.edu.ph.kang_wagecalculator.R;


public class MainActivity2 extends AppCompatActivity{

    TextView txtName, txtType, txtHours, txtWage, txtTW;
    Variables var = new Variables();
    Methods function = new Methods();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main2);

        txtName = findViewById(R.id.txtEmpName);
        txtType = findViewById(R.id.txtEmpType);
        txtHours = findViewById(R.id.txtHR);
        txtWage = findViewById(R.id.txtTW);

        Intent i = getIntent();

        var.setEmpType(i.getStringExtra("keyType"));
        var.setEmpName(i.getStringExtra("keyName"));
        var.setEmpHours(i.getDoubleExtra("keyHours", var.getEmpHours()));


        double regularWage = function.solveRegular(var.getEmpType(), var.getRW());

        txtName.setText("Employee Name: "+var.getEmpName());
        txtType.setText("Employee Type: "+var.getEmpType());
        txtHours.setText("Hours Rendered: "+var.getEmpHours());
        txtWage.setText("Total Wage : "+regularWage);

    }


}
