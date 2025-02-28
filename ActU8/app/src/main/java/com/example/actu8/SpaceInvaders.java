package com.example.actu8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class SpaceInvaders extends View {

    private Bitmap naveBitmap;
    private Bitmap invaderBitmap;
    private int numInvaders = 5;
    private int numFilas = 5;

    public SpaceInvaders(Context context, AttributeSet attrs) {
        super(context, attrs);
        cargarBitmaps();
    }

    //Metodo para obtener y cargar cada iamgen en bitmap.
    private void cargarBitmaps() {
        //cargamos la nave
        Bitmap nave = BitmapFactory.decodeResource(getResources(), R.drawable.starship);
        naveBitmap = Bitmap.createScaledBitmap(nave, 150, 100, false);
        nave.recycle();

        //cargamos el invader
        Bitmap originalInvaderBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.invader);
        invaderBitmap = Bitmap.createScaledBitmap(originalInvaderBitmap, 80, 80, false);
        originalInvaderBitmap.recycle();
    }

    //Hacemos el ondraw para pintar en la pantalla las imagenes.
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //posicion inicial de la nave y la pintamos
        float naveX = (getWidth() - 150) / 2f;
        float naveY = getHeight() - 100 - 20f;
        canvas.drawBitmap(naveBitmap, naveX, naveY, null);

        //posicion donde iniciaremos la fila de invaders
        float startX = 20f;
        float startY = 20f;
        //espacio entre cada invader
        int invaderSpacingX = 80 + 20;
        int invaderSpacingY = 80 + 20;
        // bucle para crear las filas y invaders
        for (int row = 0; row < numFilas; row++) {
            for (int col = 0; col < numInvaders; col++) {
                // Calcular la posición X del invader actual
                float invaderX = startX + col * invaderSpacingX;
                // Calcular la posición Y del invader actual
                float invaderY = startY + row * invaderSpacingY;
                // Dibujar el invader
                canvas.drawBitmap(invaderBitmap, invaderX, invaderY, null);
            }
        }
    }
}