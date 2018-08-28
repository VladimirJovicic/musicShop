package MusicShop.dtos;

import MusicShop.entities.ModelBase;

public class ApiResponse extends ModelBase{
	private static final long serialVersionUID = -6624726180748515507L;
    private String token;

    public ApiResponse() {
        super();
    }

    public ApiResponse(String token) {
        this.setToken(token);
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }	
}
