package com.example.ServiceCore;

import java.util.concurrent.BlockingQueue;

public class Command {
    public String RequestHead;
    public String[] ServiceName;
    public String[] ServiceCommand;
    public BlockingQueue Resultqueue;

    /**
     * Command请求数据结构如下：
     * @param requestHead 请求头 HTTP风格（GET/POST/DELETE/PATCH）目前此参数无用处（2019.9.12）
     * @param serviceName 所需服务名称
     * @param serviceCommand 所需服务
     */
    public Command(String requestHead, String []serviceName, String []serviceCommand) {
        RequestHead = requestHead;
        ServiceName = serviceName;
        ServiceCommand = serviceCommand;
    }

    public void setQueue(BlockingQueue queue){
        this.Resultqueue=queue;
    }

}