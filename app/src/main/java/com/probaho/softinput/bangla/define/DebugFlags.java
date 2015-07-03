package com.probaho.softinput.bangla.define;

import android.content.SharedPreferences;
//te
public final class DebugFlags {
    public static final boolean DEBUG_ENABLED = false;

    private DebugFlags() {
        // This class is not publicly instantiable.
    }

    @SuppressWarnings("unused")
    public static void init(final SharedPreferences prefs) {
    }
}