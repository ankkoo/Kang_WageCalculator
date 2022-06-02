package mcm.edu.ph.kang_wagecalculator.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import mcm.edu.ph.kang_wagecalculator.Model.Variables;
import mcm.edu.ph.kang_wagecalculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalculate, btnProb, btnPT, btnReg;
    TextView employeeType;
    EditText editTextEN, editTextHR;
    Variables var = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        employeeType = findViewById(R.id.txtEmpType);

        btnCalculate = findViewById(R.id.btnCalculate);
        btnProb = findViewById(R.id.btnProb);
        btnPT = findViewById(R.id.btnPT);
        btnReg = findViewById(R.id.btnReg);


        editTextEN = findViewById(R.id.editTextEN);
        editTextHR = findViewById(R.id.editTextHR);

        btnProb.setOnClickListener(this);
        btnPT.setOnClickListener(this);
        btnReg.setOnClickListener(this);
        btnCalculate.setOnClickListener(this);

    }

    @Override

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnReg:
                var.setEmpType("Regular");
                employeeType.setText("Employee type: Regular");
                break;
            case R.id.btnProb:
                var.setEmpType("Probationary");
                employeeType.setText("Employee type: Probationary");
                break;
            case R.id.btnPT:
                var.setEmpType("Part time");
                employeeType.setText("Employee type: Part-time");
                break;
            case R.id.btnCalculate:
                if (var.getEmpType() == "") {
                    Toast.makeText(MainActivity.this, "Fill in the Blanks.", Toast.LENGTH_SHORT).show();
                } else {
                    var.setEmpName(String.valueOf(employeeType.getText()));
                    var.setEmpHours(Double.parseDouble(editTextHR.getText().toString()));


                    Intent i = new Intent(this, MainActivity2.class);
                    i.putExtra("keyType", var.getEmpType());
                    i.putExtra("keyName", var.getEmpName());
                    i.putExtra("keyHours", var.getEmpHours());
                    startActivity(i);

                    break;

                }

        }
    }
}