package com.example.duan1nhom2.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.duan1nhom2.R;


public class GoiYFragment extends Fragment {
    TextView tv_one, tv_two, tv_three, tv_four, tv_five, tv_six;
    Button btn_goiy;
    EditText edt_goiy;
    public GoiYFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_goi_y, container, false);
        edt_goiy = view.findViewById(R.id.edt_goiy);
        tv_one = view.findViewById(R.id.hu1);
        tv_two = view.findViewById(R.id.hu2);
        tv_three = view.findViewById(R.id.hu3);
        tv_four = view.findViewById(R.id.hu4);
        tv_five = view.findViewById(R.id.hu5);
        tv_six = view.findViewById(R.id.hu6);
        btn_goiy = view.findViewById(R.id.btngoiy);
        btn_goiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int goiy = Integer.parseInt(edt_goiy.getText().toString());
                tv_one.setText("1. Nhu cầu thiết yếu: " + (goiy * 55/100));
                tv_two.setText("2. Tiết kiệm: " + (goiy * 10 / 100));
                tv_three.setText("3. Giáo Dục: " + (goiy * 10/100));
                tv_four.setText("4. Hưởng Thụ: " + (goiy * 10/100));
                tv_five.setText("5. Cho đi: " + (goiy * 5/100));
                tv_six.setText("3. Tự do tài chính: " + (goiy * 10/100));
            }
        });
        return view;
    }

}
