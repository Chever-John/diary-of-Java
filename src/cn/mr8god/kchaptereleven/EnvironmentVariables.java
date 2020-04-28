package cn.mr8god.kchaptereleven;

import java.util.Map;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 1:49
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry :
                System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }
}
