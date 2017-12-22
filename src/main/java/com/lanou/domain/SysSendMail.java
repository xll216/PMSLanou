package com.lanou.domain;

import java.util.Date;

public class SysSendMail {
    private String emailId;

    private String sysName;

    private String allowAcceptor;

    private String emailTo;

    private String emailCc;

    private String emailBcc;

    private String emailSubject;

    private String isbodyhtml;

    private String emailPriority;

    private String emailBody;

    private String isExistsAttr;

    private Integer failCount;

    private Integer maxFailCount;

    private Date createDate;

    private String effectFlag;

    private String towftype;

    private String ccwftype;

    private String bccwftype;

    public SysSendMail(String emailId, String sysName, String allowAcceptor, String emailTo, String emailCc, String emailBcc, String emailSubject, String isbodyhtml, String emailPriority, String emailBody, String isExistsAttr, Integer failCount, Integer maxFailCount, Date createDate, String effectFlag, String towftype, String ccwftype, String bccwftype) {
        this.emailId = emailId;
        this.sysName = sysName;
        this.allowAcceptor = allowAcceptor;
        this.emailTo = emailTo;
        this.emailCc = emailCc;
        this.emailBcc = emailBcc;
        this.emailSubject = emailSubject;
        this.isbodyhtml = isbodyhtml;
        this.emailPriority = emailPriority;
        this.emailBody = emailBody;
        this.isExistsAttr = isExistsAttr;
        this.failCount = failCount;
        this.maxFailCount = maxFailCount;
        this.createDate = createDate;
        this.effectFlag = effectFlag;
        this.towftype = towftype;
        this.ccwftype = ccwftype;
        this.bccwftype = bccwftype;
    }

    public SysSendMail() {
        super();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId == null ? null : emailId.trim();
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getAllowAcceptor() {
        return allowAcceptor;
    }

    public void setAllowAcceptor(String allowAcceptor) {
        this.allowAcceptor = allowAcceptor == null ? null : allowAcceptor.trim();
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo == null ? null : emailTo.trim();
    }

    public String getEmailCc() {
        return emailCc;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc == null ? null : emailCc.trim();
    }

    public String getEmailBcc() {
        return emailBcc;
    }

    public void setEmailBcc(String emailBcc) {
        this.emailBcc = emailBcc == null ? null : emailBcc.trim();
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject == null ? null : emailSubject.trim();
    }

    public String getIsbodyhtml() {
        return isbodyhtml;
    }

    public void setIsbodyhtml(String isbodyhtml) {
        this.isbodyhtml = isbodyhtml == null ? null : isbodyhtml.trim();
    }

    public String getEmailPriority() {
        return emailPriority;
    }

    public void setEmailPriority(String emailPriority) {
        this.emailPriority = emailPriority == null ? null : emailPriority.trim();
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody == null ? null : emailBody.trim();
    }

    public String getIsExistsAttr() {
        return isExistsAttr;
    }

    public void setIsExistsAttr(String isExistsAttr) {
        this.isExistsAttr = isExistsAttr == null ? null : isExistsAttr.trim();
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Integer getMaxFailCount() {
        return maxFailCount;
    }

    public void setMaxFailCount(Integer maxFailCount) {
        this.maxFailCount = maxFailCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEffectFlag() {
        return effectFlag;
    }

    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag == null ? null : effectFlag.trim();
    }

    public String getTowftype() {
        return towftype;
    }

    public void setTowftype(String towftype) {
        this.towftype = towftype == null ? null : towftype.trim();
    }

    public String getCcwftype() {
        return ccwftype;
    }

    public void setCcwftype(String ccwftype) {
        this.ccwftype = ccwftype == null ? null : ccwftype.trim();
    }

    public String getBccwftype() {
        return bccwftype;
    }

    public void setBccwftype(String bccwftype) {
        this.bccwftype = bccwftype == null ? null : bccwftype.trim();
    }
}