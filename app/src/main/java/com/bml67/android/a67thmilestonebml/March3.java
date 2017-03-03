package com.bml67.android.a67thmilestonebml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Student on 20/2/2017.
 */

public class March3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_march3);
    }

    public void openBattleOfBands(View view) {
        Intent i = new Intent(this, BattleOfBands.class);
        startActivity(i);
    }

    public void openBeatTheStreet(View view) {
        Intent i = new Intent(this, BeatTheStreet2.class);
        startActivity(i);
    }



    public void openMarketMadness(View view) {
        Intent i = new Intent(this, MarketMadness.class);
        startActivity(i);
    }

    public void openVirtualStockMarket(View view) {
        Intent i = new Intent(this, VirtualStockMarket.class);
        startActivity(i);
    }

    public void openZombieHunt(View view) {
        Intent i = new Intent(this, ZombieHunt.class);
        startActivity(i);
    }

    public void openWriteItUp(View view) {
        Intent i = new Intent(this, WriteItUp.class);
        startActivity(i);
    }


    public void openTheatrePhantamonica(View view) {
        Intent i = new Intent(this, TheatrePhantamonica.class);
        startActivity(i);
    }

    public void openTheXposure(View view) {
        Intent i = new Intent(this, TheXposure.class);
        startActivity(i);
    }

    public void openQriosity(View view) {
        Intent i = new Intent(this, Qriosity.class);
        startActivity(i);
    }

    public void openPerspective(View view) {
        Intent i = new Intent(this, Perspective.class);
        startActivity(i);
    }



    public void openBMUPitchers(View view) {
        Intent i = new Intent(this, BMUPitchers.class);
        startActivity(i);
    }

    public void openFashionCrave(View view) {
        Intent i = new Intent(this, FashionCrave.class);
        startActivity(i);
    }

    public void openHackathon(View view) {
        Intent i = new Intent(this, Hackathon.class);
        startActivity(i);
    }

    public void openAerialDrones(View view) {
        Intent i = new Intent(this, AerialDrones.class);
        startActivity(i);
    }

    public void openBlackBox(View view) {
        Intent i = new Intent(this, BlackBox.class);
        startActivity(i);
    }

    public void openEventHorizon(View view) {
        Intent i = new Intent(this, EventHorizon.class);
        startActivity(i);
    }

    public void openGamingArena(View view) {
        Intent i = new Intent(this, GamingArena.class);
        startActivity(i);
    }

    public void openLineFollower(View view) {
        Intent i = new Intent(this, LineFollower.class);
        startActivity(i);
    }

    public void openLiveTicTacToe(View view) {
        Intent i = new Intent(this, LiveTicTacToe.class);
        startActivity(i);
    }

    public void openMatlabQuest(View view) {
        Intent i = new Intent(this, MatlabQuest.class);
        startActivity(i);
    }



    public void openNerdParadise(View view) {
        Intent i = new Intent(this, NerdParadise.class);
        startActivity(i);
    }

    public void openRobotusKreig(View view) {
        Intent i = new Intent(this, RobotusKreig.class);
        startActivity(i);
    }

    public void openBMUMasterchef(View view) {
        Intent i = new Intent(this, BMUMasterchef.class);
        startActivity(i);
    }

    public void openGrappling(View view) {
        Intent i = new Intent(this, Grappling.class);
        startActivity(i);
    }

    public void openMyMilestoneMovie(View view) {
        Intent i = new Intent(this, MyMilestoneMovie.class);
        startActivity(i);
    }

    public void openNayavada(View view) {
        Intent i = new Intent(this, Nayavada.class);
        startActivity(i);
    }

    public void openNitroSurge(View view) {
        Intent i = new Intent(this, NitroSurge.class);
        startActivity(i);
    }

    public void openWomensGotTalent(View view) {
        Intent i = new Intent(this, WomensGotTalent.class);
        startActivity(i);
    }
}