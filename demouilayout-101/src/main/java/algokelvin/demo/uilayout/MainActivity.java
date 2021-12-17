package algokelvin.demo.uilayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;

import androidx.appcompat.app.AppCompatActivity;

import algokelvin.demo.uilayout.databinding.ActivityMainBinding;
import ui.algokelvin.uiview.textview.TextViewStylish;

public class MainActivity extends AppCompatActivity {
    private final TextViewStylish textViewStylish = new TextViewStylish(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        textViewStylish.setTextStylish(
                binding.txtSample, // id binding TextView
                20f, // size Text
                R.color.purple_500, // color Text
                Gravity.CENTER, // alignment Text
                Typeface.DEFAULT_BOLD // Style Text
        );

    }
}
