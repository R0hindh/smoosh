package com.rohindh.smoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohindh.smoosh.R
import com.rohindh.smoosh.model.Player
import com.rohindh.smoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_last.*

class LastActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you ..."
    }

}
