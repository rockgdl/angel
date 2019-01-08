package com.fpiceno.portal.mail;

/*
 * FABIAN PICENO ROQUE 
 * 
 * CLASE QUE IMPLEMENTA UN SERVICIO PARA EMAIL CON LA POSIBILIDAD DE ADJUNTAR 
 * UN byte[] se hace el llamado a las propiedades del mail con este archivo donde corresponde de acuerdo
 * a la API de javamail
 * 
 * esta deshabilitado la forma de debug 
 * 24/07/17
 */

import java.util.Properties;

public class EmailConfiguration {
    private Properties properties = new Properties();
    public static final String SMTP_HOST = "mail.smtp.host";
    public static final String SMTP_AUTH = "mail.smtp.auth";
    public static final String SMTP_TLS_ENABLE = "mail.smtp.starttls.enable";
    public static final String SMTP_AUTH_USER = "smtp.auth.user";
    public static final String SMTP_AUTH_PWD = "smtp.auth.pwd";
    public static final String DEBUG = "debug";

    public Properties getProperties() {
        return this.properties;
    }

    public void setProperty(String key, String value) {
        this.properties.put(key, value);
    }

    public void addProperties(Properties props) {
        this.properties.putAll(props);
    }

    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }

    @Override
    public String toString() {
        return "EmailConfiguration [properties=" + properties + "]";
    }

}
