package aplicacion.android.rbaez.taller_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        texto = (TextView) findViewById(R.id.textView5);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String saludo4 = bundle.getString("saludo4");
            Toast.makeText( FifthActivity.this,saludo4,Toast.LENGTH_LONG).show();
            texto.setText(saludo4);
        }else{
            Toast.makeText( FifthActivity.this,"esta vacio",Toast.LENGTH_LONG).show();
        }
    }
}

