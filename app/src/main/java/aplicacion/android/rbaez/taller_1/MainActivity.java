package aplicacion.android.rbaez.taller_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private View btn,txv,txp,swc,chb;
    private final String SALUDO = "Hola a todos desde otro activity";
    private final String SALUDO2 = "Este es otro activity";
    private final String SALUDO3 = "Este también es otro activity";
    private final String SALUDO4 = "Así es, este es otro activity";
    private final String SALUDO5 = "Adivinaste nuevamente este es otro activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, SecondActivity.class);
                intent.putExtra( "saludo", SALUDO);
                startActivity(intent);
            }
        });

        txv = (TextView) findViewById(R.id.textView);
        txv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ThirdActivity.class);
                intent.putExtra( "saludo2", SALUDO2);
                startActivity(intent);
            }
        });

        txp = (EditText) findViewById(R.id.editText2);
        txp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, FourthActivity.class);
                intent.putExtra( "saludo3", SALUDO3);
                startActivity(intent);
            }
        });

        swc = (Switch) findViewById(R.id.switch2);
        swc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, FifthActivity.class);
                intent.putExtra( "saludo4", SALUDO4);
                startActivity(intent);
            }
        });

        chb = (CheckBox) findViewById(R.id.checkBox2);
        chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, SixthActivity.class);
                intent.putExtra( "saludo5", SALUDO5);
                startActivity(intent);
            }
        });
    }


}
