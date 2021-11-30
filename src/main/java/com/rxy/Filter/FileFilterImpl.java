package com.rxy.Filter;

import java.io.File;
import java.io.FileFilter;

/*
    创建过滤器FileFilter的实现类，重写过滤器accept，定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory())return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
