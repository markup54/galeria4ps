package pl.zabrze.zs10.galeria4ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    int aktualnyIndeks =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBarSrednia = findViewById(R.id.ratingBar);
        ratingBarUzytkownik = findViewById(R.id.ratingBar2);
        buttonWstecz = findViewById(R.id.button2);
        buttonDalej = findViewById(R.id.button3);
        buttonOcen = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textViewOpis);
        obrazki.add(new Obraz(R.drawable.k2,"Szczyt K2"));
        obrazki.add(new Obraz(R.drawable.anna, "Szczyt Anna Purna"));
        obrazki.add(new Obraz(R.drawable.mont,"Szczyt Mont Everest"));
        buttonDalej.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualnyIndeks++;
                        if(aktualnyIndeks >=obrazki.size())
                            aktualnyIndeks =0;
                        wyswietlObraz(aktualnyIndeks);
                    }
                }
        );
        buttonWstecz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualnyIndeks--;
                        if(aktualnyIndeks<0)
                            aktualnyIndeks = obrazki.size()-1;
                        wyswietlObraz(aktualnyIndeks);
                    }
                }
        );

        buttonOcen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        float ocenka = ratingBarUzytkownik.getRating();
                        obrazki.get(aktualnyIndeks).setOceny(ocenka);
                        wyswietlObraz(aktualnyIndeks);
                    }
                }
        );

    }
    private void wyswietlObraz(int x){
        imageView.setImageResource(obrazki.get(x).getIdObrazka());
        textView.setText(obrazki.get(x).getOpis());
        ratingBarSrednia.setRating((float)obrazki.get(x).obliczSredniaOcen());
        ratingBarUzytkownik.setRating(0);
    }
}