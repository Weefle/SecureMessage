package fr.weefle.myapplication;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class SenderFragment extends Fragment {

    private Button button;
    private EditText phone;
    private EditText message;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View rootView = inflater.inflate(R.layout.fragment_sender, container, false);
        button = rootView.findViewById(R.id.button);
        phone = rootView.findViewById(R.id.editText);
        message = rootView.findViewById(R.id.editText2);
        onClickButton();
        return rootView;
    }

    private void onClickButton() {
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                int random = new Random().nextInt(10000)*3;
                    Toast.makeText(getContext(),"Message envoyé!",Toast.LENGTH_SHORT).show();
                    SmsManager.getDefault().sendTextMessage(phone.getText().toString(),null,message.getText().toString() + " : " + random,null,null);
                }




        });
    }


}
