package cn.mr8god.ichapternine.interfaceprocessor;

/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 23:29
 */
public interface Processor {
    String name();
    Object process(Object input);
}

