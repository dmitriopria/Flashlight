package com.example.flashlight;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonFlash;
    private FlashClass flashClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFlash = findViewById(R.id.FlashButton);
        flashClass = new FlashClass(this);
    }

    public void clickFlashButton(View view) {
        if (flashClass.isStatus()) {
            flashClass.flashOff();
            buttonFlash.setText(R.string.on);
            buttonFlash.setActivated(false);
        } else {
            flashClass.flashOn();
            buttonFlash.setText(R.string.off);
            buttonFlash.setActivated(true);
        }
    }
}