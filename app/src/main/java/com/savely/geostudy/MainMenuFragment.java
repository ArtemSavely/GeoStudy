package com.savely.geostudy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * Документация к классу. MainMenuFragment - фрагмент с главным меню приложения.
 */

public class MainMenuFragment extends Fragment {
    FrameLayout worldButton;
    FrameLayout europeButton;
    FrameLayout africaButton;
    FrameLayout americaButton;
    FrameLayout asiaButton;
    FrameLayout oceaniaButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        worldButton = view.findViewById(R.id.world_button);
        europeButton = view.findViewById(R.id.europe_button);
        africaButton = view.findViewById(R.id.africa_button);
        americaButton = view.findViewById(R.id.america_button);
        asiaButton = view.findViewById(R.id.asia_button);
        oceaniaButton = view.findViewById(R.id.oceania_button);
        ImageView globe = view.findViewById(R.id.globe);
        Animation globeRotateAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.globe_rotation_infinite);
        globe.startAnimation(globeRotateAnimation);
        worldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragmentDirections.ActionToMapMenuList action = MainMenuFragmentDirections
                        .actionToMapMenuList(new String[] {"world", getString(R.string.world)});
                Navigation.findNavController(view).navigate(action);  //переход к следующему фрагменту с передачей аргумента солгласно навигационному рельсу с Navigation API
            }
        });
        europeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragmentDirections.ActionToMapMenuList action = MainMenuFragmentDirections
                        .actionToMapMenuList(new String[] {"europe", getString(R.string.europe)});
                Navigation.findNavController(view).navigate(action); //переход к следующему фрагменту с передачей аргумента солгласно навигационному рельсу с Navigation API
            }
        });
        africaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragmentDirections.ActionToMapMenuList action = MainMenuFragmentDirections
                        .actionToMapMenuList(new String[] {"africa", getString(R.string.africa)});
                Navigation.findNavController(view).navigate(action); //переход к следующему фрагменту с передачей аргумента солгласно навигационному рельсу с Navigation API
            }
        });
        americaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragmentDirections.ActionToMapMenuList action = MainMenuFragmentDirections
                        .actionToMapMenuList(new String[] {"america", getString(R.string.america)});
                Navigation.findNavController(view).navigate(action); //переход к следующему фрагменту с передачей аргумента солгласно навигационному рельсу с Navigation API
            }
        });
        asiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragmentDirections.ActionToMapMenuList action = MainMenuFragmentDirections
                        .actionToMapMenuList(new String[] {"asia", getString(R.string.asia)});
                Navigation.findNavController(view).navigate(action); //переход к следующему фрагменту с передачей аргумента солгласно навигационному рельсу с Navigation API
            }
        });
        oceaniaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainMenuFragmentDirections.ActionToMapMenuList action = MainMenuFragmentDirections
                        .actionToMapMenuList(new String[] {"oceania", getString(R.string.oceania)});
                Navigation.findNavController(view).navigate(action); //переход к следующему фрагменту с передачей аргумента солгласно навигационному рельсу с Navigation API
            }
        });

        return view;
    }
}
