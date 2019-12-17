package com.aqua_ix.objectdetection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, PermissionsFragment())
                .commit()
        }
    }

    fun moveToCamera() {
        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, CameraFragment())
            .commit()
    }

    fun moveToPermission() {
        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, PermissionsFragment())
            .commit()
    }

}
