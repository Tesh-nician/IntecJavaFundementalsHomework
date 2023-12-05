package Project2_PostCardCollection;

import java.util.Objects;

public class PostCard {

    String country;
    String continent;

    public PostCard(String country, String continent) {
        this.country = country;
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "PostCard: " +country+"@"+continent;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PostCard postCard = (PostCard) object;
        return Objects.equals(getCountry(), postCard.getCountry()) && Objects.equals(getContinent(), postCard.getContinent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getContinent());
    }



}
