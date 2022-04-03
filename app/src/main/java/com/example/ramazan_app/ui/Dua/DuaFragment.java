package com.example.ramazan_app.ui.Dua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ramazan_app.MainActivity2;
import com.example.ramazan_app.R;
import com.example.ramazan_app.databinding.FragmentDuaBinding;

public class DuaFragment extends Fragment {

    private FragmentDuaBinding binding;

    Activity context;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();
        binding = FragmentDuaBinding.inflate(inflater, container, false);
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
        Button btn;
        btn=(Button)context.findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context, MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}