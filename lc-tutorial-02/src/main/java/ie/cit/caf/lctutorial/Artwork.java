package ie.cit.caf.lctutorial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artwork {
	
private String acno;
private int acquisitionYear;
private String all_artists;
private String classification;
private String dimensions;
private int id;
private String title;
private String url;


	public String toString() {
		String artworkAsString = "Acc No: "  + acno
				+ "\nArtist: " + all_artists
				+ "\nTitle: " + title 
				+ "\nPrint: "  + acquisitionYear
				+ "\nClassification: " + classification
				+ "\nDimensions: " + dimensions
				+"\nID: " + id
				+"\nURL: " + url;
		return artworkAsString;
		
	}


	public String getAcno() {
		return acno;
	}


	public void setAcno(String acno) {
		this.acno = acno;
	}


	public int getAcquisitionYear() {
		return acquisitionYear;
	}


	public void setAcquisitionYear(int acquisitionYear) {
		this.acquisitionYear = acquisitionYear;
	}


	public String getAll_artists() {
		return all_artists;
	}


	public void setAll_artists(String all_artists) {
		this.all_artists = all_artists;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public String getDimensions() {
		return dimensions;
	}


	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
}

