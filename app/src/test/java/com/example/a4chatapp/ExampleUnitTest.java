package com.example.a4chatapp;

import org.junit.Test;

import java.util.Date;

import Persistent.Communication;
import Service.ActivityHistoryServiceImpl;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testActivityHistory() {
        ActivityHistoryServiceImpl ahs = new ActivityHistoryServiceImpl();
        Communication cm = new Communication();
        cm.setRoomId(1234);
        cm.setCreatedDate(new Date());
        cm.setMessage("hello my firend");
        cm.setUserId("jacky");
        cm.setUserName("Jacky");
        ahs.insertLogToActivityHistory(cm);
        Communication cm1 = new Communication();
        cm1.setRoomId(1234);
        cm1.setCreatedDate(new Date());
        cm1.setMessage("no way!");
        cm1.setUserId("isabelle");
        cm1.setUserName("Isabelle");
        ahs.insertLogToActivityHistory(cm1);

        for (Communication e : ahs.retrieveCommunicationListByRoomId(1234)) {
            System.out.println(e.getRoomId() + "- " + e.getCreatedDate() + ": " + e.getUserName());
        }

    }
}