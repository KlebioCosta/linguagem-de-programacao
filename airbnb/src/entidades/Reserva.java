package entidades;

public class Reserva {
    private String propriedadeReserva;
    private String reservaHospede;
    private String checkin;
    private String checkout;
    private Double precototal;

    public Reserva(String propriedadeReserva, String reservaHospede, String checkin, String checkout, Double precototal) {
        this.propriedadeReserva = propriedadeReserva;
        this.reservaHospede = reservaHospede;
        this.checkin = checkin;
        this.checkout = checkout;
        this.precototal = precototal;
    }

    public String getPropriedadeReserva() {
        return propriedadeReserva;
    }

    public void setPropriedadeReserva(String propriedadeReserva) {
        this.propriedadeReserva = propriedadeReserva;
    }

    public String getReservaHospede() {
        return reservaHospede;
    }

    public void setReservaHospede(String reservaHospede) {
        this.reservaHospede = reservaHospede;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public Double getPrecototal() {
        return precototal;
    }

    public void setPrecototal(Double precototal) {
        this.precototal = precototal;
    }
}
