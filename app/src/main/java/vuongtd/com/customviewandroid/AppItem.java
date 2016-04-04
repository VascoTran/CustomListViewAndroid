package vuongtd.com.customviewandroid;

/**
 * Created by vuongtd on 3/26/2016.
 */
public class AppItem {
    private int icon;
    private String name;
    private String link;
    private String des;

    public AppItem(int icon, String name, String des, String link) {
        this.icon = icon;
        this.name = name;
        this.link = link;
        this.des = des;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
