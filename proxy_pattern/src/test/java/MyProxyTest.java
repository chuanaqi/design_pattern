import com.lai.design.pattern.entity.Person;
import com.lai.design.pattern.myproxy.MyClassLoader;
import com.lai.design.pattern.myproxy.MyInvocationHandler;
import com.lai.design.pattern.myproxy.MyProxy;

import java.lang.reflect.Method;

/**
 * Created by laiweigeng on 2018/8/30.
 */
public class MyProxyTest implements MyInvocationHandler {

    private Person target;


    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }


    public static void main(String[] args){

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(this.target, args);
    }
}
