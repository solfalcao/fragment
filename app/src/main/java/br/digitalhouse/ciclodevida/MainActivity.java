package br.digitalhouse.ciclodevida;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragments(new AulaFragment());
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragments(new FragmentSegundo());
            }
        });

    }


    private void replaceFragments(Fragment fragment) {
        //Declarar o gerenciador
        FragmentManager manager = getSupportFragmentManager();

        //Declarar o transaction
        FragmentTransaction transaction = manager.beginTransaction();

        //Replace declarado onde eu vou recarregar o meu fragmento
        transaction.replace(R.id.container, fragment);

        //Finalizar a ação
        transaction.commit();

        //getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit ();
    }
}
