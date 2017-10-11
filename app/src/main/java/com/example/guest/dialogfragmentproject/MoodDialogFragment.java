package com.example.guest.dialogfragmentproject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.guest.dialogfragmentproject.R;

public class MoodDialogFragment extends DialogFragment {

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);

       Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
       Button submitButton = (Button) rootView.findViewById(R.id.submitButton);

       cancelButton.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               dismiss();
           }
       });
       return rootView;

   }
}
