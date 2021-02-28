/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.lang.System;
/**
 *
 * @author sneha
 */
public class MapTest {
    public static void main(String args[])
    {
        HashMap mapObj = new HashMap();
        mapObj.put(1, "one");
        mapObj.put(2, "two");
        System.out.println(mapObj);
        
    }
}
