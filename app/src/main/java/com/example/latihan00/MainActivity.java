package com.example.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Konten view dihubungkan dengan koding
        //Java kita
        setContentView(R.layout.activity_main);

        //Menghubungkan view dengan object Button
        //dalam source code kita
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btFourth = findViewById(R.id.btFourth);

        //Interface onClickListener merupakan interface yang ada di kelas view
        //hanya berisi satu method onClick(View view)

        //berikut kode memasang event listener onclick pada object Button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda telah menekan tombol Pertama", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda telah menekan tombol Kedua", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda telah menekan tombol Ketiga", Toast.LENGTH_SHORT).show();
            }
        });

        btFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda telah menenkan tombol Keempat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
