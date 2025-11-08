/*
 *
 * Project Name : Game Store
 * Copyright (c) 2023."All rights reserved"
 * @author : PrettySoftware
 * @created : 26/05/2023, Friday
 *
 */

package com.GamesComplex.games.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.makeramen.roundedimageview.RoundedImageView;
import com.GamesComplex.games.GameHomeList;
import com.GamesComplex.games.R;
import com.GamesComplex.games.Url;
import com.GamesComplex.games.adsnetwork.Admob;
import com.GamesComplex.games.categories.CategoryAction;
import com.GamesComplex.games.categories.CategoryArcade;
import com.GamesComplex.games.categories.CategoryEducation;
import com.GamesComplex.games.categories.CategoryPuzzle;
import com.GamesComplex.games.categories.CategoryRacing;
import com.GamesComplex.games.categories.CategorySports;
import com.GamesComplex.games.gameview.GameLoader;

import java.util.HashMap;

public class Home extends Fragment {

    View view;
    ListView GameList;
    RoundedImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7, img_8, img_9;
    CardView card_1, card_2, card_3, card_4, card_6, card_7;
    MediaPlayer player;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.home_activity, container, false);

        IdInit();
        Admob.BannerAds(view.findViewById(R.id.HomeBanner), getActivity());
        Admob.FullscreenAd(getActivity());
        clickImg();
        CategoryClick();
        GameHomeList.GameTableList();
        GameAdapter GameAdapter = new GameAdapter(requireContext());
        GameList.setAdapter(GameAdapter);
        GameAdapter.notifyDataSetChanged();

        return view;
    }


    // All Variable Init
    private void IdInit() {
        GameList = view.findViewById(R.id.main_list_view);
        img_1 = view.findViewById(R.id.card_button_1);
        img_2 = view.findViewById(R.id.card_button_2);
        img_3 = view.findViewById(R.id.card_button_3);
        img_4 = view.findViewById(R.id.card_button_4);
        img_5 = view.findViewById(R.id.card_button_5);
        img_6 = view.findViewById(R.id.card_button_6);
        img_7 = view.findViewById(R.id.card_button_7);
        img_8 = view.findViewById(R.id.card_button_8);
        img_9 = view.findViewById(R.id.card_button_9);

        //for cardView
        card_1 = view.findViewById(R.id.cat_action);
        card_2 = view.findViewById(R.id.cat_sports);
        card_3 = view.findViewById(R.id.cat_puzzle);
        card_4 = view.findViewById(R.id.cat_racing);
        card_6 = view.findViewById(R.id.cat_education);
        card_7 = view.findViewById(R.id.cat_arcade);
    }


    //cardView click listener
    private void clickImg() {

        img_1.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_1;
        });

        img_2.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_2;
        });

        img_3.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_3;
        });

        img_4.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_4;
        });

        img_5.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_5;
        });

        img_6.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_6;
        });

        img_7.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_7;
        });

        img_8.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_8;
        });

        img_9.setOnClickListener(view -> {
            Intent();
            GameLoader.game_url = Url.img_9;
        });
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //category click listener
    private void CategoryClick() {

        card_1.setOnClickListener(view -> {
            audio();
            Intent intent = new Intent(getActivity(), CategoryAction.class);
            startActivity(intent);
        });

        card_2.setOnClickListener(view -> {
            audio();
            Intent intent = new Intent(getActivity(), CategorySports.class);
            startActivity(intent);
        });

        card_3.setOnClickListener(view -> {
            audio();
            Intent intent = new Intent(getActivity(), CategoryPuzzle.class);
            startActivity(intent);
        });

        card_4.setOnClickListener(view -> {
            audio();
            Intent intent = new Intent(getActivity(), CategoryRacing.class);
            startActivity(intent);
        });

        card_6.setOnClickListener(view -> {
            audio();
            Intent intent = new Intent(getActivity(), CategoryEducation.class);
            startActivity(intent);
        });

        card_7.setOnClickListener(view -> {
            audio();
            Intent intent = new Intent(getActivity(), CategoryArcade.class);
            startActivity(intent);
        });

    }

    //===================================================
    //custom intent for game activity
    private void Intent() {
        Intent intent = new Intent(requireContext(), GameLoader.class);
        startActivity(intent);
    }

    private void audio() {
        player = MediaPlayer.create(getContext(), R.raw.click);
        player.start();
    }

    private class GameAdapter extends BaseAdapter {

        private final LayoutInflater inflater;
        Intent targetActivity;

        public GameAdapter(Context context) {
            this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return GameHomeList.GameArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int position, View inflaterView, ViewGroup parent) {
            inflaterView = inflater.inflate(R.layout.home_list_item, parent, false);

            ImageView LogoImage = inflaterView.findViewById(R.id.item_Tv_ImageView);
            TextView Tv_TextView = inflaterView.findViewById(R.id.item_Tv_textView);
            RelativeLayout layItem = inflaterView.findViewById(R.id.clicklayitem);

            HashMap<String, String> mHashMap = GameHomeList.GameArrayList.get(position);
            String GameName = mHashMap.get("GameName");
            String ImageIcon = mHashMap.get("GameLogo");
            String GameUrl = mHashMap.get("GameUrl");


            if (Tv_TextView != null) Tv_TextView.setText(GameName);
            if (LogoImage != null && ImageIcon != null) {
                int drawable = Integer.parseInt(ImageIcon);
                LogoImage.setImageResource(drawable);
            }


            Animation animation = AnimationUtils.loadAnimation(inflaterView.getContext(), R.anim.listview_animation);
            animation.setStartOffset(position * 300L);
            inflaterView.startAnimation(animation);


            if (layItem != null) {
                layItem.setOnClickListener(v -> {
                    if (GameUrl != null && GameUrl.length() > 5) {
                        GameLoader.game_url = GameUrl;
                        targetActivity = new Intent(getActivity(), GameLoader.class);
                        startActivity(targetActivity);
                    }
                    if (Admob.mInterstitialAd == null) startActivity(targetActivity);
                    else if (Admob.FULLSCREEN_AD_LOAD_COUNT >= Admob.fullScreenAdMaxShowCount)
                        startActivity(targetActivity);
                    else Admob.mInterstitialAd.show(requireActivity());
                });
            }

            return inflaterView;
        }

    }
}