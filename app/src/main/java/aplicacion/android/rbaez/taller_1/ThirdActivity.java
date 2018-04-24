package aplicacion.android.rbaez.taller_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        texto = (TextView) findViewById(R.id.textView3);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String saludo2 = bundle.getString("saludo2");
            Toast.makeText( ThirdActivity.this,saludo2,Toast.LENGTH_LONG).show();
            texto.setText(saludo2);
        }else{
            Toast.makeText( ThirdActivity.this,"esta vacio",Toast.LENGTH_LONG).show();
        }
    }
}
