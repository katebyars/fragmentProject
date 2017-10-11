package com.example.guest.dialogfragmentproject;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
@Bind(R.id.moodButton)
Button mMoodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMoodButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    FragmentManager fm = getSupportFragmentManager();
                    MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
                    moodDialogFragment.show(fm, "thing");
            }
        });

    }
}
