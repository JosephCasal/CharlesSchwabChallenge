package com.example.joseph.pizzame.di;

import com.example.joseph.pizzame.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by joseph on 11/15/18.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
