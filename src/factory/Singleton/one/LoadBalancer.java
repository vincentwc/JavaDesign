package factory.Singleton.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式来设计该负载均衡器
 */
public class LoadBalancer {

    private static LoadBalancer instance = null;
    //服务器集合
    private List serverList = null;

    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getLoadBalancer() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
