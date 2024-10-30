package POO_JE12.COLOCANDO_EM_PRATICA;
class Contato {
    private String email;
    private String whatsapp;
    private String nicknameInstagram;

    public Contato(String email, String whatsapp, String nicknameInstagram) {
        this.email = email;
        this.whatsapp = whatsapp;
        this.nicknameInstagram = nicknameInstagram;
    }

    public String getEmail() {
        return email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getNicknameInstagram() {
        return nicknameInstagram;
    }
}