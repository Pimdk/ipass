package pim.hu.IPASS.domain;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Date;


public class Speler {
	private String spelerId;
	private String gebruiker;
	private String voornaam;
	private String achternaam;
	private String geslacht;
	private Date leeftijd;
	private String email;
	private Team inTeam;

		public Speler(String SPID, String gebr, String vn, String an, String gs, Date leefd, String email) {
		this.spelerId = SPID;
		this.gebruiker = gebr;
		this.voornaam = vn;
		this.achternaam = an;
		this.geslacht = gs;
		this.leeftijd = leefd;
		this.email = email;
		}
		
		public String getGebruiker() {
			return gebruiker;
		}
		public void setGebruiker(String gebruiker) {
			this.gebruiker = gebruiker;
		}
		public String getSpelerId() {
			return spelerId;
		}
		public void setSpelerId(String spelerId) {
			this.spelerId = spelerId;
		}
		public String getVoornaam() {
			return voornaam;
		}
		public void setVoornaam(String voornaam) {
			this.voornaam = voornaam;
		}
		public String getAchternaam() {
			return achternaam;
		}
		public void setAchternaam(String achternaam) {
			this.achternaam = achternaam;
		}
		public String getGeslacht() {
			return geslacht;
		}
		public void setGeslacht(String geslacht) {
			this.geslacht = geslacht;
		}
		public Date getLeeftijd() {
			return leeftijd;
		}
		public void setLeeftijd(Date leeftijd) {
			this.leeftijd = leeftijd;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
	

	
}
