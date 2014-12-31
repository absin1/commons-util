package io.deepreader.java.commons.util;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

public class DisplayerTest extends TestCase {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    
    public void testDisplay() throws Exception {
        class P0 {
            private Integer cnt;

            public Integer getCnt() {
                return cnt;
            }

            public void setCnt(Integer cnt) {
                this.cnt = cnt;
            }
        }
        P0 p = new P0();
        p.setCnt(7);
        System.out.println(Displayer.display(p, p.getCnt()));
        
    }
}