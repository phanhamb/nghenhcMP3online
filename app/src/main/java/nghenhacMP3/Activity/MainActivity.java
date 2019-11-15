package nghenhacMP3.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.Activity.R;
import com.google.android.material.tabs.TabLayout;

import nghenhacMP3.Adapter.MainViewPageAdapter;
import nghenhacMP3.Fragment.Fragment_Home;
import nghenhacMP3.Fragment.Fragment_Timkiem;

public class MainActivity extends AppCompatActivity {
    TabLayout tablayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
    }
    private void init(){
        MainViewPageAdapter mainViewPageAdapter = new MainViewPageAdapter(getSupportFragmentManager());
        mainViewPageAdapter.addFragment(new Fragment_Home(),"Home");
        mainViewPageAdapter.addFragment(new Fragment_Timkiem(),"Tim kiem");
        viewPager.setAdapter(mainViewPageAdapter);
        tablayout.setupWithViewPager(viewPager);
    }

    private void anhxa(){
        tablayout = (TabLayout) findViewById(R.id.mytablayout);
        viewPager = (ViewPager) findViewById(R.id.myviewpage);

    }
}
