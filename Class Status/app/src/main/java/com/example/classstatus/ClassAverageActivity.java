package com.example.classstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.classstatus.databinding.ActivityClassAverageBinding;
import com.example.classstatus.databinding.ActivityMainBinding;

public class ClassAverageActivity extends AppCompatActivity {
    private ActivityClassAverageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_average);
        binding = ActivityClassAverageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(view -> startActivity(new Intent(ClassAverageActivity.this,MainActivity.class)));

            //Array
            double[] classScores = {16.5, 2.25, 15, 11.5, 20, 18, 4.5, 20, 16, 14.75};

            //total of scores
            double sum = 0;
            for (int i = 0; i < classScores.length; i++) {
                sum += classScores[i] ;
                System.out.println(sum);

            }
            //getting Average
            double average = sum / classScores.length;
            String stringSum = Double.toString(average);
            binding.averageText.setText(stringSum);




    }
}