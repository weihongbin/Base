package whb.cn.com.base.baseMode;

import whb.cn.com.base.baseMode.instance.EnumSingleTon;
import whb.cn.com.base.baseMode.instance.HungryInstance;

/**
 * =============================================
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: whb.cn.com.base.baseMode.Test.java
 * @author: 魏红彬
 * @date: 2017-03-02 10:01
 */
public class Test {


    public static final void  main(String [] args){

        HungryInstance h1=HungryInstance.getInstance();
        HungryInstance h2=HungryInstance.getInstance();
        EnumSingleTon.INSTANCE.doSomeThing();
        System.out.print(h1==h2);
    }

}