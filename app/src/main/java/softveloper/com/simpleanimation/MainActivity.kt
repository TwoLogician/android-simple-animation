package softveloper.com.simpleanimation

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.transition.TransitionManager
import android.view.*
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewGroup: ViewGroup

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewGroup = findViewById(R.id.layout) as ViewGroup
        viewGroup.setOnTouchListener(fun(_: View, _: MotionEvent): Boolean {
            TransitionManager.beginDelayedTransition(viewGroup)
            val button = findViewById(R.id.button)
            val params = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE)
            button.layoutParams = params
            return true
        })
    }
}
