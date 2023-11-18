.
package com.tokobunga.config;

import com.toko.bunga.dao.TokoBungaDao;
import com.toko.bunga.dao.TokoBungaImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Yolenta_51420357
 */
public class HibernateuUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final TokoBungaDao TokoBunga_DAO;

    static{
        try{
            SESSION_FACTORY = new Configuration().configure().buildsessionFactory();
            TokoBunga_DAO = new TokoBungaImpl(SESSION_FACTORY);
        }catch(Throwable e{
            system.eer.printhln("Initial SessionFactory Failed : " +e);
            throw new ExceptionInInitializerError(e);
            
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY
    }
    
    public static TokoBungaDao getTokoBungaDao(){
        return TokoBunga_DAO;
    }

