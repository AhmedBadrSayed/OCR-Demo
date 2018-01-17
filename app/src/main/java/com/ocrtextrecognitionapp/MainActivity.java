package com.ocrtextrecognitionapp;

import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;
import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import gun0912.tedbottompicker.TedBottomPicker;

/**
 * Created by suhasbachewar on 10/5/16.
 */

public class MainActivity extends AppCompatActivity implements IOCRCallBack {

    private String mAPiKey = "76857ad6b688957"; //TODO Add your own Registered API key
    private boolean isOverlayRequired;
    private String mImageUrl;
    private String mLanguage;
    private TextView mTxtResult;
    private IOCRCallBack mIOCRCallBack;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        mIOCRCallBack = this;
        mImageUrl = "http://www.cairoscene.com/ArticleImages/b3baf7c1-acb0-41e8-9de8-415276d11163.jpg"; // Image url to apply OCR API
        mLanguage = "eng"; //Language
        isOverlayRequired = true;
        init();

    }

    private void init() {
        mTxtResult = (TextView) findViewById(R.id.actual_result);
        TextView btnCallAPI = (TextView) findViewById(R.id.btn_call_api);

        if (btnCallAPI != null) {
            btnCallAPI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    OCRAsyncTask oCRAsyncTask = new OCRAsyncTask(MainActivity.this, mAPiKey, isOverlayRequired, mImageUrl, mLanguage,mIOCRCallBack);
//                    oCRAsyncTask.execute();
//                    Picasso.with(MainActivity.this).load(mImageUrl).into(imageView);
                    showImagePicker();
                }
            });
        }
    }

    void showImagePicker() {

        PermissionListener permissionlistener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {

                TedBottomPicker bottomSheetDialogFragment = new TedBottomPicker.Builder(MainActivity.this)
                        .setOnImageSelectedListener(new TedBottomPicker.OnImageSelectedListener() {
                            @Override
                            public void onImageSelected(Uri uri) {
                                Log.e("ted","uri: "+uri);
                                Log.e("ted","uri.getPath(): "+uri.getPath());

                                Bitmap bitmap=null;
                                try {
                                    bitmap = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), uri);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
//                                if(bitmap!=null)
//                                    imageView.setImageBitmap(bitmap);

//                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//                                byte[] byteArray = byteArrayOutputStream .toByteArray();
//                                String encoded = Base64.encodeToString(byteArray, Base64.DEFAULT);


//                                String filePath = DocumentHelper.getPath(HomeActivity.this, uri);
//                                //Safety check to prevent null pointer exception
//                                if (filePath == null || filePath.isEmpty()) {
//                                    Toast.makeText(HomeActivity.this, getString(R.string.error), Toast.LENGTH_SHORT).show();
//                                    return;
//                                }

//                                Log.d("ted","path: "+filePath);
//
                                String profilePicturePath = uri.toString();
                                OCRAsyncTask oCRAsyncTask = new OCRAsyncTask(MainActivity.this, mAPiKey, isOverlayRequired, uri.getPath(), mLanguage,mIOCRCallBack);
                                oCRAsyncTask.execute();
                                Picasso.with(MainActivity.this).load(uri).into(imageView);

//                                Toast.makeText(HomeActivity.this, profilePicturePath, Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setPeekHeight(getResources().getDisplayMetrics().heightPixels/2)
                        .create();

                bottomSheetDialogFragment.show(getSupportFragmentManager());
            }

            @Override
            public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                Toast.makeText(MainActivity.this, "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
            }
        };

        new TedPermission(MainActivity.this)
                .setPermissionListener(permissionlistener)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .check();
    }

    @Override
    public void getOCRCallBackResult(String response) {
        Gson gson = new Gson();
        Response response1 = gson.fromJson(response,Response.class);
        try {
            mTxtResult.setText(response1.getParsedResults().get(0).getParsedText());
            Toast.makeText(this, response1.getParsedResults().get(0).getParsedText(), Toast.LENGTH_SHORT).show();
        }catch (NullPointerException e){
            mTxtResult.setText("null");
        }
    }
}
