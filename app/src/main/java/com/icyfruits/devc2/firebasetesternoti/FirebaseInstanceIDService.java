package com.icyfruits.devc2.firebasetesternoti;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by DEVC2 on 2017-01-12.
 */

public class FirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIDService";

    @Override
    public void onTokenRefresh() {
//        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
    }
}
