package com.example.givemepss.toolbarviewpagertabsdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rick on 2016/7/9.
 */

public class PageThree extends PageView {
    public PageThree(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.page_content, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText("Page Three");
        addView(view);
    }

    @Override
    public void refresh() {

    }
}
