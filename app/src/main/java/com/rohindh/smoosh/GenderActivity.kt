package com.rohindh.smoosh

import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GenderActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
    }
     fun leagueNextClicked(view: View){
         val nextleague = Intent(this, SkillActivity::class.java)
         startActivity(nextleague)
     }
}
