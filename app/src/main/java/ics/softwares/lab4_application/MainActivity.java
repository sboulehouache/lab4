package ics.softwares.lab4_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button bChangeLayout;   // déclaration
    EditText name; // déclaration   "name est une reférence vers un objet de type EditText"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        name=new EditText(this);  // création "création d'un objet de type EditText"


        name.setText(""); // utilisation

        //null pointer


        bChangeLayout=(Button)findViewById(R.id.buttonChangeLayout); // récupération de la référence du button définie dans le layout "activity_main

        bChangeLayout.setOnClickListener(new View.OnClickListener() {   // c'est un utilisation
            @Override
            public void onClick(View v) {
                MainActivity.this.setContentView(R.layout.activity_main_second_layout);
            }
        });
    }
}













