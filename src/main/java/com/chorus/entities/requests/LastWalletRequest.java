package com.chorus.entities.requests;

import org.springframework.web.bind.annotation.RequestBody;

public class LastWalletRequest {
	public  String p01_alod_azgrps_t ;
	public String p02_alod_azgrpf_t ; 
	public String p03_alod_azprtf_t ;
	public LastWalletRequest(String p01_alod_azgrps_t, String p02_alod_azgrpf_t, String p03_alod_azprtf_t) {
		super();
		this.p01_alod_azgrps_t = p01_alod_azgrps_t;
		this.p02_alod_azgrpf_t = p02_alod_azgrpf_t;
		this.p03_alod_azprtf_t = p03_alod_azprtf_t;
	}
	public String getP01_alod_azgrps_t() {
		return p01_alod_azgrps_t;
	}
	public void setP01_alod_azgrps_t(String p01_alod_azgrps_t) {
		this.p01_alod_azgrps_t = p01_alod_azgrps_t;
	}
	public String getP02_alod_azgrpf_t() {
		return p02_alod_azgrpf_t;
	}
	public void setP02_alod_azgrpf_t(String p02_alod_azgrpf_t) {
		this.p02_alod_azgrpf_t = p02_alod_azgrpf_t;
	}
	public String getP03_alod_azprtf_t() {
		return p03_alod_azprtf_t;
	}
	public void setP03_alod_azprtf_t(String p03_alod_azprtf_t) {
		this.p03_alod_azprtf_t = p03_alod_azprtf_t;
	}
	
	

}
