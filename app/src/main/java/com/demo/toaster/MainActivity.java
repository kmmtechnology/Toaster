package com.demo.toaster;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  /*  @Override
    public void onClick(View view) {
        String data = editText.getText().toString();


        if ((data != null) && (data.length() == 0)) {
            data = "Please enter your name";
            Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, data, Toast.LENGTH_LONG).show();
        }
    }*/


    private EditText editText;
    private Button button;
    private static final int color_picker_dialog = 1;
    String colors[];

    private Button vibrate, rhtthm, stpvibrate;
    private Vibrator vibrator;


    @Override
    public void onClick(View view) {

       /* showDialogWindow();*/
      /*  Log.i("info", "color chooser button has been clicked");
        showDialog(color_picker_dialog);
         */
        switch (view.getId()) {

            case R.id.vibrate:
                vibrator.vibrate(1000);
                break;
            case R.id.rhythm:
                long pattern[] = {250, 500};
                vibrator.vibrate(pattern, 0);
                break;
            case R.id.stopvibrartion:
                vibrator.cancel();
                break;

        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        vibrator.cancel();
    }

    private void showDialogWindow() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.dialog_title));
        builder.setMessage(getString(R.string.dialog_message));
        builder.setPositiveButton(getString(R.string.positive_message), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String data = "You have decided to view cricket online";
                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton(getString(R.string.negative_message), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String data = "You have decided not to view cricket online";
                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
            }
        });
        builder.setCancelable(false);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }


    @Override
    protected Dialog onCreateDialog(int id) {

        Log.i("info", "onCreateDialog has been clicked");
        switch (id) {
            case color_picker_dialog:
                Log.i("info", new Integer(color_picker_dialog).toString());
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(R.string.choose_a_color);
                builder.setItems(colors, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, colors[which], Toast.LENGTH_LONG).show();

                    }

                });
                //
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


                break;
        }
        return super.onCreateDialog(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vibrate);
        // editText = (EditText) findViewById(R.id.editText);
        colors = getResources().getStringArray(R.array.colors);
        /*button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);*/

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        vibrate = (Button) findViewById(R.id.vibrate);
        rhtthm = (Button) findViewById(R.id.rhythm);
        stpvibrate = (Button) findViewById(R.id.stopvibrartion);

        vibrate.setOnClickListener(this);
        rhtthm.setOnClickListener(this);
        stpvibrate.setOnClickListener(this);
    }


}
