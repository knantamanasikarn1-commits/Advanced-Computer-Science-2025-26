public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit
        // Added validation for setTitle
        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("The assignment must have a title.");
        }
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
