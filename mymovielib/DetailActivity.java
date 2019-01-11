package com.example.user.mymovielib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public TextView txtTitle, txtsinopsis, txtwaktu, txtnilai;
    public ImageView bg;
////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getIntent().getStringExtra("title"));

        txtwaktu = (TextView) findViewById(R.id.txtDate);
        txtwaktu.setText(getIntent().getStringExtra("date"));

        txtsinopsis = (TextView) findViewById(R.id.txtSynopsis);
        txtsinopsis.setText(getIntent().getStringExtra("overview"));

        txtnilai = (TextView) findViewById(R.id.txtRating);
        txtnilai.setText(getIntent().getStringExtra("vote"));

        bg = (ImageView) findViewById(R.id.bg);
        Picasso.with(this)
                .load("https://image.tmdb.org/t/p/w780" + getIntent().getStringExtra("bg"))
                .resize(1200, 700)
                .centerCrop()
                .into(bg);
    }
}

