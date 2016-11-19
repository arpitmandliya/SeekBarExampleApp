    package com.java2blog.seekbarexampleapp;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.widget.SeekBar;
    import android.widget.TextView;
    import android.widget.SeekBar.OnSeekBarChangeListener;

    public class MainActivity extends AppCompatActivity {

        private SeekBar seekBar;
        private TextView textView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            seekBar = (SeekBar) findViewById(R.id.seekBar);
            textView = (TextView) findViewById(R.id.textView);
            // Set default value to 0
            textView.setText(seekBar.getProgress() + "/" + seekBar.getMax());
            seekBar.setOnSeekBarChangeListener(
                    new OnSeekBarChangeListener() {
                        int progress = 0;
                        @Override
                        public void onProgressChanged(SeekBar seekBar,
                                                      int progresValue, boolean fromUser) {
                            progress = progresValue;
                        }

                        @Override
                        public void onStartTrackingTouch(SeekBar seekBar) {
                        }

                        @Override
                        public void onStopTrackingTouch(SeekBar seekBar) {
                            // Display the value in textview
                            textView.setText("Progress : "+progress + "/" + seekBar.getMax());
                        }
                    });
        }


    }
