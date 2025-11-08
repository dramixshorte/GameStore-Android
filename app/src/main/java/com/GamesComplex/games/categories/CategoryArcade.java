/*
 *
 * Project Name : Game Store
 * Copyright (c) 2023."All rights reserved"
 * @author : PrettySoftware
 * @created : 26/05/2023, Friday
 *
 */

package com.GamesComplex.games.categories;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.GamesComplex.games.GameHomeList;
import com.GamesComplex.games.R;
import com.GamesComplex.games.adsnetwork.Admob;
import com.GamesComplex.games.gameview.GameLoader;

import java.util.HashMap;

public class CategoryArcade extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_arcade_view);

        gridView = findViewById(R.id.ArcadeGrid);
        Admob.BannerAds(findViewById(R.id.ArcadeBanner), CategoryArcade.this);
        Admob.FullscreenAd(CategoryArcade.this);


        GameHomeList.ArcadeList();
        ArcadeAdapter adapter = new ArcadeAdapter();
        gridView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private class ArcadeAdapter extends BaseAdapter {


        private final LayoutInflater inflater;
        Intent targetActivity;


        public ArcadeAdapter() {
            this.inflater = (LayoutInflater) CategoryArcade.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return GameHomeList.GameArrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {

            view = inflater.inflate(R.layout.category_item_view, viewGroup, false);

            ImageView imgIcon = view.findViewById(R.id.category_img_item);
            TextView tvTitle = view.findViewById(R.id.category_text_item);
            LinearLayout layItemView = view.findViewById(R.id.layItemView);

            HashMap<String, String> mHashMap = GameHomeList.GameArrayList.get(i);
            String ArcadeName = mHashMap.get("ArcadeName");
            String ArcadeImg = mHashMap.get("ArcadeImg");
            String ArcadeUrl = mHashMap.get("ArcadeUrl");

            if (tvTitle != null) tvTitle.setText(ArcadeName);
            if (imgIcon != null && ArcadeImg != null) {
                int drawable = Integer.parseInt(ArcadeImg);
                imgIcon.setImageResource(drawable);
            }

            Animation animation = AnimationUtils.loadAnimation(view.getContext(), R.anim.app_anim);
            animation.setStartOffset(i * 300L);
            view.startAnimation(animation);


            if (layItemView != null) {
                layItemView.setOnClickListener(v -> {
                    if (ArcadeUrl != null && ArcadeUrl.length() > 5) {
                        GameLoader.game_url = ArcadeUrl;
                        targetActivity = new Intent(CategoryArcade.this, GameLoader.class);
                        startActivity(targetActivity);
                    }
                    if (Admob.mInterstitialAd == null) startActivity(targetActivity);
                    else if (Admob.FULLSCREEN_AD_LOAD_COUNT >= Admob.fullScreenAdMaxShowCount)
                        startActivity(targetActivity);
                    else Admob.mInterstitialAd.show(CategoryArcade.this);

                });
            }

            return view;
        }
    }
}