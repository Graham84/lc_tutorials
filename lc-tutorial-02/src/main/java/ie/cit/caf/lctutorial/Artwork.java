package ie.cit.caf.lctutorial;

import java.util.List;

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
private String medium;
private List<Artist> contributors;
private List<Movement> movements;
private CatalogueGroup catalogueGroup;
private Subject subjects;


	public String toString() {
		String artworkAsString = "Acc No: " + acno 
				+"\nMedium: " + medium + contributors + movements + catalogueGroup + subjects
				+ "\nArtist: " + all_artists
				+ "\nTitle: " + title 
				+ "\nPrint: "  + acquisitionYear
				+ "\nClassification: " + classification
				+ "\nDimensions: " + dimensions
				+"\nID: " + id
				+"\nURL: " + url;
		return artworkAsString;
	
	}


	public String getMedium() {
		return medium;
	}


	public void setMedium(String medium) {
		this.medium = medium;
	}


	public List<Artist> getContributors() {
		return contributors;
	}


	public void setContributors(List<Artist> contributors) {
		this.contributors = contributors;
	}


	public List<Movement> getMovements() {
		return movements;
	}


	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}


	public CatalogueGroup getCatalogueGroup() {
		return catalogueGroup;
	}


	public void setCatalogueGroup(CatalogueGroup catalogueGroup) {
		this.catalogueGroup = catalogueGroup;
	}


	public Subject getSubjects() {
		return subjects;
	}


	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
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

