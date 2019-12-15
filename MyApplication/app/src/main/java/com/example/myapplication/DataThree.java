package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DataThree {

    List<String> list;

    public DataThree() {
        list = new ArrayList<>();
        list.add("Огурец");
        list.add("Помидор");
        list.add("Маслина");
        list.add("Яблоко");
        list.add("Киви");
        list.add("Черника");
        list.add("Голубика");
        list.add("Ананас");
        list.add("Малина");
        list.add("Земляника");
        list.add("Манго");
        list.add("Арбуз");
    }

    public List<String> getList() {

        return list;
    }
}
