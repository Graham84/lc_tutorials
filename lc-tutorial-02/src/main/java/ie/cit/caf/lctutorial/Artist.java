package ie.cit.caf.lctutorial;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist extends Person {
	
	private int birthYear;
	private String gender;
	private int totalWorks;
	private String url;
	private int id;
	private String date;
	private String role;
	private List<Place> activePlaces;
	private List<Movement> movements;
	private Birth birth;
	
	@JsonProperty( "fc" )
	private String fullName;
	
	public String toString() {
		String artistAsString = "Name: "  + fullName
				+ "\nBorn: "  + birthYear
				+ "\nSex: " + gender
				+ "\nDate: " + date
				+ "\nArtist ID: " + id
				+ "\nTotal Works: " + totalWorks
				+ "\nURL: "+ url;
		return artistAsString;
	}
	
	public String toString1() {
		String artist = getName() + " (" + getBirthYear() + ")";
		for (Movement m : getMovements()) {
			artist += "-- " + m.getName() + " (" + m.getEra().getName() + ")";
		}
		artist += "Born: " + getBirth().getTime().getStartYear();
		if (getBirth().getPlace() != null) {
			artist += " (" + getBirth().getPlace().getName() + ")";
		}
		return artist;
	}
	
	public Birth getBirth() {
		return birth;
	}

	public void setBirth(Birth birth) {
		this.birth = birth;
	}
	
	public String getDate() {
		return date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Place> getActivePlaces() {
		return activePlaces;
	}

	public void setActivePlaces(List<Place> activePlaces) {
		this.activePlaces = activePlaces;
	}

	public List<Movement> getMovements() {
		return movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
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
