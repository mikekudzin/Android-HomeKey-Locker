package io.github.homelocker.lib;

import android.view.KeyEvent;

/**
 * Created by KudzinM on 16.11.2015.
 */
public interface InterceptedButtonEventsReceiver {
    void onInterceptedBackPressed();
    void onInterceptedMenuPressed();
}
