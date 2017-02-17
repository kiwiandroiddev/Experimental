package com.orchestral.labrat.anotherlibrary

import com.orchestral.labrat.anotherlibrary.steroids.SteroidsActivity


class SecondaryActivity : SteroidsActivity() {

    override fun getActivityLayout(): Int {
        return R.layout.activity_second
    }

}