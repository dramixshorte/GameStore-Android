/*
 *
 * Project Name : Game Store
 * Copyright (c) 2023."All rights reserved"
 * @author : PrettySoftware
 * @created : 26/05/2023, Friday
 *
 */

package com.GamesComplex.games;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;
import com.makeramen.roundedimageview.BuildConfig;
import com.GamesComplex.games.fragments.Home;
import com.GamesComplex.games.gameview.GameLoader;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ints();
        // custom fragment switching code
        if (savedInstanceState == null) {
            Navigate(new Home());
        }
        new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        navigation();
    }

    //find main activity function
    private void Ints() {
        toolbar = findViewById(R.id.view_toolbar);
        drawerLayout = findViewById(R.id.drawer_view);
        navigationView = findViewById(R.id.navigation);
    }


    @SuppressLint("UnsafeIntentLaunch")
    private void navigation() {
        navigationView.setNavigationItemSelectedListener(item -> {
            drawerLayout.closeDrawer(GravityCompat.START);
            //app navigation home button code
            if (item.getItemId() == R.id.nev_home) {
                finish();
                startActivity(getIntent());
            }


            //app navigation share button code
            else if (item.getItemId() == R.id.nev_rate) {

                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }


            //app navigation app update button code
            else if (item.getItemId() == R.id.nev_app_update) {

                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));

                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));

                }
            }


            //app navigation privacy policy button code
            else if (item.getItemId() == R.id.nev_policy) {
                GameLoader.game_url = getString(R.string.policy_url);
                Intent intent = new Intent(MainActivity.this, GameLoader.class);
                startActivity(intent);
            }

            //app navigation share button code
            else if (item.getItemId() == R.id.nev_app_share) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Night Games");
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
            }

            //app navigation privacy policy button code
            else if (item.getItemId() == R.id.version) {
                Toast.makeText(this, "You use latest version", Toast.LENGTH_SHORT).show();
            }

            return true;
        });
    }

    // fragment switching code you can changes
    private void Navigate(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container_view, fragment);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //Alert Dialog Start
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.app_name)).setIcon(R.mipmap.ic_launcher_round).setMessage("Are you sure the " + getString(R.string.app_name) + " app exit").setCancelable(true).setPositiveButton("Exit", (dialogInterface, i) -> MainActivity.super.onBackPressed()).setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        //Alert Dialog End
    }
}