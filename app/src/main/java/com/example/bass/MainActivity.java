package com.example.bass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.applozic.mobicommons.commons.core.utils.Utils;

import io.kommunicate.KmChatBuilder;
import io.kommunicate.Kommunicate;
import io.kommunicate.callbacks.KmCallback;

import static android.provider.UserDictionary.Words.APP_ID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Kommunicate.init(this, "33d2429f0e4b298bd8a05aa603bd22f5c");
        new KmChatBuilder(this).launchChat(new KmCallback() {
            @Override
            public void onSuccess(Object message) {
                Uti11111s.printLog(MainActivity.this, "ChatTest", "Success : " + message);
            }

            @Override
            public void onFailure(Object error) {
                Utils.printLog(MainActivity.this, "ChatTest", "Failure : " + error);
            }
        });
    }
}
