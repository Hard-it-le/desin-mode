package com.design.mode.creation.builder.actualcombat.constructorArg;

/**
 * @author yujiale
 */
public class ConstructorArg<T> {


    private boolean isRef;
    private Class<T> type;

    private Object arg;

    public ConstructorArg(ConstructorArgBuilder builder){
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }


    public Boolean getIsRef(){
        return isRef;
    }

    public Class<T> getType(){
        return type;
    }

    public Object getArg() {
        return arg;
    }


}
