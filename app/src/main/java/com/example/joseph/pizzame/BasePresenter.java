package com.example.joseph.pizzame;

/**
 * Created by joseph on 11/15/18.
 */

public interface BasePresenter<V extends BaseView> {

    void addView(V View);
    void removeView();


}
