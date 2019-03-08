package darkdesigner.electronicdashboard;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener{

    ImageButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11,boton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        ImageButton boton1 = (ImageButton)findViewById(R.id.btnresistencia);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "resistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 1;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));
        ImageButton boton2 = (ImageButton)findViewById(R.id.btnleydekirch);
        boton2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "ley de kirchoff", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 2;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton3 = (ImageButton)findViewById(R.id.btnleyohm);
        boton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 3;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton4 = (ImageButton)findViewById(R.id.btnpotencia);
        boton4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 4;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton5 = (ImageButton)findViewById(R.id.btncapacitancia);
        boton5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 5;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton6 = (ImageButton)findViewById(R.id.btninductancia);
        boton6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 6;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton7 = (ImageButton)findViewById(R.id.btndiodo);
        boton7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 7;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton8 = (ImageButton)findViewById(R.id.btntransistor);
        boton8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 8;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton9 = (ImageButton)findViewById(R.id.btnamplificador);
        boton9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 9;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton10 = (ImageButton)findViewById(R.id.btnfiltros);
        boton10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 10;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton11 = (ImageButton)findViewById(R.id.btnsecuenciales);
        boton11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 11;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton12 = (ImageButton)findViewById(R.id.btncombinacionales);
        boton12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Menuactivity.opcion = 12;

                Intent intencion = new Intent(getApplicationContext(), Menuactivity.class);
                startActivity(intencion);
            }
        }));

    }


    @Override
    public void onClick(View v) {

    }
}
