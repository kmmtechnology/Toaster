package com.demo.toaster;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.demo.uitil.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 30-Jan-16.
 */
public class ActivityStart extends Activity {


  /*  private Button button;
    private EditText editText;
    private TextView textView;textView */

    private List<Country> countries;

    private List<Country> getCountries() {
        List<Country> countries = new ArrayList<Country>();
        countries.add(new Country(R.drawable.andorra, "Andorra"));
        countries.add(new Country(R.drawable.albania, "Albania"));
        countries.add(new Country(R.drawable.algeria, "Algeria"));
        countries.add(new Country(R.drawable.andorra, "Andorra"));
        countries.add(new Country(R.drawable.angola, "Angola"));
        countries.add(new Country(R.drawable.anguilla, "Anguilla"));
        countries.add(new Country(R.drawable.antigua_and_barbuda, "Antigua_and_barbuda"));
        countries.add(new Country(R.drawable.argentina, "Argentina"));
        countries.add(new Country(R.drawable.armenia, "Armenia"));
        countries.add(new Country(R.drawable.aruba, "Aruba"));
        countries.add(new Country(R.drawable.australia, "Australia"));
        countries.add(new Country(R.drawable.austria, "Austria"));
        countries.add(new Country(R.drawable.azerbaijan, "Azerbaijan"));
        countries.add(new Country(R.drawable.bahamas, "Bahamas"));
        countries.add(new Country(R.drawable.bahrain, "Bahrain"));
        countries.add(new Country(R.drawable.bangladesh, "Bangladesh"));
        countries.add(new Country(R.drawable.barbados, "Barbados"));
        countries.add(new Country(R.drawable.belarus, "Belarus"));

        return countries;
    }

    private class CountryAdapter extends ArrayAdapter<Country> {

        private LayoutInflater layoutInflater;
        public CountryAdapter(Context context, int resource, List<Country> countries) {
            super(context, resource, countries);
            layoutInflater=LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return super.getView(position, convertView, parent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference);
        countries = getCountries();

        /*button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);


        final SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        String userName = preference.getString(getString(R.string.pref_user_name), "User name");
        textView.setText(userName);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameString = editText.getText().toString();
                SharedPreferences.Editor editor = preference.edit();
                editor.putString(getString(R.string.pref_user_name), userNameString);
                editor.commit();
                Toast.makeText(ActivityStart.this, userNameString, Toast.LENGTH_SHORT).show();

            }
        });*/



        /*button = (Button) findViewById(R.id.open_seasame);
        editText = (EditText) findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Log.i("info", "Activity Start activity has been started ...");
                    String name = editText.getText().toString();
                    Intent intent = new Intent(ActivityStart.this, WelcomeActivity.class);
                    intent.putExtra("user_name", name);
                    Log.i("info", "This activity willl start WelcomeActivity");
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(ActivityStart.this, e.getMessage(), Toast.LENGTH_LONG);
                }

            }
        });*/
    }

}
