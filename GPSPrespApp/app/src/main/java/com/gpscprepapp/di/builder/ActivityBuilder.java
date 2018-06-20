/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.gpscprepapp.di.builder;

import com.gpscprepapp.ui.about.AboutFragmentProvider;
import com.gpscprepapp.ui.feed.FeedActivity;
import com.gpscprepapp.ui.feed.FeedActivityModule;
import com.gpscprepapp.ui.feed.blogs.BlogFragmentProvider;
import com.gpscprepapp.ui.feed.opensource.OpenSourceFragmentProvider;
import com.gpscprepapp.ui.login.LoginActivity;
import com.gpscprepapp.ui.login.LoginActivityModule;
import com.gpscprepapp.ui.main.MainActivity;
import com.gpscprepapp.ui.main.MainActivityModule;
import com.gpscprepapp.ui.main.rating.RateUsDialogProvider;
import com.gpscprepapp.ui.splash.SplashActivity;
import com.gpscprepapp.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            FeedActivityModule.class,
            BlogFragmentProvider.class,
            OpenSourceFragmentProvider.class})
    abstract FeedActivity bindFeedActivity();

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = {
            MainActivityModule.class,
            AboutFragmentProvider.class,
            RateUsDialogProvider.class})
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();
}
