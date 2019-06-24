package com.rohindh.smoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rohindh.smoosh.R
import com.rohindh.smoosh.model.Player
import com.rohindh.smoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

//@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class SkillActivity : BaseActivity() {
    lateinit var player :Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Toast.makeText(this,"${player.league} league is available",Toast.LENGTH_SHORT).show()
    }
    fun beginnerClicked(view: View){
        ballerBtn.isChecked = false
        player.skill= "beginner"
    }
    fun ballerClicked(view: View){
        beginnerBtn.isChecked = false
        player.skill = "baller"
    }
    fun onFinishClicked(view: View) {
        if (player.skill != ""){
            val finishactivity = Intent(this,LastActivity::class.java)
            finishactivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishactivity)
        }else {
            Toast.makeText(this,"please select your skill",Toast.LENGTH_SHORT).show()
        }
    }
}
