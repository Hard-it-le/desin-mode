package com.design.mode.creation.builder.actualcombat.resourcePool;

/**
 */
public class ResourcePoolConfig {

    private String name;
    private int maxTotal;

    private int maxIdle;
    private int minIdle;

    public ResourcePoolConfig(ResourcePoolConfigBuilder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

}


