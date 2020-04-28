package cn.mr8god.jchapterten.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 14:07
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) { eventList.add(c);}
    public void run(){
        while (eventList.size() > 0){
            for (Event e :
                    new ArrayList<Event>(eventList)) {
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
