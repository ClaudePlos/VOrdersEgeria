/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pl.models.DocItemDTO;
import pl.vo.monitor.MonitorApi;

/**
 *
 * @author k.skowronski
 */

@Stateless
@Path("monitor")
public class MonitorRozrachunkowREST {
    
    @EJB
    MonitorApi monitorApi;
    
    @PersistenceContext(unitName = "pu")
    private EntityManager em;
    
    
    public MonitorRozrachunkowREST() {
        super();
    }
    
    
    @GET
    @Path("{nip}/{rok}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<DocItemDTO>  countREST(@PathParam("nip") String nip, @PathParam("rok") String rok) {       
        List<DocItemDTO> docItems = monitorApi.getDocumentForOwnNumberAndData(nip, rok);       
        return docItems;
    }
    
    
    
    
    
    
}
