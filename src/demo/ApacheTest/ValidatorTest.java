package demo.ApacheTest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.*;

/**
 * Created by wangjiang on 2019/9/24.
 */
public class ValidatorTest {
    public static void main(String[] args) {
        boolean caseSensitive = false;
        String regex1   = "^([A-Z]*)(?:\\-)([A-Z]*)*$";
        String regex2   = "^([A-Z]*)$";
        String[] regexs = new String[] {regex1, regex1};

        System.out.println(StringUtils.isEmpty(regex1));
        // 创建验证
//        RegexValidator validator = new RegexValidator(regexs, caseSensitive);
//
//        // 验证返回boolean
//        boolean valid = validator.isValid("abc-def");
//
//        // 验证返回字符串
//        String result = validator.validate("abc-def");
//
//        // 验证返回数组
//        String[] groups = validator.match("abc-def");
    }
}
