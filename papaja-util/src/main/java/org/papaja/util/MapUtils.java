package org.papaja.util;

import org.apache.commons.beanutils.PropertyUtils;

import java.util.*;

import static java.lang.String.format;
import static java.util.Objects.nonNull;

public class MapUtils {

    public static List<String> mapPaths(Map<String, ?> map) {
        List<String> paths = new ArrayList<>();

        mapPaths(map, paths, null);

        return paths;
    }

    public static void mapPaths(Map<String, ?> map, List<String> paths, String prefix) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key   = entry.getKey();
            Object value = entry.getValue();
            String path  = nonNull(prefix) ? format("%s.%s", prefix, key) : key;

            if (nonNull(value) && Map.class.isAssignableFrom(value.getClass())) {
                mapPaths((Map<String, ?>) value, paths, path);
                continue;
            }

            paths.add(path);
        }
    }

    public Object getValue(Map<String, Object> map, String key) {
        try {
            return PropertyUtils.getProperty(map, key);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

}
