package nhitruong.com.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtA, mEdtB;
    private TextView mTvResult;
    private Button mBtntong2so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtA = (EditText) findViewById(R.id.edt_a);
        mEdtB = (EditText) findViewById(R.id.edt_b);
        mTvResult = (TextView) findViewById(R.id.tv_result);
        mBtntong2so = (Button) findViewById(R.id.btn_tong2so);
        mBtntong2so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                int a = Integer.parseInt(mEdtA.getText().toString());
                int b = Integer.parseInt(mEdtB.getText().toString());
                mTvResult.setText((a+b)+"");
            }
        });
    }
}
