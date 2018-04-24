package aplicacion.android.rbaez.taller_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        texto = (TextView) findViewById(R.id.textView4);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String saludo3 = bundle.getString("saludo3");
            Toast.makeText( FourthActivity.this,saludo3,Toast.LENGTH_LONG).show();
            texto.setText(saludo3);
        }else{
            Toast.makeText( FourthActivity.this,"esta vacio",Toast.LENGTH_LONG).show();
        }
    }
}

