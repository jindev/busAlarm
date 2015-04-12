package com.jindev.busalarm;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      EditText busNum = (EditText) findViewById(R.id.edit_busNum);
      Button busNumCheckBtn = (Button) findViewById(R.id.btn_busNumCheck);
      final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


      View.OnClickListener listener = new View.OnClickListener(){

        @Override
        public void onClick(View v){
          Toast.makeText(getApplicationContext(),"안녕",Toast.LENGTH_SHORT).show();
          vibrator.vibrate(3000);

        }


      };

      busNumCheckBtn.setOnClickListener(listener);





    }



}
