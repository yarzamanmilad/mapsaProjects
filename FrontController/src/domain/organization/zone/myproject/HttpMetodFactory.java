package domain.organization.zone.myproject;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class HttpMetodFactory {
    private static Map<String, HttpMetodApi> actionMap=new HashMap<>();
    static {
        actionMap.put("GET/",new UserGetMetodApi());
        actionMap.put("POST/home",new UserPostMetodeApi());
        actionMap.put("GET/home",new UserPostMetodeApi());
        actionMap.put("GET/notFound",new NotFoundHttpMetodApi());
    }
    public synchronized HttpMetodApi getHttpMetodApi(HttpServletRequest request){
        String path=request.getServletPath()+request.getPathInfo();
        String key=request.getMethod()+path;
        System.out.println("path: "+path);
        System.out.println("key: "+key);
        HttpMetodApi httpMetodApi=actionMap.get(key);
        System.out.println(httpMetodApi);
        if(httpMetodApi==null){
            httpMetodApi=actionMap.get("GET/notFound");
        }else{}
        System.out.println(httpMetodApi);
        return httpMetodApi;
    }
}
