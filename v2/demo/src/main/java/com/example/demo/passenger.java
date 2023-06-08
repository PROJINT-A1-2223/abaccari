package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class passenger extends MYUSER {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int account; 
    private String addresseStart;
    private String addresseStop;




        // Getters and setters

    
        public String getFirstame() {
            return super.getFirstname();
        }
    
        public void setFirstame(String name) {
            super.setFirstname(name);
        }
    
        public String getLastname() {
            return super.getLastname();
        }
    
        public void setLastname(String name) {
            super.setLastname(name);
        }
    
    
        public String getLogins() {
            return super.getLogins();
        }
    
        public void setLogins(String name) {
            super.setLogins(name);
        }
    
        public String getPass() {
            return super.getPass();
        }
    
        public void setPass(String name) {
            super.setPass(name);
        }
    
    
        public void setAge(int a)
        { 
            super.setAge(a);
        }
        
    
        public Integer getAge()
        { 
            return super.getAge();
        }
        
    
        public void seTelephone(int a)
        { 
            super.seTelephone(a);
        }
        
    
        public Integer geTelephone()
        { 
            return super.geTelephone();
        }

    public boolean getRide()
    {
        return false;
    }

    public void cancel(Long id)
    {
        return;
    }

    public void seeAccount()
    {
        return;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getAddresseStart() {
        return addresseStart;
    }

    public void setAddresseStart(String addresseStart) {
        this.addresseStart = addresseStart;
    }

    public String getAddresseStop() {
        return addresseStop;
    }

    public void setAddresseStop(String addresseStop) {
        this.addresseStop = addresseStop;
    }
    
}
