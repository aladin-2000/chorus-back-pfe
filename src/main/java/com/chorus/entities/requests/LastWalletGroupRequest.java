package com.chorus.entities.requests;

public class LastWalletGroupRequest {
	
    public String p01_alod_azgrpf_t;
    public String p02_alod_azprtf_t;
    
    

    public LastWalletGroupRequest(String p01_alod_azgrpf_t, String p02_alod_azprtf_t) {
		super();
		this.p01_alod_azgrpf_t = p01_alod_azgrpf_t;
		this.p02_alod_azprtf_t = p02_alod_azprtf_t;
	}

	// Getters and setters
    public String getP01_alod_azgrpf_t() {
        return p01_alod_azgrpf_t;
    }

    public void setP01_alod_azgrpf_t(String p01_alod_azgrpf_t) {
        this.p01_alod_azgrpf_t = p01_alod_azgrpf_t;
    }

    public String getP02_alod_azprtf_t() {
        return p02_alod_azprtf_t;
    }

    public void setP02_alod_azprtf_t(String p02_alod_azprtf_t) {
        this.p02_alod_azprtf_t = p02_alod_azprtf_t;
    }
}

