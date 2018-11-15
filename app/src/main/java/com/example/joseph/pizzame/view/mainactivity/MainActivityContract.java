package com.example.joseph.pizzame.view.mainactivity;

import com.example.joseph.pizzame.BasePresenter;
import com.example.joseph.pizzame.BaseView;

/**
 * Created by joseph on 11/15/18.
 */

public interface MainActivityContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View>{
        void searchPizza(String lat, String lng);
    }

}
