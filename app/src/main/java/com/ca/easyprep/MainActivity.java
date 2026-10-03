package com.ca.easyprep;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("CA Foundation EasyPrep");
        title.setTextSize(26);
        title.setTextColor(Color.rgb(18, 59, 109));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText(
                "CA Foundation preparation\n\n" +
                "📘 Accounting\n" +
                "📗 Business Laws\n" +
                "📙 Quantitative Aptitude\n" +
                "📕 Business Economics\n\n" +
                "Simple language • Easy revision"
        );
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 40, 0, 0);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
          }
