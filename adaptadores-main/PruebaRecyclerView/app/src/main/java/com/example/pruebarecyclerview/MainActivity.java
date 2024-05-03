package com.example.pruebarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pruebarecyclerview.adaptadores.UsuarioAdaptador;
import com.example.pruebarecyclerview.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements UsuarioAdaptador.OnItemClickListener {

    RecyclerView rcv_usuarios;
    List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("https://cdn.allfamous.org/people/headshots/luar-la-l-4b12-1646903757238-allfamous.org.jpg", "LUAL LA L", "CHANTEADOR");
        Usuario usu2 = new Usuario("https://files.lafm.com.co/assets/public/2020-03/anuel__3_0.jpg", "ANUEL", "CANTANTE");
        Usuario usu3 = new Usuario("https://www.primerahora.com/resizer/rvtLitX3XJHAKn7IhV2th3MQgqM=/2560x0/smart/filters:quality(75):format(jpeg)/cloudfront-us-east-1.images.arcpublishing.com/gfrmedia/RTRS75TRXBFPBIMJLDFJZ6J44Q.jpg", "ELADIO", "MALEANTEO");

        usuarioList.add(usu1);
        usuarioList.add(usu2);
        usuarioList.add(usu3);

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(usuarioList));

        UsuarioAdaptador adaptador = new UsuarioAdaptador(usuarioList);
        rcv_usuarios.setAdapter(adaptador);
        adaptador.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(Usuario usuario) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
}