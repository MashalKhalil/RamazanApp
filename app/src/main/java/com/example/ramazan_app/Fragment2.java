package com.example.ramazan_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    Activity context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       context=getActivity();
        return inflater.inflate(R.layout.fragment2,container,false);
    }
    public void onStart()
    {
        super.onStart();
        TextView t1,t2,t3,t4;
        Button prev,next;
        String[] name,dua;
        final int[] index = {0};

        t1=(TextView) context.findViewById(R.id.tvv1);
        t2=(TextView) context.findViewById(R.id.tvv2);
        t3=(TextView) context.findViewById(R.id.text3) ;
        t4=(TextView) context.findViewById(R.id.text4);
        prev=(Button) context.findViewById(R.id.btt1);
        next=(Button) context.findViewById(R.id.btt2);

        name=getResources().getStringArray(R.array.dua_name);
        dua=getResources().getStringArray(R.array.trans);

        t1.setText(name[index[0]]);
        t2.setText(dua[index[0]]);
        t3.setText(String.valueOf(index[0] + 1) + "/");
        t4.setText(String.valueOf(name.length));
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index[0] ==0) {
                    Toast.makeText(context,"CLICK NEXT BUTTON:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index[0]--;
                    t3.setText(String.valueOf(index[0] + 1) + "/");
                    t1.setText(name[index[0]]);
                    t2.setText(dua[index[0]]);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index[0]== name.length-1) {
                    Toast.makeText(context,"No More DUA:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index[0]++;
                    t3.setText(String.valueOf(index[0] + 1) + "/");
                    t1.setText(name[index[0]]);
                    t2.setText(dua[index[0]]);
                }
            }
        });
    }
}
