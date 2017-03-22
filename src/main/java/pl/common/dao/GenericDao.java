/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.common.dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.vo.common.AuditEntityBase;

/**
 *
 * @author k.skowronski
 */
public abstract class GenericDao<T extends AuditEntityBase, K extends Serializable>  {
    
    @PersistenceContext(name = "pu")
    protected EntityManager em;
    
    public Class<T> classType;
    
    
    public GenericDao(Class<T> classType) {
        this.classType = classType;
    }
    
    
}
