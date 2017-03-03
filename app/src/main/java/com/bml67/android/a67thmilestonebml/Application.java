package com.bml67.android.a67thmilestonebml;

public final class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT", "Roboto-Light.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "Roboto-Light.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "Roboto-Light.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "Roboto-Light.ttf");
    }
}