package org.step.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleImpl {

    private ResourceBundle bundle;

    public LocaleImpl(Locale locale) {
        bundle = ResourceBundle.getBundle("locale", locale);
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }
}
