package com.feranstirman.evaluacion1_pdm_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView i1, i2, i3, i4, i5, i6, i7, i8, i9, usuario, correo, total;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        i1 = findViewById(R.id.s1);
        i2 = findViewById(R.id.s2);
        i3 = findViewById(R.id.s3);
        i4 = findViewById(R.id.s4);
        i5 = findViewById(R.id.s5);
        i6 = findViewById(R.id.s6);
        i7 = findViewById(R.id.s7);
        i8 = findViewById(R.id.s8);
        i9 = findViewById(R.id.s9);
        usuario = findViewById(R.id.usur);
        correo = findViewById(R.id.corr);
        total = findViewById(R.id.total);
        share = findViewById(R.id.btn2);

        Intent mIntent = getIntent();
        String[] text = mIntent.getStringArrayExtra(Intent.EXTRA_TEXT);
        if (mIntent != null) {
            i1.setText(text[0]);
            i2.setText(text[1]);
            i3.setText(text[2]);
            i4.setText(text[3]);
            i5.setText(text[4]);
            i6.setText(text[5]);
            i7.setText(text[6]);
            i8.setText(text[7]);
            i9.setText(text[8]);
            usuario.setText(text[9]);
            correo.setText(text[10]);
            total.setText(text[11]);
        }

        share.setOnClickListener(e -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, text[0] + text[1] + text[2] + text[3] + text[4] + text[5] + text[6]
                    + text[7] + text[8] + text[9] + text[10] + text[11]);
            startActivity(intent);
        });
    }
}