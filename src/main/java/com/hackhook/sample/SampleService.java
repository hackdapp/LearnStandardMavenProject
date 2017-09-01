package com.hackhook.sample;

/**
 * description:
 *
 * @author nolan
 * @date 01/09/2017
 */
public class SampleService {

    public int sayNum(int x, int y) {
        if (x > 0) {
            return x + y;
        } else {
            return -x + y;
        }
    }
}