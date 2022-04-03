package com.example.ramazan_app.ui.name;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ramazan_app.R;
import com.example.ramazan_app.databinding.FragmentNameBinding;

public class NameFragment extends Fragment {
    private FragmentNameBinding binding;

    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();

        binding = FragmentNameBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void onStart() {
        super.onStart();
        TextView t1, t2, t3, t4, t5;
        Button left, right;
        String[] name, name2, meaning;
        final int[] index = {0};
        t1 = (TextView) context.findViewById(R.id.name);
        t2 = (TextView) context.findViewById(R.id.name2);
        t3 = (TextView) context.findViewById(R.id.mean);
        t4 = (TextView) context.findViewById(R.id.textView5);
        t5 = (TextView) context.findViewById(R.id.textView6);
        left = (Button) context.findViewById(R.id.button);
        right = (Button) context.findViewById(R.id.button2);

        name = getResources().getStringArray(R.array.Name1);
        name2 = getResources().getStringArray(R.array.Name2);
        meaning = getResources().getStringArray(R.array.mean);

        t4.setText(String.valueOf(index[0] + 1) + "/");
        t5.setText(String.valueOf(name.length));
        t1.setText(name[index[0]]);
        t2.setText(name2[index[0]]);
        t3.setText(meaning[index[0]]);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index[0] == 0) {
                    Toast.makeText(context, "Click Right Button", Toast.LENGTH_SHORT).show();
                } else {
                    index[0]--;
                    t4.setText(String.valueOf(index[0] + 1) + "/");
                    t1.setText(name[index[0]]);
                    t2.setText(name2[index[0]]);
                    t3.setText(meaning[index[0]]);
                }

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index[0] == name.length - 1) {
                    Toast.makeText(context, "Click left Button", Toast.LENGTH_SHORT).show();
                } else {
                    index[0]++;
                    t4.setText(String.valueOf(index[0] + 1) + "/");
                    t1.setText(name[index[0]]);
                    t2.setText(name2[index[0]]);
                    t3.setText(meaning[index[0]]);
                }
            }
        });

    }
}
