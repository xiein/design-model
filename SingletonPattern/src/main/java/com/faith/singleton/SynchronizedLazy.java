package com.faith.singleton;

/**
 * 懒汉式
 */
public class SynchronizedLazy {

    private static SynchronizedLazy instance;

    private SynchronizedLazy() {}

    public static synchronized SynchronizedLazy getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazy();
        }
        return instance;
    }
}
