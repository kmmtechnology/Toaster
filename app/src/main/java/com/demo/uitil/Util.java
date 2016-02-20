package com.demo.uitil;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import java.util.List;

/**
 * Created by DELL on 30-Jan-16.
 */
public class Util {

    public static boolean isIntentSpported(Context context, Intent intent) {

        PackageManager packagemanager = context.getPackageManager();
        List<ResolveInfo> Activities = packagemanager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return Activities.size() > 0;

    }
}
