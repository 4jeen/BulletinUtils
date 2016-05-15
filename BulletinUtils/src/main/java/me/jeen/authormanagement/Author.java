/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.jeen.authormanagement;

/**
 *
 * @author jeen
 */
public class Author extends Object implements Comparable<Author> {

    private static final String QOUTES = "[\"]";
    //private static final String QOUTESREPLACE="\\\\\"";
    private static final String QOUTESREPLACE = "&quotes;";
    private int idd = 0;
    private String fam = "";
    private String famEn = "";
    private String nam = "";
    private String namEn = "";
    private String otc = "";
    private String otcEn = "";
    private String uchstEn = "";
    private String uchst = "";
    private String uchzv = "";
    private String uchzvEn = "";
    private String dolzhn = "";
    private String dolzhnEn = "";
    private String maddr = "";
    private String workpladdr = "";
    private String workpladdrEn = "";
    private String workPhone;

    public Author() {

    }

    @Override
    public int compareTo(Author o1) {
        final int AFTER = 1;
        if (o1 == null) {
            return AFTER;
        }
        return compare(this, o1);
    }

    public int compare(Author o1, Author o2) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        StringBuilder fam1 = new StringBuilder(o1.getFam()).append(" ").append(o1.getNam()).append(" ").append(o1.getOtc());
        StringBuilder fam2 = new StringBuilder(o2.getFam()).append(" ").append(o2.getNam()).append(" ").append(o2.getOtc());
        if (fam1.toString() == null) {
            return fam2.toString() == null ? EQUAL : AFTER;
        }
        return fam2.toString() == null ? BEFORE : fam1.toString().compareTo(fam2.toString());
    }

    public int getIdd() {
        return this.idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getFam() {
        return this.fam;
    }

    public String getFamEn() {
        return this.famEn;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public void setFamEn(String fam) {
        this.famEn = fam;
    }

    public String getNam() {
        return this.nam;
    }

    public String getNamEn() {
        return this.namEn;
    }

    public void setNam(String nam) {
        if (nam.length() > 255) {
            nam = nam.substring(0, 255);
        }
        this.nam = nam.trim();
    }

    public void setNamEn(String nam) {
        if (nam.length() > 255) {
            nam = nam.substring(0, 255);
        }
        this.namEn = nam.trim();
    }

    public String getOtc() {
        return this.otc;
    }

    public String getOtcEn() {
        return this.otcEn;
    }

    public void setOtc(String otc) {
        this.otc = otc.trim();
    }

    public void setOtcEn(String otc) {
        this.otcEn = otc.trim();
    }

    public String getMaddr() {
        return this.maddr;
    }

    public void setMaddr(String maddr) {
        this.maddr = maddr.trim();
    }

    public String getUchst() {
        return this.uchst;
    }

    public String getUchstEn() {
        return this.uchstEn;
    }

    public void setUchst(String uchst) {
        this.uchst = uchst.trim();
    }

    public void setUchstEn(String uchst) {
        this.uchstEn = uchst.trim();
    }

    public String getUchzv() {
        return this.uchzv;
    }

    public String getUchzvEn() {
        return this.uchzvEn;
    }

    public void setUchzv(String uchzv) {
        this.uchzv = uchzv.trim();
    }

    public void setUchzvEn(String uchzv) {
        this.uchzvEn = uchzv.trim();
    }

    public String getDolzhn() {
        return this.dolzhn;
    }

    public String getDolzhnEn() {
        return this.dolzhnEn;
    }

    public void setDolzhn(String dolzhn) {
        this.dolzhn = dolzhn.trim();
    }

    public void setDolzhnEn(String dolzhn) {
        this.dolzhnEn = dolzhn.trim();
    }
    private String workpl = "";
    private String workplEn = "";

    public String getWorkpl() {
        return this.workpl;
    }

    public String getWorkplEn() {
        return this.workplEn;
    }

    public void setWorkpl(String workpl) {
        this.workpl = workpl.trim();
    }

    public void setWorkplEn(String workpl) {
        this.workplEn = workpl.trim();
    }

    public String getWorkpladdr() {
        return this.workpladdr;
    }

    public String getWorkpladdrEn() {
        return this.workpladdrEn;
    }

    public void setWorkpladdr(String workpladdr) {
        this.workpladdr = workpladdr.trim();
    }

    public void setWorkpladdrEn(String workpladdr) {
        this.workpladdrEn = workpladdr.trim();
    }

    public String getWorkPhone() {
        return this.workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    @Override
    public String toString() {
        return idd + "|" + fam + "|" + nam + "|" + otc+"|"+famEn+"|"+namEn+
                otcEn+"|"+uchst+"|"+uchstEn+"|"+uchzv+"|"+uchzvEn+"|"+workPhone;
    }

    public String toJSONSrtring() {
        StringBuilder b = new StringBuilder("{\"rownum\":\"");
        b.append(idd).append("\",\"lastname\":\"").append(fam.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"firstname\":\"").append(nam.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"secondname\":\"").append(otc.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"lastname_en\":\"").append(famEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"name_en\":\"").append(namEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"secondname_en\":\"").append(otcEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"uchst\":\"").append(uchst.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"uchst_en\":\"").append(uchstEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"uchzv\":\"").append(uchzv.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"uchzv_en\":\"").append(uchzvEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"phone\":\"").append( workPhone != null ? workPhone.replaceAll(QOUTES, QOUTESREPLACE):"" ).
                append("\",\"workpl\":\"").append(workpl.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"workpl_en\":\"").append(workplEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"workpladdr\":\"").append(workpladdr.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"workpladdr_en\":\"").append(workpladdrEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"email\":\"").append(maddr.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"position\":\"").append(dolzhn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\",\"position_en\":\"").append(dolzhnEn.replaceAll(QOUTES, QOUTESREPLACE)).
                append("\"}");
        return b.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.idd;
        hash = 13 * hash + (this.fam != null ? this.fam.hashCode() : 0);
        hash = 17 * hash + (this.famEn != null ? this.famEn.hashCode() : 0);
        hash = 19 * hash + (this.nam != null ? this.nam.hashCode() : 0);
        hash = 23 * hash + (this.namEn != null ? this.namEn.hashCode() : 0);
        hash = 29 * hash + (this.otc != null ? this.otc.hashCode() : 0);
        hash = 31 * hash + (this.otcEn != null ? this.otcEn.hashCode() : 0);
        hash = 37 * hash + (this.maddr != null ? this.maddr.hashCode() : 0);
        hash = 41 * hash + (this.uchstEn != null ? this.uchstEn.hashCode() : 0);
        hash = 43 * hash + (this.uchst != null ? this.uchst.hashCode() : 0);
        hash = 47 * hash + (this.uchzv != null ? this.uchzv.hashCode() : 0);
        hash = 53 * hash + (this.uchzvEn != null ? this.uchzvEn.hashCode() : 0);
        hash = 59 * hash + (this.dolzhn != null ? this.dolzhn.hashCode() : 0);
        hash = 61 * hash + (this.dolzhnEn != null ? this.dolzhnEn.hashCode() : 0);
        hash = 67 * hash + (this.workpl != null ? this.workpl.hashCode() : 0);
        hash = 71 * hash + (this.workplEn != null ? this.workplEn.hashCode() : 0);
        hash = 73 * hash + (this.workpladdr != null ? this.workpladdr.hashCode() : 0);
        hash = 79 * hash + (this.workpladdrEn != null ? this.workpladdrEn.hashCode() : 0);
        hash = 83 * hash + (this.workPhone != null ? this.workPhone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (this.idd != other.idd) {
            return false;
        }
        if ((this.fam == null) ? (other.fam != null) : !this.fam.equals(other.fam)) {
            return false;
        }
        if ((this.famEn == null) ? (other.famEn != null) : !this.famEn.equals(other.famEn)) {
            return false;
        }
        if ((this.nam == null) ? (other.nam != null) : !this.nam.equals(other.nam)) {
            return false;
        }
        if ((this.namEn == null) ? (other.namEn != null) : !this.namEn.equals(other.namEn)) {
            return false;
        }
        if ((this.otc == null) ? (other.otc != null) : !this.otc.equals(other.otc)) {
            return false;
        }
        if ((this.otcEn == null) ? (other.otcEn != null) : !this.otcEn.equals(other.otcEn)) {
            return false;
        }
        if ((this.maddr == null) ? (other.maddr != null) : !this.maddr.equals(other.maddr)) {
            return false;
        }
        if ((this.uchstEn == null) ? (other.uchstEn != null) : !this.uchstEn.equals(other.uchstEn)) {
            return false;
        }
        if ((this.uchst == null) ? (other.uchst != null) : !this.uchst.equals(other.uchst)) {
            return false;
        }
        if ((this.uchzv == null) ? (other.uchzv != null) : !this.uchzv.equals(other.uchzv)) {
            return false;
        }
        if ((this.uchzvEn == null) ? (other.uchzvEn != null) : !this.uchzvEn.equals(other.uchzvEn)) {
            return false;
        }
        if ((this.dolzhn == null) ? (other.dolzhn != null) : !this.dolzhn.equals(other.dolzhn)) {
            return false;
        }
        if ((this.dolzhnEn == null) ? (other.dolzhnEn != null) : !this.dolzhnEn.equals(other.dolzhnEn)) {
            return false;
        }
        if ((this.workpl == null) ? (other.workpl != null) : !this.workpl.equals(other.workpl)) {
            return false;
        }
        if ((this.workplEn == null) ? (other.workplEn != null) : !this.workplEn.equals(other.workplEn)) {
            return false;
        }
        if ((this.workpladdr == null) ? (other.workpladdr != null) : !this.workpladdr.equals(other.workpladdr)) {
            return false;
        }
        if ((this.workpladdrEn == null) ? (other.workpladdrEn != null) : !this.workpladdrEn.equals(other.workpladdrEn)) {
            return false;
        }
        if ((this.workPhone == null) ? (other.workPhone != null) : !this.workPhone.equals(other.workPhone)) {
            return false;
        }
        return true;
    }

}
