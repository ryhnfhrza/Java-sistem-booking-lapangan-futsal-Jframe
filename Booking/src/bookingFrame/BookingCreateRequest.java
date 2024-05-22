
package bookingFrame;

public class BookingCreateRequest {
    private String jamMain;
    private String lapangan;
    private String namaTeam;
    private String noTelp;

    public BookingCreateRequest(String jamMain, String lapangan, String namaTeam, String noTelp) {
        this.jamMain = jamMain;
        this.lapangan = lapangan;
        this.namaTeam = namaTeam;
        this.noTelp = noTelp;
    }

    public String getJamMain() {
        return jamMain;
    }

    public void setJamMain(String jamMain) {
        this.jamMain = jamMain;
    }

    public String getLapangan() {
        return lapangan;
    }

    public void setLapangan(String lapangan) {
        this.lapangan = lapangan;
    }

    public String getNamaTeam() {
        return namaTeam;
    }

    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
}
