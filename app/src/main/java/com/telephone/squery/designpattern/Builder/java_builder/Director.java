package com.telephone.squery.designpattern.Builder.java_builder;

/**
 * Created by Administrator[Squery] on 2015/12/1.
 */
public class Director {
    Builder mBuilder = null;

    /**
     *
     * @param builder
     */
    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建对象  这里可以可以交换顺序 组件不同的对象
     *
     * @param cpu
     * @param ram
     * @param os
     */
    public void construct(int cpu, int ram, String os) {
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }
}
