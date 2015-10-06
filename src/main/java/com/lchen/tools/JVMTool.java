package com.lchen.tools;

import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.Set;
import javax.management.MBeanServer;
import javax.management.ObjectInstance;

/**
 * Created by lchen on 06/10/15.
 */
public class JVMTool {

    JVMTool(){

    }

    public void listAllJVMMBeans() {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        Set<ObjectInstance> instances = server.queryMBeans(null, null);
        Iterator<ObjectInstance> iterator = instances.iterator();
        while (iterator.hasNext()) {
            ObjectInstance instance = iterator.next();
            System.out.println("MBean Found:");
            System.out.println("Class Name:t" + instance.getClassName());
            System.out.println("Object Name:t" + instance.getObjectName());
            System.out.println("****************************************");
        }
    }
}
