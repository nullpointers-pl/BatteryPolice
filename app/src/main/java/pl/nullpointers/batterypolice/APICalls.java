package pl.nullpointers.batterypolice;

import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

public class APICalls {
    public Intent intent;
    public Context context;

    // MainActivity.getIntent()
    public APICalls(Intent intent, Context context) {
        this.intent = intent;
        this.context = context;
    }

    public float getBatteryTemperature() {
        int temp = this.intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0);
        return ((float) temp) / 10F;
    }

    public int getBatteryPercentage() {
        BatteryManager bm = (BatteryManager) context.getSystemService(Context.BATTERY_SERVICE);
        return bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
    }
}
