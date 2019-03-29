package com.feranstirman.evaluacion1_pdm_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int i1,i2,i3,i4,i5,i6,i7,i8,i9, tot = 0;
    public String us, co;
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9;
    EditText usuario, correo;
    Button btn;
    public String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.ll_l1);
        l2 = findViewById(R.id.ll_l2);
        l3 = findViewById(R.id.ll_l3);
        l4 = findViewById(R.id.ll_l4);
        l5 = findViewById(R.id.ll_l5);
        l6 = findViewById(R.id.ll_l6);
        l7 = findViewById(R.id.ll_l7);
        l8 = findViewById(R.id.ll_l8);
        l9 = findViewById(R.id.ll_l9);

        p1 = findViewById(R.id.t1);
        p2 = findViewById(R.id.t2);
        p3 = findViewById(R.id.t3);
        p4 = findViewById(R.id.t4);
        p5 = findViewById(R.id.t5);
        p6 = findViewById(R.id.t6);
        p7 = findViewById(R.id.t7);
        p8 = findViewById(R.id.t8);
        p9 = findViewById(R.id.t9);

        usuario = findViewById(R.id.usuario);
        correo = findViewById(R.id.correo);
        btn = findViewById(R.id.btn);


        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        l5.setOnClickListener(this);
        l6.setOnClickListener(this);
        l7.setOnClickListener(this);
        l8.setOnClickListener(this);
        l9.setOnClickListener(this);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int vid = v.getId();
        switch (vid){
            case R.id.ll_l1:
                i1++;
                p1.setText(Integer.toString(i1));
                break;
            case R.id.ll_l2:
                i2++;
                p2.setText(Integer.toString(i2));
                break;
            case R.id.ll_l3:
                i3++;
                p3.setText(Integer.toString(i3));
                break;
            case R.id.ll_l4:
                i4++;
                p4.setText(Integer.toString(i4));
                break;
            case R.id.ll_l5:
                i5++;
                p5.setText(Integer.toString(i5));
                break;
            case R.id.ll_l6:
                i6++;
                p6.setText(Integer.toString(i6));
                break;
            case R.id.ll_l7:
                i7++;
                p7.setText(Integer.toString(i7));
                break;
            case R.id.ll_l8:
                i8++;
                p8.setText(Integer.toString(i8));
                break;
            case R.id.ll_l9:
                i9++;
                p9.setText(Integer.toString(i9));
                break;
            case R.id.btn:
                tot = i1+i2+i3+i4+i5+i6+i7+i8+i9;
                total = Integer.toString(tot);
                Intent intent = new Intent(this, NewActivity.class);
                intent.setType("text/plain");
                String[] lista = {p1.getText().toString(), p2.getText().toString(), p3.getText().toString(), p4.getText().toString(), p5.getText().toString(),
                        p6.getText().toString(), p7.getText().toString(), p8.getText().toString(), p9.getText().toString(), usuario.getText().toString(),
                        correo.getText().toString(), total};
                intent.putExtra(Intent.EXTRA_TEXT, lista);
                startActivity(intent);

        }
    }
}
