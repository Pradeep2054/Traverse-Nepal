package android.e.tnepalui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainPageActivity extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    private RelativeLayout navbarHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        dl = findViewById(R.id.mDrawerLayout);

        abdt=  new ActionBarDrawerToggle(this,dl, R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);


        navbarHeader = findViewById(R.id.mQRcodeInfo);
        navbarHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQRCodeActiviy();
            }
        });

        dl.addDrawerListener(abdt);
        abdt.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView nav_view = findViewById(R.id.mNavView);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.mWishList){
                    Toast.makeText(MainPageActivity.this, "WishList", Toast.LENGTH_LONG).show();
                }
                else if(id == R.id.mBookHotel){
                    Toast.makeText(MainPageActivity.this, "BookHotel", Toast.LENGTH_LONG).show();
                }
                else if(id == R.id.mBookHotel){
                    Toast.makeText(MainPageActivity.this, "BookHotel", Toast.LENGTH_LONG).show();
                }
                if(id == R.id.mNavigation){
                    Toast.makeText(MainPageActivity.this, "Navigation", Toast.LENGTH_LONG).show();
                }
                if(id == R.id.mToDoList){
                    Toast.makeText(MainPageActivity.this, "Todo list", Toast.LENGTH_LONG).show();
                }
                return true;
            }

        });

    }

    public void openQRCodeActiviy()
    {
        Toast.makeText(this, "BookHotel", Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

}
