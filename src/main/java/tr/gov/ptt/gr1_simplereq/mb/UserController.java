/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr1_simplereq.mb;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import tr.gov.ptt.gr1_simplereq.dto.User;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class UserController {
    
    private User kullanici;

    public User getKullanici() {
        return kullanici;
    }

    public void setKullanici(User kullanici) {
        this.kullanici = kullanici;
    }

    public UserController() {
        this.kullanici = new User();
    }
    
    public String kayit()
    {
       System.out.println("Kayıt edilen kullanıcı"+this.kullanici);
       String msg = "Kullanıcı başarıyla kayıt edildi";
       
       //uyarı mesajıne ekranda gösterir
       FacesContext.getCurrentInstance().addMessage(null, 
                                          new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
        
        //Mesajın diger sayfada gözükmesini saglar.
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
       
      //?faces-redirect=true: gittigi sayfanın ismi yazsın browserda         
       return "kayit.jsf?faces-redirect=true";
    }
    
    
}
