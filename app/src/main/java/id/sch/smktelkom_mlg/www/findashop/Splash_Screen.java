package id.sch.smktelkom_mlg.www.findashop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {
    Thread threadSplash;
    TextView txtTitle;
    private long ms = 0;
    private long splashTime =3000;
    private boolean splashActive = true;
    private boolean splashPause = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        Thread th = new Thread() {
            public  void run() {
                try
                {
                    while(splashActive && ms < splashTime) {
                        if
                        (!splashPause) {ms = ms +100;
                        }
                        sleep(100);
                    }
                } catch (Exception e) {
                    // TODO : handle Exception
                }
//                finally {
//                    Intent i = new Intent(Splash_Screen.this, MainActivity.class
//                    );
//                    startActivity(i);
//                }
            }
        };
        th.start();
    }
}
