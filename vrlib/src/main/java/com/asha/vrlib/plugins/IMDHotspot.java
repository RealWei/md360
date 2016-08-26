package com.asha.vrlib.plugins;

import com.asha.vrlib.model.MDRay;

/**
 * Created by hzqiujiadi on 16/8/5.
 * hzqiujiadi ashqalcn@gmail.com
 */
public interface IMDHotspot {
    boolean hit(MDRay ray);
    void onEyeHitIn(long timestamp);
    void onEyeHitOut();
    void onTouchHit(MDRay ray);
    String getTitle();
    void useTexture(int key);
}
