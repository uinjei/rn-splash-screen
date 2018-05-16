package com.uinjei.reactnative.launchscreen;

import com.facebook.react.ReactActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

class SplashScreenModule extends ReactContextBaseJavaModule {
    public SplashScreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "SplashScreen";
    }

    /**
     * Show the splash screen.
     */
    @ReactMethod
    public void show() {
        SplashScreen.show((ReactActivity) getCurrentActivity(), null, 0);
    }

    /**
     * Close the active splash screen.
     */
    @ReactMethod
    public void hide() {
        SplashScreen.hide(getCurrentActivity());
    }
}
