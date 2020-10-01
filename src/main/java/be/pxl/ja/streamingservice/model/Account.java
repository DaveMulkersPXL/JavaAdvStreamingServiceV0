package be.pxl.ja.streamingservice.model;

import java.util.List;

public class Account {

    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;


    public Account(String email, String password) {
        this.email = email;
        this.password = password;
        addProfile(new Profile("profiel1"));
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public String getEmail() {
        return email;
    }

    public void addProfile(Profile profile){
        profiles.add(profile);
    }

    public Profile getFirstProfile(){
        return profiles.get(0);
    }

    public boolean verifyPassword(String password){
        return password.equals(this.password);
    }
}
