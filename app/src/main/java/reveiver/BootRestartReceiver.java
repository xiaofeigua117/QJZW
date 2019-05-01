package reveiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import ui.activity.MainActivity;


/**
 * 程序自启广播
 */
public class BootRestartReceiver extends BroadcastReceiver {
    private static final String TAG = "BootRestartReceiver";
    private final String ACTION = "android.intent.action.BOOT_COMPLETED";
    ////当手机重新启动的时候执行
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        String action = intent.getAction();
        if (TextUtils.equals(action,ACTION)){

            Intent intent2 = new Intent(context, MainActivity.class);
            //当你在广播里面开启Activit的时候 系统不会自动创建任务栈 因为Activit是由任务栈来维护的
            intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent2);
        }
    }
}