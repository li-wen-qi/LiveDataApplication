package cn.kzj.livedataapplication;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import cn.kzj.livedataapplication.databinding.ActivityMainBinding;

/**
 * https://www.jianshu.com/p/e61eb53a9be2
 * 三个步骤:
 * binding.setLifecycleOwner(this);
 * viewModel = ViewModelProviders.of(this).get(UserViewModel.class);
 * binding.setViewModel(viewModel);
 */
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //1
        binding.setLifecycleOwner(this);
        binding.setMainActivity(this);

        //2
        viewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        viewModel.setUser(new User("zhangsan", 1));

        //3
        binding.setViewModel(viewModel);
    }


    public void onButtonClick() {
        viewModel.setUser(new User(String.valueOf(System.currentTimeMillis()), 2));
    }

    public void onQueryClick() {
        Toast.makeText(this, viewModel.getUser().getValue().name, Toast.LENGTH_LONG).show();
    }
}