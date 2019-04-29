package com.example.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        dialogBuilder.setTitle("Atenção!")
                .setMessage("Jéssica, está prestando atenção?")
                .setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = Toast.makeText(getApplicationContext(), "A Jéssica está prestando atenção", Toast.LENGTH_LONG);
                        toast.show();

                        dialog.cancel();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = Toast.makeText(getApplicationContext(), "A Jéssica não está prestando atenção", Toast.LENGTH_LONG);
                        toast.show();

                        dialog.cancel();
                    }
                });

        AlertDialog dialog = dialogBuilder.create();
        dialog.show();
    }
}
