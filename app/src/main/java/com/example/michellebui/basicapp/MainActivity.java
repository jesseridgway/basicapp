package com.example.michellebui.basicapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    //Declaring our ImageView
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
        Picasso.with(this)
                .load("http://s3.amazonaws.com/bit-photos/large/7009224.jpeg")
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .into(imageView);

        TextView text = (TextView) findViewById(R.id.text_view);
        text.setTextColor(Color.parseColor("#3baac1"));
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_message);
        TextView textView = (TextView) findViewById(R.id.text_view);
        String message = editText.getText().toString();
        textView.setText(message);
        editText.setText("");
    }
}
