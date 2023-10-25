package cl.ipvg.turistmap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public ImageButton cdBoton, ccBoton, vgBoton, estBoton;

    Intent intentMap;
    Ubicaciones lat, lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat = new Ubicaciones();
        lon = new Ubicaciones();

        intentMap = new Intent(this,MapsActivity.class);
        cdBoton = (ImageButton) findViewById(R.id.imageButton2);
        ccBoton = (ImageButton) findViewById(R.id.imageButton);
        vgBoton = (ImageButton) findViewById(R.id.imageButton4);
        estBoton = (ImageButton) findViewById(R.id.imageButton3);


        cdBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentMap);
            }


        });

        ccBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentMap);
            }
        });

        vgBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentMap);
            }
        });

        estBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentMap);
            }
        });


    }
}