package f.fan.recyclerviewontouchdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by fan.feng on 2019/3/14.
 */
public class BaseAppLication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }

}
