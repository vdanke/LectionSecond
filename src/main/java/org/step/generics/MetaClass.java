package org.step.generics;

public class MetaClass<T extends Number> {

    private T meta;

    public MetaClass(T meta) {
        this.meta = meta;
    }

    public boolean same(MetaClass<? extends Number> metaClass) {
        return getMeta() == metaClass.getMeta();
    }

    public boolean sameType(MetaClass<T> metaClass) {
        return getMeta() == metaClass.getMeta();
    }

    public T getMeta() {
        return meta;
    }
}
