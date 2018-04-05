package cheyinshu.exam.common.utils;

import java.util.UUID;

/**
 * @author cheYINshu
 */
public class UUIDUtils {
    public static final String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
