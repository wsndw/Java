package cn.cq.jvm;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 * ClassLoaderTest1 <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-09 15:56 <br>
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("***********启动类加载器************");
        //获取BootstrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL url:urLs) {
            System.out.println(url.toExternalForm());
        }
        //从上述路径选择一个类，查看类加载器：引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        //null
        System.out.println(classLoader);

        System.out.println("***********扩展类加载器************");
        String property = System.getProperty("java.ext.dirs");
        for (String path:property.split(";")) {
            System.out.println(path);
        }
        //从上述路径选择一个类，查看类加载器：扩展类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        //sun.misc.Launcher$ExtClassLoader@4b67cf4d
        System.out.println(classLoader1);

    }
}
