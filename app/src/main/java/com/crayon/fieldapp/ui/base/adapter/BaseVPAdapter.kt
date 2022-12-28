package com.crayon.fieldapp.ui.base.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class BaseVPAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val mFragments = ArrayList<Fragment>()
    val mTitle = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return mFragments[position]
    }

    override fun getCount(): Int {
        return mFragments.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        mFragments.add(fragment)
        mTitle.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitle[position]
    }
}
