package darkdesigner.electronicdashboard;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        ImageButton boton1 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "resistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Intent intencion = new Intent(getApplicationContext(), Menu.class);
                startActivity(intencion);
            }
        }));
        ImageButton boton2 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();

                Intent intencion = new Intent(getApplicationContext(), Menu.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton3 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton4 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton5 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton6 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton7 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton8 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton9 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton10 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton11 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

        ImageButton boton12 = (ImageButton)findViewById(R.id.image);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Principal.this, "esistencia", Toast.LENGTH_SHORT);
                notificacion.show();
            }
        }));

    }

    @Override
    public void onClick(View v) {



    }
}
