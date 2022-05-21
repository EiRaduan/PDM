package com.example.appativ01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_sortear;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sortear = findViewById(R.id.btn_sortear);
        tv_resultado = findViewById(R.id.tv_resultado);

        btn_sortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(10);

                //R$ 1.000 - R$ 2.000 - R$ 100.000
                //Carro 0km - Motocicleta - Casa
                //Viagem - Smartphone - Apartamento

                if(num == 1){
                    tv_resultado.setText("Seu prêmio é: R$ 1.000");
                } else if(num == 2){
                    tv_resultado.setText("Seu prêmio é: R$ 2.000");
                } else if(num == 3){
                    tv_resultado.setText("Seu prêmio é: R$ 100.000");
                } else if(num == 4){
                    tv_resultado.setText("Seu prêmio é: Carro 0km");
                } else if(num == 5){
                    tv_resultado.setText("Seu prêmio é: Motocicleta");
                } else if(num == 6){
                    tv_resultado.setText("Seu prêmio é: Casa");
                } else if(num == 7){
                    tv_resultado.setText("Seu prêmio é: Viagem");
                } else if(num == 8){
                    tv_resultado.setText("Seu prêmio é: Smartphone");
                } else if(num == 9){
                    tv_resultado.setText("Seu prêmio é: Apartamento");
                }


            }
        });
    }


}