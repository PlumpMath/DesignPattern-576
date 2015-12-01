package com.telephone.squery.designpattern.Builder.java_builder;

/**
 * Created by Administrator[Squery] on 2015/12/1.
 */
public class AppleComputer extends Computer {

    protected AppleComputer() {

    }

    @Override
    public void setCPU(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOs(String os) {
        mOs = os;
    }
}
