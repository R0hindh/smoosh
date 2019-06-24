package com.rohindh.smoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohindh.smoosh.R
import com.rohindh.smoosh.utilities.EXTRA_DATA
import com.rohindh.smoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_last.*

class LastActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        val league = intent.getStringExtra(EXTRA_DATA)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeagueText.text = "Looking for $league $skill league near you ..."
    }

}
