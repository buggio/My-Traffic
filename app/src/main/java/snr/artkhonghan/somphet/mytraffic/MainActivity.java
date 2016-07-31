package snr.artkhonghan.somphet.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String urlYoutubeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAboutMe(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.effect_btn_shut);

        mediaPlayer.start();

        //Intent to WebView
        urlYoutubeString = "https://youtu.be/1cFn_7W53d4";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlYoutubeString));

        startActivity(intent);

    }

}   //Main Class
