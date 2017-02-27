package com.qf.lingering.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.lingering.R;


/**
 * Created by zuowei on 2017-02-22.
 */

public class MagzinePersonFragment extends Fragment {

    //音乐人加载的gridview列表

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musicperson, container, false);
        return view;
    }

}
