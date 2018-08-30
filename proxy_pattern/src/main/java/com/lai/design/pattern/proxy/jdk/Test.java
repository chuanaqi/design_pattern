package com.lai.design.pattern.proxy.jdk;

import com.lai.design.pattern.entity.Buyer;
import com.lai.design.pattern.entity.Person;
import com.lai.design.pattern.myproxy.HouseProxy;

/**
 * Created by laiweigeng on 2018/8/30.
 */
public class Test {

    public static void main(String[] args) throws Exception{
        Object object = new HouseProxy().getInstance(new Buyer());
        Person person = (Person) object;
        person.information();
    }
}
