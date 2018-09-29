package jayson.lee.com.lifecycle;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF", "onCreate has executed...");

    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITF", "onStart has executed...");
    }

    protected void onResume(){
        super.onResume();
        Log.d("4ITF", "onResume has executed...");
    }

    protected void onPause(){
        super.onPause();
        Log.d("4ITF", "Tumakbo nga si onPause");
    }

    protected void onStop(){
        super.onStop();
        Log.d("4ITF", "onStop has executed...");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("4ITF", "onRestart is again executed");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITF", "onDestroy has destroyed the app");
    }

    public void displayToast(View view){
        Toast.makeText(this, "Button is clicked", Toast.LENGTH_LONG).show();
    }

    public void displaySnack(View view){
        Snackbar.make(view, "Snackbar is displayed", Snackbar.LENGTH_LONG).show();
    }

//    public void display2(View view){
//        Intent i = new Intent(this, SecondActivity.class);
//        startActivity(i);
//    }

//    public void process(View view){
//        Intent i = null, chooser = null;
//        if(view.getId() == R.id.btnMap){
//            i = new Intent();
//        }
//    }
}
