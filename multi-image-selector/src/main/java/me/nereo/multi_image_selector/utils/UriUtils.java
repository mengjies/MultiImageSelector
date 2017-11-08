package me.nereo.multi_image_selector.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;

import java.io.File;

/**
 * Created by MengJie on 2017/11/8.
 */

public class UriUtils {

    public static Uri parUri(Context ctx, File cameraFile) {
        String authority = ctx.getPackageName() + ".provider";
        Uri imageUri;
        if(Build.VERSION.SDK_INT >= 23) {
            imageUri = FileProvider.getUriForFile(ctx, authority, cameraFile);
        } else {
            imageUri = Uri.fromFile(cameraFile);
        }

        return imageUri;
    }

}
