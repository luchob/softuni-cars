package bg.softuni.cars.models.view;

public class ModelViewModel {

  private String name;
  private String category;
  private String imageUrl;
  private Integer startYear;
  private Integer endYear;

  public String getName() {
    return name;
  }

  public ModelViewModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public ModelViewModel setCategory(String category) {
    this.category = category;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public ModelViewModel setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public Integer getStartYear() {
    return startYear;
  }

  public ModelViewModel setStartYear(Integer startYear) {
    this.startYear = startYear;
    return this;
  }

  public Integer getEndYear() {
    return endYear;
  }

  public ModelViewModel setEndYear(Integer endYear) {
    this.endYear = endYear;
    return this;
  }
}