package com.rohindh.smoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rohindh.smoosh.utilities.EXTRA_DATA
import com.rohindh.smoosh.R
import com.rohindh.smoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

open class SkillActivity : BaseActivity() {
    var league:String? = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_DATA)
        Toast.makeText(this,"$league league is available",Toast.LENGTH_SHORT).show()
    }
    fun beginnerClicked(view: View){
        ballerBtn.isChecked = false
        skill = "beginner"
    }
    fun ballerClicked(view: View){
        beginnerBtn.isChecked = false
        skill = "baller"
    }
    fun onFinishClicked(view: View) {
        if (skill != ""){
            val finishactivity = Intent(this,LastActivity::class.java)
            finishactivity.putExtra(EXTRA_DATA,league)
            finishactivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishactivity)
        }else {
            Toast.makeText(this,"please select your skill",Toast.LENGTH_SHORT).show()
        }
    }
}
