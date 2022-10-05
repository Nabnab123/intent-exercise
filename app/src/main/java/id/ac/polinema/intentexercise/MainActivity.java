package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	private Button btn_regist;
;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_regist = findViewById(R.id.btn_register);

		btn_regist.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent pindah = new Intent(MainActivity.this,RegisterActivity.class);
				startActivity(pindah);
			}
		});
	}
}
