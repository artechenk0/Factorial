package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView result;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        result = findViewById(R.id.result);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().length() == 0)
                    Toast.makeText(MainActivity.this, "Некорректный ввод", Toast.LENGTH_SHORT).show();

                else if (Integer.parseInt(editText.getText().toString()) > 25 )
                    Toast.makeText(MainActivity.this, "Слишком большое число", Toast.LENGTH_SHORT).show();

                else
                    result.setText(factorial(Integer.parseInt(editText.getText().toString())));
            }
        });
    }

    private String factorial(int value){
        long result = 1;
        for (int i = 1; i <= value; i++)
            result *= i;
        return "Факториал " + value + " равен: " + result;
    }



}