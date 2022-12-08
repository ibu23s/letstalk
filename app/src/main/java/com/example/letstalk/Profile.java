package com.example.letstalk;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.IOException;

public class Profile extends AppCompatActivity {

    private Button btnLogout, btnUpload;
    private ImageView imgProfile;

    private Uri imagePath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnLogout = findViewById(R.id.btnLogOut);
        btnUpload = findViewById(R.id.btnUploadImage);
        imgProfile = findViewById(R.id.profile_img);

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadImage();
            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aqui estoy Minuto 47:42
            }
        });

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoIntent = new Intent(Intent.ACTION_PICK);
                photoIntent.setType("image/*");
                // minuto 51:25 (poner foto de perfil

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data!=null) {
             imagePath = data.getData();

             getImageInImageview();
        }
    }


    private void getImageInImageview() {
        Bitmap bitmap = null;
        try {
            bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        imgProfile.setImageBitmap(bitmap); //mirar lo que es catch
    }

    private void uploadImage(){
        ProgressDialog ProgressDialog = new ProgressDialog(context: this);
        ProgressDialog.setTitle("Uploading...");
        ProgressDialog.show();

        //Minuto 59:46
    }
}