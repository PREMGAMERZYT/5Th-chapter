package com.example.a5thchapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class PremAdpator extends ArrayAdapter<String> {


    private String Arr[];
    public PremAdpator(@NonNull Context context, int resource, @NonNull String[] Arr) {
        super(context, resource, Arr);
        this.Arr = Arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return Arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.prem_layout,parent,false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        return convertView;
    }
}
