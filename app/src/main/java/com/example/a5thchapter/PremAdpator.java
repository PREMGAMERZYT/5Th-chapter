package com.example.a5thchapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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

        return super.getView(position, convertView, parent);
    }
}
