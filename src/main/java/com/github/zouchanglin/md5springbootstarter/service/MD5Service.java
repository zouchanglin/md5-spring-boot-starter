package com.github.zouchanglin.md5springbootstarter.service;


import com.github.zouchanglin.md5springbootstarter.util.MD5Util;

public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}
