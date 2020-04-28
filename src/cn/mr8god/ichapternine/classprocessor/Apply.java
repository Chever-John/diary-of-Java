package cn.mr8god.ichapternine.classprocessor;


class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input) { return input; }
}
/**
 * @author
 * @date
 * @time
 */
public class Apply {
}
