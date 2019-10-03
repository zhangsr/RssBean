package me.zsr.rssbean;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import me.zsr.rsscommon.NumberUtil;
import me.zsr.rsscommon.StringUtil;

@Entity
public class Article implements Parcelable {
    @Id
    private Long id;

    private String title;

    private String link;

    private String description;

    private Boolean read;

    private Boolean trash;

    private String content;

    private Long subscriptionId;

    private Long published;

    private Boolean favorite;

    private String ext1;

    private String ext2;

    private String ext3;

    private String type;

    private String iconUrl;

    private String subscriptionTitle;

    private String subscriptionUrl;

    private String createTime;

    private String groupId;

    public static final String TYPE_DEFAULT = "";
    public static final String TYPE_SINFO = "sinfo";

    protected Article(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readLong();
        }
        title = in.readString();
        link = in.readString();
        description = in.readString();
        byte tmpRead = in.readByte();
        read = tmpRead == 0 ? null : tmpRead == 1;
        byte tmpTrash = in.readByte();
        trash = tmpTrash == 0 ? null : tmpTrash == 1;
        content = in.readString();
        if (in.readByte() == 0) {
            subscriptionId = null;
        } else {
            subscriptionId = in.readLong();
        }
        if (in.readByte() == 0) {
            published = null;
        } else {
            published = in.readLong();
        }
        byte tmpFavorite = in.readByte();
        favorite = tmpFavorite == 0 ? null : tmpFavorite == 1;
        ext1 = in.readString();
        ext2 = in.readString();
        ext3 = in.readString();
        type = in.readString();
        iconUrl = in.readString();
        subscriptionTitle = in.readString();
        subscriptionUrl = in.readString();
        createTime = in.readString();
        groupId = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(id);
        }
        dest.writeString(title);
        dest.writeString(link);
        dest.writeString(description);
        dest.writeByte((byte) (read == null ? 0 : read ? 1 : 2));
        dest.writeByte((byte) (trash == null ? 0 : trash ? 1 : 2));
        dest.writeString(content);
        if (subscriptionId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(subscriptionId);
        }
        if (published == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(published);
        }
        dest.writeByte((byte) (favorite == null ? 0 : favorite ? 1 : 2));
        dest.writeString(ext1);
        dest.writeString(ext2);
        dest.writeString(ext3);
        dest.writeString(type);
        dest.writeString(iconUrl);
        dest.writeString(subscriptionTitle);
        dest.writeString(subscriptionUrl);
        dest.writeString(createTime);
        dest.writeString(groupId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Article> CREATOR = new Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };

    public Long getPublished() {
        return this.published;
    }

    public void setPublished(Long published) {
        this.published = published;
    }

    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getTrash() {
        return this.trash;
    }

    public void setTrash(Boolean trash) {
        this.trash = trash;
    }

    public Boolean getRead() {
        return this.read == null ? false : this.read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 742516792)
    public Article() {
    }

    @Generated(hash = 2032248632)
    public Article(Long id, String title, String link, String description, Boolean read, Boolean trash,
            String content, Long subscriptionId, Long published, Boolean favorite, String ext1, String ext2,
            String ext3, String type, String iconUrl, String subscriptionTitle, String subscriptionUrl,
            String createTime, String groupId) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.description = description;
        this.read = read;
        this.trash = trash;
        this.content = content;
        this.subscriptionId = subscriptionId;
        this.published = published;
        this.favorite = favorite;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.ext3 = ext3;
        this.type = type;
        this.iconUrl = iconUrl;
        this.subscriptionTitle = subscriptionTitle;
        this.subscriptionUrl = subscriptionUrl;
        this.createTime = createTime;
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Article) {
            Article article = (Article) o;
            return StringUtil.equals(article.getTitle(), getTitle())
                    && NumberUtil.equals(article.getSubscriptionId(), subscriptionId);
        }
        return false;
    }

    public Boolean getFavorite() {
        return this.favorite == null ? false : this.favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public String getExt1() {
        return this.ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return this.ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return this.ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public Article clone() {
        return new Article(id, title, link, description, read, trash, content, subscriptionId, published,
                favorite, ext1, ext2, ext3, type, iconUrl, subscriptionTitle, subscriptionUrl, createTime, groupId);
    }

    public String getType() {
        return this.type == null ? TYPE_DEFAULT : this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public void setSubscriptionTitle(String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
    }

    public String getSubscriptionUrl() {
        return this.subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
