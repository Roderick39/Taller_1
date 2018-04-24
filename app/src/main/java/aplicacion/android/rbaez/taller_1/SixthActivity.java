package aplicacion.android.rbaez.taller_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        texto = (TextView) findViewById(R.id.textView6);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String saludo5 = bundle.getString("saludo5");
            Toast.makeText( SixthActivity.this,saludo5,Toast.LENGTH_LONG).show();
            texto.setText(saludo5);
        }else{
            Toast.makeText( SixthActivity.this,"esta vacio",Toast.LENGTH_LONG).show();
        }
    }
}
