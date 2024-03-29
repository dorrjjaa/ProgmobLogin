package com.utsprogmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.utsprogmob.Adapter.DosenAdapter;
import com.utsprogmob.Model.Dosen;
import com.utsprogmob.Adapter.DosenAdapter;
import com.utsprogmob.Model.Dosen;

import java.util.ArrayList;

public class RecyclerViewListDsn extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DosenAdapter dosenAdapter;
    private ArrayList<Dosen> dosenList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewListDsn.this,CreateDosenActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list_dsn);
        this.setTitle("SI KRS - Hai Admin");
        tambahData();

        recyclerView = findViewById(R.id.rvDosen);
        dosenAdapter = new DosenAdapter(dosenList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewListDsn.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dosenAdapter);
    }

    private void tambahData(){
        dosenList = new ArrayList<>();
        dosenList.add(new Dosen("001","Argo Wibowo", "S.T, M.T","argo@staff.ukdw.ac.id","Jl. Godean",R.drawable.diri));
        dosenList.add(new Dosen("002","Yetli Oslan", "S.Kom, M.T","yetli@staff.ukdw.ac.id","Jl. Solo",R.drawable.diri));
        dosenList.add(new Dosen("003","Harianto Kristanto", "Ir. M.M, M.T","hariantok@staff.ukdw.ac.id","Jl. Godean",R.drawable.org));
        dosenList.add(new Dosen("004","Jong Jek Siang", "Drs. M.Sc","jjs@staff.ukdw.ac.id","Jl. Seturan",R.drawable.org));
        dosenList.add(new Dosen("005","Erick Kurniawan", "S.Kom, M.Kom","ekurniawan@staff.ukdw.ac.id","Jl. Godean",R.drawable.diri));
    }
}
