package demo.utt37.congcau.toantu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
EditText edtsoa;
EditText edtsob;
TextView txtkq;
Button btncong,btntru,btnnhan,btnchia;
    float result;
    OnClickListener myclick=new OnClickListener() {

        @Override

        public void onClick(View arg0) {

            switch(arg0.getId())

            {

                case R.id.btncong:

                    String sa=edtsoa.getText()+"";

                    String sb=edtsob.getText().toString();

                    float a=Integer.parseInt(sa);

                    float b=Integer.parseInt(sb);

                    txtkq.setText(a+" + "+b +" = "+(a+b));

                    break;

                case R.id.btntru:

                    sa = edtsoa.getText() + "";
                    sb = edtsob.getText().toString();
                    a = Integer.parseInt(sa);
                    b = Integer.parseInt(sb);
                    txtkq.setText(a+"-"+b+"="+(a-b));
                    break;

                case R.id.btnnhan:
                    sa = edtsoa.getText() + "";
                    sb = edtsob.getText().toString();
                    a = Integer.parseInt(sa);
                    b = Integer.parseInt(sb);
                    txtkq.setText(a+"*"+b+"="+(a*b));

                    break;

                case R.id.btnchia:
                    sa = edtsoa.getText() + "";
                    sb = edtsob.getText().toString();
                    a = Integer.parseInt(sa);
                    b = Integer.parseInt(sb);
                    if (b == 0)
                    {
                        Toast.makeText(MainActivity.this,"Lỗi không thể chia",Toast.LENGTH_SHORT);
                        txtkq.setText("Vô Nghiệm");
                    }
                    else {
                        //DecimalFormat df = new DecimalFormat("###.#######");

                        result = ((a) / (b));
                        txtkq.setText(a +"/"+ b +"= "+(String.format("%.1f",result)));

                    }


                    break;

            }

        }

    };

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btncong=(Button) findViewById(R.id.btncong);

        btntru=(Button) findViewById(R.id.btntru);

        btnnhan=(Button) findViewById(R.id.btnnhan);

        btnchia=(Button) findViewById(R.id.btnchia);

        edtsoa=(EditText) findViewById(R.id.edtsoa);

        edtsob=(EditText) findViewById(R.id.edtsob);

        txtkq=(TextView) findViewById(R.id.txtkq);

        btncong.setOnClickListener(myclick);

        btntru.setOnClickListener(myclick);

        btnnhan.setOnClickListener(myclick);

        btnchia.setOnClickListener(myclick);

    }

}
