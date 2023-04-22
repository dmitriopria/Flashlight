package com.example.flashlight;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

public class FlashClass {
    private boolean status = false;
    private final Context context;

    public FlashClass(Context context) {
        this.context = context;
    }

    public void flashOn() {
        CameraManager cm = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        try {
            String cameraId = cm.getCameraIdList()[0];
            cm.setTorchMode(cameraId, true);
            status = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    public void flashOff() {
        CameraManager cm = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        try {
            String cameraId = cm.getCameraIdList()[0];
            cm.setTorchMode(cameraId, false);
            status = false;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    public boolean isStatus() {
        return status;
    }
}
