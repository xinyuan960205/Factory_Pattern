package com.designPattern3.AdapterPattern;

/**
 * @ClassName: SourceSub1
 * @Description: 接口的适配器模式:Adapter抽象类的继承
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:41
 */
public class SourceSub1 extends Adapter{
    @Override
    public void method1() {
        System.out.println("this is sourcesub1");
    }
}
