package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tictactoe.databinding.ActivityMainBinding;

public class AddPlayers extends AppCompatActivity {

    EditText playerOne1, playerTwo2;
    Button startGameButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        playerOne1 = (EditText) findViewById(R.id.playerOne);
        playerTwo2 = (EditText) findViewById(R.id.playerTwo);
        startGameButton1 = (Button) findViewById(R.id.startGameButton);


        startGameButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getPlayerOneName = playerOne1.getText().toString();
                String getPlayerTwoName = playerTwo2.getText().toString();

                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                    Toast.makeText(AddPlayers.this, "Please enter a name for both players", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(AddPlayers.this, MainActivity.class);
                    intent.putExtra("playerOne", getPlayerOneName);
                    intent.putExtra("playerTwo", getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });

    }
}