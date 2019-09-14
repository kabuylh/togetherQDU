package com.example.ServiceCore;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 传输通道
 * 使用BlockingQueue来实现阻塞式传输，由PackageProxy代理
 */
public  class Package{
    public BlockingQueue ResultQueue=new LinkedBlockingDeque<Object>(10);
    private Command command;

    public Package(Command command){
        this.command=command;
    }

    public boolean sendCommand(){
        try{
            
            command.setQueue(this.ResultQueue);
            return  CoreService.commqueue.add(command);
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}