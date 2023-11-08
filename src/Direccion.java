import java.util.Objects;

public class Direccion {
    private String zipcode;
    private String calle;
    private String distrito;
    private String provincia;

    public Direccion(String zipcode, String calle, String distrito, String provincia) {
        this.zipcode = zipcode;
        this.calle = calle;
        this.distrito = distrito;
        this.provincia = provincia;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "zipcode='" + zipcode + '\'' +
                ", calle='" + calle + '\'' +
                ", distrito='" + distrito + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(zipcode, direccion.zipcode) && Objects.equals(calle, direccion.calle) && Objects.equals(distrito, direccion.distrito) && Objects.equals(provincia, direccion.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipcode, calle, distrito, provincia);
    }
}
