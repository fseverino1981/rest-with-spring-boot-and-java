package br.com.flavio.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@JsonPropertyOrder({"id","author","launchDate","price", "title"})
public class BookVO  extends RepresentationModel<BookVO> implements Serializable {


    private static final long serialVersionUID = 860676405411365476L;

    @JsonProperty("id")
    private Long key;

    private String author;
    private Date launchDate;
    private double price;
    private String title;

    public BookVO (){ }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BookVO bookVO = (BookVO) o;

        if (Double.compare(bookVO.price, price) != 0) return false;
        if (!Objects.equals(key, bookVO.key)) return false;
        if (!Objects.equals(author, bookVO.author)) return false;
        if (!Objects.equals(launchDate, bookVO.launchDate)) return false;
        return Objects.equals(title, bookVO.title);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (launchDate != null ? launchDate.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
