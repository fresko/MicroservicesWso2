/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jcph.ms.wso2.model;

import java.util.List;

/**
 *
 * @author FRESKO2
 */
public class Patterns {
    
    private List<Pattern> lstPatterns;

    public Patterns(List<Pattern> lstPatterns) {
        this.lstPatterns = lstPatterns;
    }

    public Patterns() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

    public List<Pattern> getLstPatterns() {
        return lstPatterns;
    }

    public void setLstPatterns(List<Pattern> lstPatterns) {
        this.lstPatterns = lstPatterns;
    }
    
    
}
