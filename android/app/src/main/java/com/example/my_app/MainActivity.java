package com.example.my_app;

import android.content.Intent;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "com.io.wilfried.play/jw";

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            if(call.method.equals("getPlayer")){
                                Intent intent = new Intent(getApplicationContext(), JWPlayerViewExample.class);
                                startActivity(intent);
                                result.success(true);
                            }else{
                                result.notImplemented();
                            }
                        }
                );
    }

//    private void methodToCall(){
//        // TODO: Add your license key
//        new LicenseUtil().setLicenseKey(this, "nsrdtE7wB9ihEPZz/aSKPmMvjLb7FR4A2VBViU3frR/aT6LK" );
//        mPlayerView = findViewById(R.id.jwplayer);
//        mPlayer = mPlayerView.getPlayer();
//
//        // Handle hiding/showing of ActionBar
//        mPlayer.addListener(EventType.FULLSCREEN, this);
//
//        // Keep the screen on during playback
//        new KeepScreenOnHandler(mPlayer, getWindow());
//
//        // Event Logging
//        mCallbackScreen = findViewById(R.id.callback_screen);
//        mCallbackScreen.registerListeners(mPlayer);
//
//        // Load a media source
////		PlayerConfig config = new PlayerConfig.Builder()
////				.file("https://testing-output-uswest1.s3.us-west-1.amazonaws.com/hlscontent/testA_720p.mpd")
////				.build();
//        PlayerConfig config = new PlayerConfig.Builder()
//                .playlistUrl("https://cdn.jwplayer.com/v2/media/1sc0kL2N?format=json")
//                .build();
//
//        mPlayer.setup(config);
//
//        // Get a reference to the CastContext
//        mCastContext = CastContext.getSharedInstance(this);
//    }
}
