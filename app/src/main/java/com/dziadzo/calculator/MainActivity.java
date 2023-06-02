package com.dziadzo.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	private TextView textviev;
	private EditText edittext1, edittext2;
	private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		
		textviev = findViewById(R.id.textviev);
		edittext1=findViewById(R.id.edittext1);
		edittext2=findViewById(R.id.edittext2);
		button=findViewById(R.id.button);
		
		button.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view) {
				float num1=Float.parseFloat(edittext1.getText().toString());
				float num2=Float.parseFloat(edittext2.getText().toString());
				float res=num1+num2;
				textviev.setText(String.valueOf(res));
			}
		});
    }
}