package com.study.srb.oss.service;

import java.io.InputStream;

/**
 * create by xiaocai on 2021/11/21 22:22
 **/
public interface FileService {
    /**
     * 文件上传至阿里云
     */
    String upload(InputStream inputStream, String module, String fileName);

    /**
     * 根据路径删除文件
     * @param url
     */
    void removeFile(String url);
}
