package algokelvin.demo.uilayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;

import androidx.appcompat.app.AppCompatActivity;

import algokelvin.demo.uilayout.databinding.ActivityMainBinding;
import ui.algokelvin.uiview.textview.TextViewBorder;
import ui.algokelvin.uiview.textview.TextViewStylish;

public class MainActivity extends AppCompatActivity {
    private final TextViewStylish textViewStylish = new TextViewStylish(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Text Stylish - Size, Color, Alignment, and Style
        textViewStylish.setTextStylish(
                binding.txtSample, // id binding TextView
                20f, // size Text
                R.color.purple_500, // color Text
                Gravity.CENTER, // alignment Text
                Typeface.DEFAULT_BOLD // Style Text
        );

        // Text Color Mix
        String[] colorArray = {"#800000", "#000080"};
        String[] txtArray = {"Algo", "Kelvin"};
        textViewStylish.setColorCustom(binding.txtSample02, txtArray, colorArray);

        TextViewBorder txtBorder = new TextViewBorder(this,
                R.color.white, // Background color
                R.color.black, // Color Stroke
                1, // Size Stroke
                getSizeDp(getResources(), 8) // Size Radius
        );

    }
}
