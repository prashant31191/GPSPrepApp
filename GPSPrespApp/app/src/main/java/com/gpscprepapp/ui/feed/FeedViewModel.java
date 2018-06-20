package com.gpscprepapp.ui.feed;

import com.gpscprepapp.data.DataManager;
import com.gpscprepapp.ui.base.BaseViewModel;
import com.gpscprepapp.utils.rx.SchedulerProvider;

/**
 * Created by Jyoti on 29/07/17.
 */

public class FeedViewModel extends BaseViewModel {

    public FeedViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
