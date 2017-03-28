package com.sagarnileshshah.carouselmvp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by sshah on 3/25/17.
 */

public class NetworkHelper {

    private static NetworkHelper networkHelper;

    public static synchronized NetworkHelper getInstance() {
        if (networkHelper == null) {
            networkHelper = new NetworkHelper();
        }
        return networkHelper;
    }

    public boolean isInternetAvailable(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        return isConnected;
    }
}