package com.fpiceno.portal.mail;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/*
 * FABIAN PICENO ROQUE 
 * 
 * CLASE QUE IMPLEMENTA UN SERVICIO PARA EMAIL CON LA POSIBILIDAD DE ADJUNTAR 
 * UN byte[]
 * 05/03/14
 */
public class Email {
    private String from;
    private String[] to;
    private String[] cc;
    private String[] bcc;
    private String subject;
    private String text;
    private String mimeType;
    private List<Attachment> attachments = new ArrayList<Attachment>();
    
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public String[] getTo() {
        return to;
    }
    
    public void setTo(String... to) {
        this.to = to;
    }
    
    public String[] getCc() {
        return cc;
    }
    
    public void setCc(String... cc) {
        this.cc = cc;
    }
    
    public String[] getBcc() {
        return bcc;
    }
    
    public void setBcc(String... bcc) {
        this.bcc = bcc;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getMimeType() {
        return mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    
    public List<Attachment> getAttachments() {
        return attachments;
    }
    
    public void addAttachments(List<Attachment> attachments) {
        this.attachments.addAll(attachments);
    }
    
    public void addAttachment(Attachment attachment) {
        this.attachments.add(attachment);
    }
    
    public void removeAttachment(int index) {
        this.attachments.remove(index);
    }
    
    public void removeAllAttachments() {
        this.attachments.clear();
    }
    
    @Override
    public String toString() {
        return "Email [from=" + from + ", to=" + Arrays.toString(to) + ", cc=" + Arrays.toString(cc) + ", bcc="
                + Arrays.toString(bcc) + ", subject=" + subject + ", text=" + text + ", mimeType=" + mimeType
                + ", attachments=" + attachments + "]";
    }
}
