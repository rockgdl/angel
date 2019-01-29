package com.fpiceno.portal.bl;

import java.text.SimpleDateFormat;

/**
 * Propiedades para el componente de BPM
 * 
 * @author Fabian Piceno Urrea Valvulas julio 2017
 * 
 */

public class PropiedadesPortal {
	
	/*
	 * 
	 * LEER ANTES DE HACER DEPLOY 
	 * @author fpiceno
	 *esta variable es el ambiente donde apuntaran las conexiones tanto la base de datos....como la conexion a sap, posibles valores son , produccion,desarrollo, local
	 *tiene que estar escrito en minusculas..... se utiliza a diferencia de los otros portales se utiliza una conexion jdbc con un datasoruce definido en spring por el
	 *archivo de configuracion llamado persistence.xml
	 *este datasource es a donde debe apuntar la base de datos, en el caso de la instalacion del websphere local se punta a localhost
	 *pero en los ambientes de desarrollo apunta al servidor urriap02 y urrwas01 que son desarrollo y produccion
	 *
	 *para cambiar los web services de bizagi existen 2 clases llamadas WorkflowEngineSOAImplServiceLocator y EntityManagerSOAImplServiceLocator si se genero con el metodo
	 *axis se encontrarar en unas clases llamadas WorkflowEngineLocator y EntitiManagerLocator donde viene una url que es la que debe de cambiar a produccion o desarrollo 
	 * de caso contrario hay que modificar los wsdl que vienen en la carpeta Webcontent/Web-Inf/wsdl respectivamente 
	 *
	 *donde contienen las rutas de los servidores de desarrollo y produccion la direccion que empiezan con 10.0.3.17 es desarrolo mientras que las que terminan con 10.0.3.27 
	 *son produccion puede que cambien estas rutas dependiendo el servidor donde esta alojado, aqui no se respeta el nombre del host tiene que ser por direccion ip 
	 *se tienen que cambiar para apuntar a los servidores de bizagi tanto desarrollo y como produccion, esto al igual que la variable de entorno por otro lado
	 *los web Services que se tienen de Seguridad pasa lo mismo estos si estan colocados en los wsdl en Web inf que apuntara la base de datos de desarrollo y produccion
	 *
	 *
	 *
	 */
	
	public final static String ambiente="local";
  

    /** Propiedades FTP  ADU */
//    public final static String FTPUSUARIO = "root";
//    public final static String FTPPASSWORD = "aduuxmgrs";
//    public final static String FTPHOST = "10.30.1.2";
//    public final static int PORT = 21;

    
    /** Propiedades FTP Desarrollo */
//    public final static String FTPUSUARIO = "fpiceno";
//    public final static String FTPPASSWORD = "fa7730pr";
//    public final static String FTPHOST = "192.168.100.84";
//    public final static int PORT = 21;
    
    
    /** Propiedades FTP Produccion */
    public final static String FTPUSUARIO = "test";
    public final static String FTPPASSWORD = "test";
    public final static String FTPHOST = "10.0.3.21";
    public final static int PORT = 21;
    public final static String[] correos= {"fpiceno@urrea.com.mx","sanda@urrea.com.mx"};
    
    public final static String FTP_HOST = "10.0.3.21";

    public final static String FTP_PROD_FOLDER = "BPM/Produccion/";
    public final static String FTP_DEV_FOLDER = "BPM/Desarrollo/";
    
    public final static String FTP_PROD_URL = "ftp://"+ FTPUSUARIO + ":" + FTPPASSWORD + "@" + FTP_HOST + "/" + FTP_PROD_FOLDER;
    public final static String FTP_DEV_URL = "ftp://"+ FTPUSUARIO + ":" + FTPPASSWORD + "@" + FTP_HOST + "/" + FTP_DEV_FOLDER;
    public final static String IMG_EMPLEADO = "http://webvalur02/comedor/empleado/";

 
    /**
     * propiedades de seguridad
     */
    public final static String nombreAplicacion = "Refacciones";
    public final static String obtenUrlSeguridad = "/refaccioneslogin/";
    public final static String login = "Login";
    public final static String correoPrestamo="adminbpm@urrea.com.mx";
    
    public final static String ENV_DATA_SOURCE = "java:comp/env/jdbc/conexionDB2";
    public final static String ENV_EJB_LUGARES = "java:global/TRD-AC-URREAREFACCIONES/MyUtilDao!com.tracsa.ejb.lugares.dao.UtilDaoRemote";
    public final static String ENV_RESOURCE = "jdbc/conexionDB2";
    // public final static String ESQUEMA_REFACCIONES = "TBSTRRFPU TBSNVORFD";

    public final static String ESQUEMA_REFACCIONES = "TBSLIM"; //"TBSTRRFPU"; //"TBSLIM";
    public final static String ESQUEMA_DBS = "LIBT02";
    public final static String ESQUEMA_DBSUSR = "LIBT02USR"; //LIBP02USR
  
    public final static String ESQUEMA_MAQUINARIA = "LIBDTBS01";
    public final static String URL = "http://localhost:8080/rest/";
    
    public final static int LIMITE = 5;
    
    public final static int LIMITE_SEGURIDAD = 100000;
    public final static int DECIMALES_DOC = 2;
    public final static String DEFAULT_IDIOMA = "es"; 
    
    public final static String FORMATO_FECHA_DB2 = "dd.MM.yyyy";
    public final static String FORMATO_FECHA_DB2_HORA = "hh.mm.ss";
    public final static String FORMATO_FECHA_CONSULTA = "dd/MM/yyyy";
	private final static SimpleDateFormat FORMATO_FECHA_MYSQL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private final static SimpleDateFormat FECHAPORTAL = new SimpleDateFormat("dd/MM/yyyy");
	private final static SimpleDateFormat FECHAPORTALTOBIZAGI = new SimpleDateFormat("yyyy-MM-dd");
//	private final static SimpleDateFormat FECHABIZAGI = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    

	public static String getAmbiente() {
		return ambiente;
	}
	public static String getCorreoPrestamo()
	{
		if (ambiente.equalsIgnoreCase("produccion"))
		{
			return "usd@urrea.com.mx";
		}
		else
		{
			return "fpiceno@urrea.com.mx";
		}
	}
	public static String [] getCorreos()
	{
		return correos;
	}



	public static SimpleDateFormat getFormatoFechaMysql() {
		return FORMATO_FECHA_MYSQL;
	}
	

	public static SimpleDateFormat getFechaportaltobizagi() {
		return FECHAPORTALTOBIZAGI;
	}
    
    
    
    
    
}
