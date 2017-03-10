package mx.edu.cetis108.cetis1083av_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2;
    TextView tvResultado;
    Integer resultado, aux1, aux2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        tvResultado = (TextView) findViewById(R.id.textView2);
        btn.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {

         aux1 = Integer.valueOf(et1.getText().toString());
         aux2 = Integer.valueOf(et2.getText().toString());
        if (aux1 > aux2) {
            resultado = aux1 - aux2;
            tvResultado.setText(resultado.toString());
        } else if(aux1 < aux2) {
            resultado = aux1 + aux2;
            tvResultado.setText(resultado.toString());
        }
    }
}



