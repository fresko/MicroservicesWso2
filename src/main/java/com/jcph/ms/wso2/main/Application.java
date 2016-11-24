
package com.jcph.ms.wso2.main;

import com.jcph.ms.wso2.endpoint.PatternsSOA;
import org.wso2.msf4j.MicroservicesRunner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRESKO2
 * This is the one-liner to deploy your service using WSO2 MSF4J.
 */
public class Application {
      
    public static void main(String[] args) {
        new MicroservicesRunner()
                .deploy(new PatternsSOA())
                .start();
    }
    
}
