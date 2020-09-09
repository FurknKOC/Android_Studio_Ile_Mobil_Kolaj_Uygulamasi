package com.example.mobilproje;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class KolajBir extends Activity {

	private static final int IMAGE_PICK = 1;
	private ImageView imageView;
	private Button buttonImage;
	
class ImagePickListener implements OnClickListener {
@Override
public void onClick(View v) {
Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
intent.setType("image/*");
startActivityForResult(Intent.createChooser(intent, "Bir Fotoðraf Seçin"), IMAGE_PICK);
}
}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kolajbir);
		
		ImageButton imgbtn7 = (ImageButton)findViewById(R.id.imageButton4);
		this.imageView = (ImageView) this.findViewById(R.id.imageView);
		imgbtn7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		this.buttonImage.setOnClickListener(new ImagePickListener());

		protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			 
			if (resultCode == Activity.RESULT_OK) {
			switch (requestCode) {
			case IMAGE_PICK:
			this.imageFromGallery(resultCode, data);
			break;
			default:
			break;
			}
			}
			}

		
	}
private void imageFromGallery(int resultCode, Intent data) {
Uri selectedImage = data.getData();
String [] filePathColumn = {MediaStore.Images.Media.DATA};
 
Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
cursor.moveToFirst();
 
int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
String filePath = cursor.getString(columnIndex);
this.imageView.setImageBitmap(BitmapFactory.decodeFile(filePath));
cursor.close();
 
}
	
}
