import java.io.Serializable;

class DiaryEntry implements Entry, Serializable {
    private static final long serialVersionUID = 1L;

    private String date;
    private String content;

    public DiaryEntry(String date, String content) {
        this.date = date;
        this.content = content;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getContent() {
        return content;
    }

}