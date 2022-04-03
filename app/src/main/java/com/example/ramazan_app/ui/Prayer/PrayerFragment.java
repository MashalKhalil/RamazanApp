package com.example.ramazan_app.ui.Prayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ramazan_app.R;
import com.example.ramazan_app.databinding.FragmentPrayerBinding;

public class PrayerFragment extends Fragment {
    private FragmentPrayerBinding binding;

    Activity context;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();
        
        binding = FragmentPrayerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void onStart()
    {
        super.onStart();
        TextView t1,t2,t3,t4,t5;
        t1=(TextView) context.findViewById(R.id.textView13);
        t2=(TextView) context.findViewById(R.id.textView14);
        t3=(TextView) context.findViewById(R.id.textView15);
        t4=(TextView) context.findViewById(R.id.textView16);
        t5=(TextView) context.findViewById(R.id.textView17);


        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(context.getApplicationContext(),R.animator.moveup);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);

        @SuppressLint("ResourceType") Animation ani = AnimationUtils.loadAnimation(context.getApplicationContext(),R.animator.moveup);
        t2.setVisibility(View.VISIBLE);
        t2.startAnimation(ani);

        @SuppressLint("ResourceType") Animation an = AnimationUtils.loadAnimation(context.getApplicationContext(),R.animator.moveup);
        t3.setVisibility(View.VISIBLE);
        t3.startAnimation(an);

        @SuppressLint("ResourceType") Animation a = AnimationUtils.loadAnimation(context.getApplicationContext(),R.animator.moveup);
        t4.setVisibility(View.VISIBLE);
        t4.startAnimation(a);

        @SuppressLint("ResourceType") Animation b = AnimationUtils.loadAnimation(context.getApplicationContext(),R.animator.moveup);
        t5.setVisibility(View.VISIBLE);
        t5.startAnimation(b);

    }
}
