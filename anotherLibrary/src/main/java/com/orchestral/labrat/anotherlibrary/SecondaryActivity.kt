package com.orchestral.labrat.anotherlibrary

import android.content.Intent
import android.os.Bundle
import com.orchestral.labrat.anotherlibrary.steroids.SteroidsActivity


class SecondaryActivity : SteroidsActivity() {

    override fun getActivityLayout(): Int {
        return R.layout.activity_second1
    }


}