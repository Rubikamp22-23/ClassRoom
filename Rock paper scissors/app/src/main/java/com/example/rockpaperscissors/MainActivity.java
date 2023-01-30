package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rockpaperscissors.databinding.ActivityMainBinding;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    private ActivityMainBinding binding;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.paperPlayer.setVisibility(View.INVISIBLE);
        binding.rockPlayer.setVisibility(View.INVISIBLE);
        binding.scissorsPlayer.setVisibility(View.INVISIBLE);

        binding.paperBot.setVisibility(View.INVISIBLE);
        binding.rockBot.setVisibility(View.INVISIBLE);
        binding.scissorsBot.setVisibility(View.INVISIBLE);


        binding.paperIconImage.setOnClickListener(view ->{
            int myRandomNumber = random.nextInt(3);

            binding.paperPlayer.setVisibility(View.VISIBLE);
            binding.rockPlayer.setVisibility(View.INVISIBLE);
            binding.scissorsPlayer.setVisibility(View.INVISIBLE);

            if (myRandomNumber == 2) {
                //scissors
                binding.paperBot.setVisibility(View.INVISIBLE);
                binding.rockBot.setVisibility(View.INVISIBLE);
                binding.scissorsBot.setVisibility(View.VISIBLE);
                binding.status.setText("Scissors Cut Paper!");
                Toast.makeText(MainActivity.this, "You lose!", Toast.LENGTH_SHORT).show();

            } else if (myRandomNumber == 1) {
                //rock
                binding.paperBot.setVisibility(View.INVISIBLE);
                binding.rockBot.setVisibility(View.VISIBLE);
                binding.scissorsBot.setVisibility(View.INVISIBLE);
                binding.status.setText("Paper Covers Rock!");
                Toast.makeText(MainActivity.this, "You win!", Toast.LENGTH_SHORT).show();

            } else if(myRandomNumber == 0) {
                //paper
            binding.paperBot.setVisibility(View.VISIBLE);
            binding.rockBot.setVisibility(View.INVISIBLE);
            binding.scissorsBot.setVisibility(View.INVISIBLE);
            binding.status.setText("Paper Equals Paper!");}
        });

        binding.rockIconImage.setOnClickListener(view ->{
            int myRandomNumber = random.nextInt(3);

            binding.paperPlayer.setVisibility(View.INVISIBLE);
            binding.rockPlayer.setVisibility(View.VISIBLE);
            binding.scissorsPlayer.setVisibility(View.INVISIBLE);

            if (myRandomNumber == 2) {
                //scissors
                binding.paperBot.setVisibility(View.INVISIBLE);
                binding.rockBot.setVisibility(View.INVISIBLE);
                binding.scissorsBot.setVisibility(View.VISIBLE);
                binding.status.setText("Rock Breaks Scissors!");
                Toast.makeText(MainActivity.this, "You win!", Toast.LENGTH_SHORT).show();
            } else if (myRandomNumber == 0) {
                //paper
                binding.paperBot.setVisibility(View.VISIBLE);
                binding.rockBot.setVisibility(View.INVISIBLE);
                binding.scissorsBot.setVisibility(View.INVISIBLE);
                binding.status.setText("Paper Covers Rock!");
                Toast.makeText(MainActivity.this, "You lose!", Toast.LENGTH_SHORT).show();
            } else if (myRandomNumber == 1) {
                //rock
                binding.paperBot.setVisibility(View.INVISIBLE);
                binding.rockBot.setVisibility(View.VISIBLE);
                binding.scissorsBot.setVisibility(View.INVISIBLE);
                binding.status.setText("Rock Equals Rock!");

            }
        });

        binding.scissorsIconImage.setOnClickListener(view ->{
            int myRandomNumber = random.nextInt(3);

            binding.paperPlayer.setVisibility(View.INVISIBLE);
            binding.rockPlayer.setVisibility(View.INVISIBLE);
            binding.scissorsPlayer.setVisibility(View.VISIBLE);

            if (myRandomNumber == 0) {
                //paper
                binding.paperBot.setVisibility(View.VISIBLE);
                binding.rockBot.setVisibility(View.INVISIBLE);
                binding.scissorsBot.setVisibility(View.INVISIBLE);
                binding.status.setText("Scissor Cut Paper!");
                Toast.makeText(MainActivity.this, "You win!", Toast.LENGTH_SHORT).show();
            } else if (myRandomNumber == 1) {
                //rock
                binding.paperBot.setVisibility(View.INVISIBLE);
                binding.rockBot.setVisibility(View.VISIBLE);
                binding.scissorsBot.setVisibility(View.INVISIBLE);
                binding.status.setText("Rock Breaks Scissors!");
                Toast.makeText(MainActivity.this, "You lose!", Toast.LENGTH_SHORT).show();
            } else if (myRandomNumber == 2) {
                //scissors
                binding.paperBot.setVisibility(View.INVISIBLE);
                binding.rockBot.setVisibility(View.INVISIBLE);
                binding.scissorsBot.setVisibility(View.VISIBLE);
                binding.status.setText("Scissors Equals Scissors!");
            }
        });



    }
}