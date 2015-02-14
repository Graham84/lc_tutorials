package ie.cit.caf.lctutorial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
	
	private int birthYear;
	private String gender;
	private int totalWorks;
	private String url;
	private int id;
	private String date;
	private String birthplacename;
	

	@JsonProperty( "fc" )
	private String fullName;
	
	public String toString() {
		String artistAsString = "Name: "  + fullName + birthplacename
				+ "\nBorn: "  + birthYear
				+ "\nSex: " + gender
				+ "\nDate: " + date
				+ "\nArtist ID: " + id
				+ "\nTotal Works: " + totalWorks 
				+ "\nURL: "+ url;
		return artistAsString;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getTotalWorks() {
		return totalWorks;
	}

	public void setTotalWorks(int totalWorks) {
		this.totalWorks = totalWorks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear( int birthYear) {
		this. birthYear = birthYear;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this. fullName = fullName;
	}


}
