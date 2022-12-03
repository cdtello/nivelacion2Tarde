package com.example.nivelacion2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nivelacion2.Adaptadores.ProductoAdaptador;
import com.example.nivelacion2.Entidades.Producto;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProducts;
    private ProductoAdaptador productoAdaptador;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        arrayProductos = new ArrayList<>();
        //***** Creacion Productos
        Producto producto1 = new Producto("Producto1", "Desc1", "1000", R.drawable.dragon);
        Producto producto2 = new Producto("Producto2", "Desc2", "2000", R.drawable.icontest);
        Producto producto3 = new Producto("Producto3", "Desc3", "3000", R.drawable.producto6);
        Producto producto4 = new Producto("Producto4", "Desc4", "4000", R.drawable.dragon);
        Producto producto5 = new Producto("Producto5", "Desc5", "5000", R.drawable.icontest);
        Producto producto6 = new Producto("Producto6", "Desc6", "6000", R.drawable.producto6);
        Producto producto7 = new Producto("Producto7", "Desc7", "7000", R.drawable.dragon);
        Producto producto8 = new Producto("Producto8", "Desc8", "8000", R.drawable.icontest);
        Producto producto9 = new Producto("Producto9", "Desc9", "9000", R.drawable.producto6);

        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);
        arrayProductos.add(producto6);
        arrayProductos.add(producto7);
        arrayProductos.add(producto8);
        arrayProductos.add(producto9);
        //*****
        productoAdaptador = new ProductoAdaptador(this, arrayProductos);

        listViewProducts.setAdapter(productoAdaptador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemAdd:
                Intent intent = new Intent(getApplicationContext(), Form.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Agregar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemFavorite:
                Toast.makeText(getApplicationContext(),"Favorito", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemShare:
                Toast.makeText(getApplicationContext(),"Compartir", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}