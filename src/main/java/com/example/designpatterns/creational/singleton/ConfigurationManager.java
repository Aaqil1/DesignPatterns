package com.example.designpatterns.creational.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Problem: multiple threads need shared feature flag/config values.
 * Creating and wiring a new configuration object per call would risk drift.
 *
 * Singleton ensures exactly one shared source of truth while keeping
 * initialization lazy and thread-safe.
 */
public final class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private final Map<String, String> settings = new ConcurrentHashMap<>();

    private ConfigurationManager() {
        // Seed realistic defaults
        settings.put("feature.search", "enabled");
        settings.put("ui.theme", "light");
    }

    /**
     * Double-checked locking keeps lazy initialization thread-safe
     * without locking on every access.
     */
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void updateSetting(String key, String value) {
        settings.put(key, value);
    }
}

