package com.polito.dion;

/**
 * Created by moose on 5/15/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;


public final class DefaultIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Down here, we add the xml layouts into sample slide inflater.
        addSlide(IntroSlideActivity.newInstance(R.layout.intro1));
        addSlide(IntroSlideActivity.newInstance(R.layout.intro2));
        addSlide(IntroSlideActivity.newInstance(R.layout.intro3));
        addSlide(IntroSlideActivity.newInstance(R.layout.intro4));


        showStatusBar(true);

        setDepthAnimation();

    }



    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        loadProfileActivity();
    }

    private void loadWelcomeActivity(){
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    private void loadProfileActivity(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        loadProfileActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    public void getStarted(View v){
        loadWelcomeActivity();
    }
}