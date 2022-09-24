package com.design.mode.creation.builder.actualcombat.constructorArg;

/**
 * @author yujiale
 */
public class ConstructorArgBuilder<T> {

    public Boolean isRef;
    public Class<T> type;
    public Object arg;

    public ConstructorArg build() {
        if (this.isRef) {
            if (this.arg instanceof String) {
                type = (Class<T>) String.class;
            } else {
                throw new IllegalArgumentException("1");
            }
        } else {
            if (arg == null || type == null) {
                throw new IllegalArgumentException("2");
            }
        }

        return new ConstructorArg(this);
    }


    public ConstructorArgBuilder setIsRef(Boolean isRef) {
        this.isRef = isRef;
        return this;
    }

    public ConstructorArgBuilder setType(Class type) {
        this.type = type;
        return this;
    }

    public ConstructorArgBuilder setArg(Object arg) {
        this.arg = arg;

        return this;
    }
}
