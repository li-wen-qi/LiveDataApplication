package cn.kzj.livedataapplication;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * 作者：liwenqi on 2019/4/10 19:44
 * 邮箱：liwenqi@zelkova.cn
 * 描述：
 */
public class UserViewModel extends ViewModel {
    MutableLiveData<User> liveData;

    public MutableLiveData<User> getUser() {
        if (liveData == null) {
            liveData = new MutableLiveData<>();
        }
        return liveData;
    }

    public void setUser(User user) {
        if (liveData == null) {
            liveData = new MutableLiveData<>();
        }
        liveData.setValue(user);
    }

}