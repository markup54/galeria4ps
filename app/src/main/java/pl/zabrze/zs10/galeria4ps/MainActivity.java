package pl.zabrze.zs10.galeria4ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBarSrednia;
    RatingBar ratingBarUzytkownik;
    Button buttonDalej;
    Button buttonWstecz;
    Button buttonOcen;
    ImageView imageView;
    TextView textView;
    ArrayList<Obraz> obrazki = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBarSrednia = findViewById(R.id.ratingBar);
        ratingBarUzytkownik = findViewById(R.id.ratingBar2);
        buttonWstecz = findViewById(R.id.button);
        buttonDalej = findViewById(R.id.button2);
        buttonOcen = findViewById(R.id.button3);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textViewOpis);
        obrazki.add(new Obraz(R.drawable.k2,"Szczyt K2"));
        obrazki.add(new Obraz(R.drawable.anna, "Szczyt Anna Purna"));
        obrazki.add(new Obraz(R.drawable.mont,"Szczyt Mont Everest"));


    }
}