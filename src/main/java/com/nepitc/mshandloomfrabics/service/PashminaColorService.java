/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepitc.mshandloomfrabics.service;

import com.nepitc.mshandloomfrabics.daoimp.PashminaColorDAOImp;
import com.nepitc.mshandloomfrabics.entity.PashminaColourModel;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nishan Dhungana
 */
@Service(value = "pashminaColorService")
public class PashminaColorService implements GenericService<PashminaColourModel>{

    @Autowired
    private PashminaColorDAOImp pashminaColorDaoImp;
    
    @Override
    public void insert(PashminaColourModel t) throws HibernateException {
        try {
            pashminaColorDaoImp.insert(t);
        } catch (HibernateException e) {
            throw new HibernateException(e.getMessage());
        }
    }

    @Override
    public void update(PashminaColourModel t) throws HibernateException {
        try {
            pashminaColorDaoImp.update(t);
        } catch (HibernateException e) {
            throw new HibernateException(e.getMessage());
        }
    }

    @Override
    public boolean delete(PashminaColourModel t) throws HibernateException {
        try {
            if(pashminaColorDaoImp.delete(t)) {
                return true;
            }
        } catch (HibernateException e) {
            throw new HibernateException(e.getMessage());
        }
        
        return false;
    }

    @Override
    public PashminaColourModel getById(int id) throws HibernateException {
        try {
            return pashminaColorDaoImp.getById(id);
        } catch (HibernateException e) {
            throw new HibernateException(e.getMessage());
        }
    }

    @Override
    public List<PashminaColourModel> getAll() throws HibernateException {
        try {
            return pashminaColorDaoImp.getAll();
        } catch (HibernateException e) {
            throw new HibernateException(e.getMessage());
        }
    }
    
}
