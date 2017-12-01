package dungtv.ui.materialtabbar

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class ScrollableTabsActivity : AppCompatActivity() {

    private var toolbar: Toolbar? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrollable_tabs)

        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        setupViewPager(viewPager)

        tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout!!.setupWithViewPager(viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager?) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFrag(DemoFragment(), "ONE")
        adapter.addFrag(DemoFragment(), "TWO")
        adapter.addFrag(DemoFragment(), "THREE")
        adapter.addFrag(DemoFragment(), "FOUR")
        adapter.addFrag(DemoFragment(), "FIVE")
        adapter.addFrag(DemoFragment(), "SIX")
        adapter.addFrag(DemoFragment(), "SEVEN")
        adapter.addFrag(DemoFragment(), "EIGHT")
        adapter.addFrag(DemoFragment(), "NINE")
        adapter.addFrag(DemoFragment(), "TEN")
        viewPager!!.adapter = adapter
    }

}
