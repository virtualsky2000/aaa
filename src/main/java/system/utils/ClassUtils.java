package system.utils;

import java.net.URL;

public class ClassUtils {

    private static ClassLoader loader;

    public static boolean isExtend(Class<?> A, Class<?> B) {
        do {
            if (B.equals(A)) {
                return true;
            }
            B = B.getSuperclass();
        } while (!B.equals(Object.class));

        return false;
    }

    public static URL getResource(String name) {
        return loader.getResource(name);
    }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj) {
        return (T) obj;
    }

    static {
        loader = ClassUtils.class.getClassLoader();
    }

}
