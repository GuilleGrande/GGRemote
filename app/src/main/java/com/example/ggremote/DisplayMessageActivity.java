package com.example.ggremote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.ggremote.MainActivity.EXTRA_MESSAGE;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = getMessageFromIntent(intent);
        setMessageToTextView(message);
    }

    public String getMessageFromIntent(Intent intent) {
        return intent.getStringExtra(EXTRA_MESSAGE);
    }

    public void setMessageToTextView(String message) {
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}