package com.example.tablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayout.fragments.BooksFragment
import com.example.tablayout.fragments.GamesFragment
import com.example.tablayout.fragments.MoviesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }
    
    override fun createFragment(position: Int): Fragment {
      when(position){
          0 -> return BooksFragment()
          1 -> return MoviesFragment()
         
      }
        return GamesFragment()
    }
}