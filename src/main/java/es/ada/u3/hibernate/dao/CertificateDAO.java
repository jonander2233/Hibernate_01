package es.ada.u3.hibernate.dao;

import es.ada.u3.hibernate.entities.Certificate;

public class CertificateDAO {
    private static CertificateDAO instance = new CertificateDAO();
    private CertificateDAO(){

    }
    public static CertificateDAO getInstance(){
        return instance;
    }
//    public Certificate add
}

