package com.demo.toaster;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.uitil.Util;

/**
 * Created by DELL on 29-Jan-16.
 */
public class tree extends AppCompatActivity {

    private Button go, phonecall, sms, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        go = (Button) findViewById(R.id.web);
        phonecall = (Button) findViewById(R.id.phone);
        sms = (Button) findViewById(R.id.sms);
        email = (Button) findViewById(R.id.email);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailSend = new Intent(Intent.ACTION_SEND);
                emailSend.putExtra(Intent.EXTRA_EMAIL, new String[]{"tester@ghfdgj.com"});
                emailSend.putExtra(Intent.EXTRA_SUBJECT, "Test email");
                emailSend.putExtra(Intent.EXTRA_TEXT, "This is just test email. Please ignore");
                emailSend.setType("message/rfc822");
                if (Util.isIntentSpported(tree.this, emailSend)) {
                    startActivity(emailSend);
                } else {

                    Toast.makeText(tree.this, "No email client has been found no this device", Toast.LENGTH_LONG).show();
                }
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:+01815657868"));
                smsIntent.putExtra("sms_body", "Test sms has been sent to test number");
                startActivity(smsIntent);
            }

        });

        phonecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+01816534789")); //CALL phone permision does not work...explore
                startActivity(callIntent);
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse(getString(R.string.web_site)));
                startActivity(web);

            }
        });

    }


}
