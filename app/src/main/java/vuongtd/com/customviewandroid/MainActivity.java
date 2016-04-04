package vuongtd.com.customviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AppItem> appItems=new ArrayList<>();
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listview);

        appItems.add(new AppItem(R.drawable.fast_clean_splash, "Clean Master", "4.3 stars", "https://play.google.com/store/apps/details?id=com.ln"));
        appItems.add(new AppItem(R.drawable.icon_face, "Facebook", "4.5 stars", "https://play.google.com/store/apps/details?id=com.facebook.katana"));
        appItems.add(new AppItem(R.drawable.icon_zalo, "Zalo", "4.6 stars", "https://play.google.com/store/apps/details?id=com.ln"));
        appItems.add(new AppItem(R.drawable.icon_google, "Google", "5.0 stars", "https://play.google.com/store/apps/details?id="));
        appItems.add(new AppItem(R.drawable.icon_tuhocandroid, "TuHocAndroid", "4.9 stars", "https://play.google.com/store/apps/details?id=com.ln"));
        appItems.add(new AppItem(R.drawable.icon_chat, "Chat App", "4.9 stars", "https://play.google.com/store/apps/details?id=com.ln"));


       AppAdapter adapter=new AppAdapter(this, appItems);
        listView.setAdapter(adapter);
    }


}

