package projectrider.bindingModel;


public class ProjectBindingModel {

    private String title;

    private String description;

    private Double budget;

    public ProjectBindingModel() {
    }

    public ProjectBindingModel(String title, String description, Double budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
