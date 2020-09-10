package cn.cq.jvm;

import java.io.FileNotFoundException;

/**
 * CustomClassLoader <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-09 16:51 <br>
 */
public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath(String name) {
        //从自定义路径中加载指定类，获取字节码流
        //如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密操作
        return null;
    }

    public static void main(String[] args) {
        try {
            CustomClassLoader customClassLoader = new CustomClassLoader();
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object o = clazz.newInstance();
            System.out.println(o.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
