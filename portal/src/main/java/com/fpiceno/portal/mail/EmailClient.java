package com.fpiceno.portal.mail;

import java.util.Date;

import javax.mail.Address;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.fpiceno.portal.bl.PropiedadesPortal;



/*
 * FABIAN PICENO ROQUE 
 * 
 * CLASE QUE IMPLEMENTA UN SERVICIO PARA EMAIL CON LA POSIBILIDAD DE ADJUNTAR 
 * UN byte[]
 * 24/07/17
 */


public class EmailClient

{

 public static void main(String[] args)

 {

//  EmailConfiguration configuration = new EmailConfiguration();
//  configuration.setProperty(EmailConfiguration.SMTP_HOST, ConexionMail.getIpMail());
//  configuration.setProperty(EmailConfiguration.SMTP_AUTH, ConexionMail.getSmtpAuthMail());
//  configuration.setProperty(EmailConfiguration.SMTP_TLS_ENABLE, ConexionMail.getSmtpStarttlsMail());
//  configuration.setProperty(EmailConfiguration.SMTP_AUTH_USER, ConexionMail.getUserMail());
//  configuration.setProperty(EmailConfiguration.SMTP_AUTH_PWD, ConexionMail.getPassMail());
//   System.out.println("PROPIEDADES DEL SERVIDOR "+configuration.toString());
//
//  EmailService emailService = new EmailService(configuration);
//  Email email = new Email();
//  email.setFrom("Scheduler@urrea.com.mx");
//  email.setTo("mgutierrez@urrea.com.mx");
////  email.setCc("skitrock@hotmail.com");
//  
//  email.setSubject("TEST PARA URREA  ENVIO DE CORREO");
//  email.setText("Hi, <h1>Test Envio Correo Scheduler me dices si te llega correo no deseado o deseado porfavor xD  </h1>");
//  email.setMimeType("text/html");
//
//  Attachment attachment1 = new Attachment("ABCDEFGH".getBytes(), "test1.txt","text/plain");
//  email.addAttachment(attachment1);
//  Attachment attachment2 = new Attachment("XYZZZZZZ".getBytes(), "test2.txt","text/plain");
//  email.addAttachment(attachment2);
//  emailService.sendEmail(email);
	 
	 
	 ServidorDeCorreo servicioCorreo=new ServidorDeCorreo();
	 MensajeCorreo mensaje=new MensajeCorreo();
	// mensaje.setMimeType("text/plain");
	 mensaje.setSubject("test fake smpt");
	 
	 
	 
	 
     // message contains HTML markups
     String message = "<h1>Test</h1><br>";
     message += "<p>test</p><br><br>";
//     message += "<p>Numero de Empleado: </p><br>";
     
     
     
//     message += "<font color=red>Duke</font>";

	 
//     String[] destinatarios={"fpiceno@urrea.com.mx","sanda@urrea.com.mx"};; 
//	 Address []destinos = new Address[PropiedadesPortal.getCorreos().length];//Aqui usamos el arreglo de destinatarios
//     for(int i=0;i<destinos.length;i++){ 
//         try {
//			destinos[i]=new InternetAddress(destinatarios[i]);
//		} catch (AddressException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//     } 
	 
	 
	 mensaje.setText(message);
	 mensaje.setMimeType("text/plain");
	 Email email=new Email();
	 email.setFrom("fpiceno@urrea.com.mx");
	 email.setTo("fpiceno@urrea.com.mx");
	 //email.setCc(destinatarios);
	 email.setMimeType("text/html");
	 email.setText(mensaje.getText());
	 
	 email.setSubject(mensaje.getSubject());
	 
//	 Attachment attachment1 = new Attachment("ABCDEFGH".getBytes(), "test1.txt","text/plain");
//	 email.addAttachment(attachment1);
	 System.out.println(servicioCorreo.getConfiguration().getProperties().toString());
	 servicioCorreo.setMensaje(mensaje);
	 servicioCorreo.setEmail(email);
	 servicioCorreo.enviarCorreo(email);

   

 }

 
}
