/*
 * Copyright (c) WhatsApp Inc. and its affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package br.dev.singular.stickers;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.android.gms.ads.MobileAds;

public class StickerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        MobileAds.initialize(this);
    }
}
