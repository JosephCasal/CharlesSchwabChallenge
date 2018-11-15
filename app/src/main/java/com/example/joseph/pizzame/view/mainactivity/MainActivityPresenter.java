package com.example.joseph.pizzame.view.mainactivity;

import com.example.joseph.pizzame.data.RetrofitHelper;
import com.example.joseph.pizzame.model.Result;
import com.example.joseph.pizzame.model.SearchResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by joseph on 11/15/18.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    @Override
    public void addView(MainActivityContract.View View) {
        this.view = View;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void searchPizza(final String lat, final String lng) {

        Map<String, String> querymap = new HashMap<>();
        querymap.put("q", "select%20*%20from%20local.search(100)%20where%20latitude%3D\'" +
                lat + "\'%20and%20longitude%3D\'" + lng +
                "\'%20and%20radius%3D50%20and%20query%3D\'pizza\'%20limit%2050%20offset%2045%20%7C%20sort(field%3D%22Distance%22%2C%20descending%3D%22false%22)')");
        querymap.put("format", "json");
        querymap.put("diagnostics", "true");
        querymap.put("callback", ">");
        RetrofitHelper.callYQL(querymap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<SearchResult, List<Result>>() {
                    @Override
                    public List<Result> apply(SearchResult searchResult) throws Exception {
                        List<Result> aList = new ArrayList<>();
                        aList.addAll(searchResult.getQuery().getResults().getResult());
                        return aList;
                    }
                })
                .subscribe(new Observer<List<Result>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Result> results) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

}
