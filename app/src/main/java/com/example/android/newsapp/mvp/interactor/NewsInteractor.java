package com.example.android.newsapp.mvp.interactor;

import com.example.android.newsapp.listener.RequestCallBack;

import rx.Subscription;

/**
 * Created by uzumaki on 11/13/17.
 */

public interface NewsInteractor<T> {

    Subscription loadNews(RequestCallBack<T> callBack, String source,  String apiKey);
}
