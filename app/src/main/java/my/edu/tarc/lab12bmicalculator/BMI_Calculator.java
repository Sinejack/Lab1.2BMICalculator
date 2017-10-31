package my.edu.tarc.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class BMI_Calculator extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);

        editTextWeight=(EditText)findViewById(R.id.editTextWeight);
        editTextHeight=(EditText)findViewById(R.id.editTextHeight);

        imageViewResult=(ImageView)findViewById(R.id.imageViewResult);
        textViewResult=(TextView)findViewById(R.id.textViewBMI);
    }

    public void calculateBMI(View view)
    {
        double weight, height, bmi;
        weight=Double.parseDouble(editTextWeight.getText().toString()) ;
        height=Double.parseDouble(editTextHeight.getText().toString());

        bmi=weight/(height*height);

        if(bmi<=18.5)
        {
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("You are underweight.");
        }
        else if(bmi>18.5&&bmi<21)
        {
            imageViewResult.setImageResource((R.drawable.normal));
            textViewResult.setText("You are normal.");
        }
        else if(bmi>=21)
        {
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("You are overweight.");
        }

    }
    public void reset(View view)
    {
        editTextHeight.setText("");
        editTextWeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        textViewResult.setText("");
    }
}
