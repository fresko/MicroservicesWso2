/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jcph.ms.wso2.endpoint;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcph.ms.wso2.model.Pattern;
import com.jcph.ms.wso2.model.Patterns;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * REST Web Service
 *
 * @author FRESKO2
 */
@Path("/patronessoa")
public class PatternsSOA {

     /**
     * Creates a new instance of PatternsSOA
     */
    public PatternsSOA() {
    }

    /**
     * Consulta los patrones de diseños asociados a un principio SOA
     * @param pattern
     * @return 
     */
    @POST
    @Path("/obtenerPatternSOA")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response getToken (Pattern pattern) /*throws Exception*/{ 
       
        List<Pattern> lstPatterns = new ArrayList<Pattern>();
        Patterns patterns = new Patterns();
        ObjectMapper mapper = new ObjectMapper();;
        
        ///BD
        Pattern pattern1 = new Pattern();        
        pattern1.setName("Microservicios");
        pattern1.setPrinciple("Autonomia");
        pattern1.setProblem("Acoplamiento");
        pattern1.setSolution("Despliegue Independiente");
        
        Pattern pattern2 = new Pattern();        
        pattern2.setName("Message Screening ");
        pattern2.setPrinciple("contrato");
        pattern2.setProblem("validacion contrato ");
        pattern2.setSolution("Seguridad suplantacion de contrato al ingresar datos");
        
        lstPatterns.add(0, pattern1);
        lstPatterns.add(1, pattern2);
        patterns.setLstPatterns(lstPatterns);
        String  respuestaJSON = null;
        try {
            respuestaJSON = mapper.writeValueAsString(patterns);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(PatternsSOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Response.status(Response.Status.OK).entity(respuestaJSON).build();
    }/*catch (Exception e){
        e.printStackTrace();
        ErrorPatterns errorEx = new ErrorPatterns();
        errorEx.setCode("001");
        errorEx.setDescription("Error en API , verificque los datos de entrada");
        
        // return Response.status(Response.Status.BAD_REQUEST).entity(errorEx).build();
    }*/
  
    /**
     * Retrieves representation of an instance of com.jcph.ms.ws02.endpoint.PatternsSOA
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of PatternsSOA
     * @param content representation for the resource
     *
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
