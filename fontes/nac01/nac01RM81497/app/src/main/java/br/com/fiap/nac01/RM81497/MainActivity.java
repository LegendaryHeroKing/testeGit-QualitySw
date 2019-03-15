package br.com.fiap.nac01.RM81497;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int a=0;
    ImageView pessoa;
 int[] imagens={
         R.drawable.p0,
         R.drawable.p1,
         R.drawable.p2,
         R.drawable.p3,
         R.drawable.p4,
         R.drawable.p5,
         R.drawable.p6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa=findViewById(R.id.imagem);
    }




    public void ImagemAnterior(View view) {
         a=a-1;
        if(a<0){
            a=6;
        }
        pessoa.setImageResource(imagens[a]);
    }

    public void ProximaImagem(View view) {
         a=a+1;
        if(a>6){
            a=0;
        }
        pessoa.setImageResource(imagens[a]);
    }
}
