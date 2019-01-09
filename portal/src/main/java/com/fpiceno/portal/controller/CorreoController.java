package com.fpiceno.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpiceno.portal.entity.Correo;
import com.fpiceno.portal.mail.Email;
import com.fpiceno.portal.mail.MensajeCorreo;
import com.fpiceno.portal.mail.ServidorDeCorreo;
import com.fpiceno.portal.service.CorreoService;

import java.util.Date;

@Controller
@RequestMapping("/Correo")
@Component
public class CorreoController {
	
	@Autowired
	private Correo correo;
	@Autowired
	private CorreoService servicio;
	
	@RequestMapping("Contacto")
	public String Contacto(){
		return "contactoForm";
	}
	
	@RequestMapping("/Enviar")
	public String enviar(ModelMap model, @RequestParam (value="destinatario", required=true) String destinatario,
			@RequestParam(value="asunto",required=true) String asunto,
			@RequestParam (value="mensaje", required=true) String texto,
			@RequestParam(value="remitente") String remitente) {
		
		
		//Enviar a simulador de correos 
		ServidorDeCorreo servicioCorreo=new ServidorDeCorreo();
		 MensajeCorreo mensaje=new MensajeCorreo();
		 mensaje.setSubject(asunto);
		 
	     // message contains HTML markups
	     String message = texto;
		
	     mensaje.setText(message);
		 mensaje.setMimeType("text/plain");
		 
		 //create email
		 
		 Email email=new Email();
		 email.setFrom(remitente);
		 email.setTo(destinatario);
		 //email.setCc(destinatarios);
		 email.setMimeType("text/html");
		 email.setText(mensaje.getText());
		 
		 email.setSubject(mensaje.getSubject());
		 
//		 Attachment attachment1 = new Attachment("ABCDEFGH".getBytes(), "test1.txt","text/plain");
//		 email.addAttachment(attachment1);
		 System.out.println(servicioCorreo.getConfiguration().getProperties().toString());
		 servicioCorreo.setMensaje(mensaje);
		 servicioCorreo.setEmail(email);
		 servicioCorreo.enviarCorreo(email);
		
		//mandar a la db
		 
		 correo.setRemitente(remitente);
		 correo.setDestinatario(destinatario);
		 correo.setAsunto(asunto);
		 correo.setFechaEnvio(new Date());
		 correo.setMensaje(texto);
		 Integer id=servicio.agregarCorreo(correo);
		 model.addAttribute("id", id);
		return "contactoForm";
	}
}
