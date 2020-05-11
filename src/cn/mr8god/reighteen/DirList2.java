package cn.mr8god.reighteen;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author
 * @date
 * @time
 */
public class DirList2 {
    public static FilenameFilter filter(final String regex){
        //首先创建一个filter()方法，它会返回一个指向FilenameFilter的引用
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem :
             list ) {
            System.out.println(dirItem);
        }
    }
}
