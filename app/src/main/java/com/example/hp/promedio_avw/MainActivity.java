package com.example.hp.promedio_avw;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText m_mate;
    private EditText m_fis;
    private EditText m_progra;
    private TextView m_promedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_mate =(EditText)findViewById(R.id.mate); // encuentra la vista por su id, convierte par
        m_fis =(EditText)findViewById(R.id.fisica); // R. Encuentra y se comunica con  parte grafica a parte logica
        m_progra = (EditText)findViewById(R.id.programacion);
        m_promedio = (TextView)findViewById(R.id.promedio);
    }

    //Este metodo realiza el promedio
    public void Promedio(View view1){
        String v1= m_mate.getText().toString();
        String v2= m_fis.getText().toString();
        String v3= m_progra.getText().toString();

        //convirtiendo string to int

        int mate = Integer.parseInt((v1));
        int fisica = Integer.parseInt((v2));
        int programacion = Integer.parseInt((v3));



        double promedio= (mate+fisica+programacion)/3;
        String aprobado;
        //if con else if y cláusula final else

        if (promedio >= 10.0 && promedio >=0.0) {

            aprobado="Usted ha APROBADO este ciclo, FELICITACIONES :) !!!!!";

        }

        else if (promedio <= 10.0 && promedio >=0.0) {

            aprobado="Usted ha DESAPROBADO este ciclo, ES UN BURRO :( "; }

        else {

            aprobado="Los valores no son válidos, ingrese una nota del 0 al 20";

        }

        String promedio_T= String.valueOf(promedio);
        m_promedio.setText("Tu promedio es = "+promedio_T+" \n"+aprobado);

    }
}
