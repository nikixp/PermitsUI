package au.com.cdsw.permitsUI.Service;

import org.springframework.security.core.GrantedAuthority;

public class CustomerGrantAuthority implements GrantedAuthority {

    private String customerJson;

    public CustomerGrantAuthority(String customerJson){
        this.customerJson = customerJson;
    }

    @Override
    public String getAuthority() {
        return customerJson;
    }

    @Override
    public boolean equals(Object o){

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        CustomerGrantAuthority that = (CustomerGrantAuthority) o;
        return java.util.Objects.equals(customerJson, this.customerJson);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(customerJson);
    }

    @Override
    public String toString(){
        return this.customerJson;
    }

}
