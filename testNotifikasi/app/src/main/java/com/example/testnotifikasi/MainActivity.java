package com.example.testnotifikasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nomor;
    Button tombol;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomor = findViewById(R.id.nomor);
        tombol = findViewById(R.id.tombol);
        Add();
    }

    private void Add(){
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(nomor.getText().toString());
                if (i < 50)
                    Notiftest();
                else
                    Toast.makeText(MainActivity.this, "asdasd", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void Notiftest() {
        long[] PolaGetar = {100, 100};
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Issues Notif")
                .setAutoCancel(true)
                .setContentText("Berhasil Pak")
                .setVibrate(PolaGetar);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());
    }
}
