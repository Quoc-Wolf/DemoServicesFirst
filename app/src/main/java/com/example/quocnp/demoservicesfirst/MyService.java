package com.example.quocnp.demoservicesfirst;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    //chi ra lam the nao de xu ly mot services bi chet
    int mStartMode;
    //interface cho client ma bi rang buoc
    IBinder mBinder;
    //check onRebind  nen su dung
    boolean mAllowRebind;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    /**
     * Called when all clients have unbound with unbindService()
     */
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }
    //========================chi can su dung 3 ham nay=====================================

    /**
     * khoi tao ban dau
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * xu ly chet app hay ko chet app
     *
     * @param intent
     * @param flags
     * @param startId
     * @return flag -- co nhieu loai co ---
     * chu yeu su dung 2 loai flag
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    /**
     * giai phong register broadcast or octo
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
