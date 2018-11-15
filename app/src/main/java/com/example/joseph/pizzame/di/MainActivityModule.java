package com.example.joseph.pizzame.di;

import com.example.joseph.pizzame.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joseph on 11/15/18.
 */

@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }

}
