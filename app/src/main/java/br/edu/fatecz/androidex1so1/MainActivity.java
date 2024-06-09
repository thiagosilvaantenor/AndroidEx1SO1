package br.edu.fatecz.androidex1so1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.edu.fatecz.androidex1so1.controller.EquacaoSegundoGrauController;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etA = findViewById(R.id.etA);
        etA.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        EditText etB = findViewById(R.id.etB);
        etB.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        EditText etC = findViewById(R.id.etC);
        etC.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView tvDelta = findViewById(R.id.tvDelta);
        tvDelta.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView tvR1 = findViewById(R.id.tvR1);
        tvR1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView tvR2 = findViewById(R.id.tvR2);
        tvR2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Button btnResult = findViewById(R.id.btnResult);

        EquacaoSegundoGrauController equacaoCtr =
                new EquacaoSegundoGrauController(etA, etB, etC, tvDelta, tvR1, tvR2, btnResult);


    }
    
}