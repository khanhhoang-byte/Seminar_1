package com.example.myapplication;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button button; //Инициализируем переменную для хранения обхекта кнопки
    EditText editText; //Инициализируем переменную для хранения обхекта текстового поля

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName); //Присваеваем текстовому полю объект, полученный с Activity

        button = findViewById(R.id.button); //Присваеваем кнопке объект, полученный с Activity
        button.setOnClickListener(
                new View.OnClickListener() { //Здесь добавляется обработчик нажатия на кнопку
                    @Override
                    public void onClick(View v) {
                        Toast makeText = Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_SHORT);
                        makeText.show(); //Выводим сообщение пользователю, содержащее текст из текстового поля
                    }
                }
        );
    }


}
