package jmsgears.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mManager;

    String[] titles = {
            "Pinnacle of creativity with grappling hook in Just Cause 3",
            "Why is it that paper cups get mushy and starts to fall apart within an hour when holding cold fluids, but are perfectly okay with holding hot fluids like coffee indefinetly?",
            "[NSFW] What's one thing you wish you'd never seen?",
            "China has blocked Wikipedia again",
            "High intensity interval training improves liver and adipose tissue insulin sensitivity",
            "Shot a guy so hard, he turned into a clock.",
            "Why are artists boycotting Spotify but not Pandora?",
            "If 800,000 people drown each year and 800,000 have already drowned this year, can I breath underwater?",
            "I work with identical 4 year old twins - one has severe autism, the other is normally developing. How does this fit into the whole nature/ nurture debate?",
            "ChronoAtlas - an interactive atlas of world history that uses a Google Earth globe",
            "Microsoft Edge’s JavaScript engine to go open-source",
    };

    String[] userNames = {
            "jmsGears1",
            "sniprez",
            "dustofoblivion",
            "goatse",
            "goddamnitkevin",
            "PM_ME_YOUR_NIPS",
            "hithisiseli",
            "nick",
            "ihatemyself",
            "whatisthisicanteven",
            "thisise11vn"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //set LayoutManager
        mManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mManager);

        int[] karma = new int[titles.length];
        for (int i = 0; i < karma.length; i++) {
            karma[i] = (-1000 + (int)(Math.random() * ((2000) + 1)));
        }

        mAdapter = new MyAdapter(titles, userNames, karma);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
