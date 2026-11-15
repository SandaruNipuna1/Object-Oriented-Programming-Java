package Question3;

public class Document {
    private String title;
    private String content;

    public Document(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public void displayDocument(){
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }


}
