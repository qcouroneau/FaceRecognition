package com.example.myapplication;

// https://www.youtube.com/watch?v=eBhgbhyyE_g

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;

public class Popup extends Dialog {

    //fields
    private String title;
    private String subtitle;
    private Button croixButton;
    private TextView titleView, subTitleView;

    //constructor
    public Popup(Activity activity)
    {
        super(activity, R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.popup_template);
        this.title = "Titre du popup";
        this.subtitle = "Sous-titre";
        this.croixButton = findViewById(R.id.croix_button);
        this.titleView = findViewById(R.id.title_popup);
        this.subTitleView = findViewById(R.id.subtitle_popup);


    }

    public void setTitle(String title) { this.title = title; }

    public void setSubtitle(String subtitle) { this.subtitle = subtitle; }

    public Button getRdvButton() { return croixButton; }

    public void build(){
        show();
        titleView.setText(title);
        subTitleView.setText(subtitle);

    }


}
