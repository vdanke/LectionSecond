package org.step.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleImpl {

    private ResourceBundle bundle;

    public LocaleImpl() {
        // 1 argument - название
        // 2 argument - локаль
        bundle = ResourceBundle.getBundle("locale", new Locale("en", "US"));
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }

    public void setLocale(Locale locale) {
        bundle = ResourceBundle.getBundle("locale", locale);
    }
}
