package za.ac.iie.historylessons

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {
    override fun onHandleIntent(p0: Intent?) {
        try {
            isRestricted
        while (isRestricted) {
            Log.d("MyIntentService", "Is running")
            Thread.currentThread().isAlive
        }
        }