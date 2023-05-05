package m1.finalee.tache2;

public abstract class Fruit {
    protected String origin;
    protected double value;
    protected double discount; // Nouveau champ pour le prix discount
    protected Ticket ticket; // Nouveau champ pour l'étiquette de prix

    public Fruit(String origin, double value) {
        this.origin = origin;
        this.value = value;
        this.discount = 0; // Par défaut, le prix discount est nul
        this.ticket = null; // Par défaut, il n'y a pas d'étiquette
    }

    public Fruit(String origin, double value, double discount) {
        this(origin, value);
        this.discount = discount;
    }

    public Fruit() {

    }

    // Renvoie la valeur du fruit, en tenant compte du prix discount s'il existe
    public double getValue() {
        if (this.ticket != null) { // S'il y a une étiquette, on utilise son prix
            return this.ticket.getPrice();
        } else if (this.discount > 0) { // Sinon, si le prix discount est > 0, on l'utilise
            return this.value - this.discount;
        } else { // Sinon, on utilise le prix normal
            return this.value;
        }
    }

    // Applique une étiquette de prix sur le fruit
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // Retire l'étiquette de prix du fruit
    public void removeTicket() {
        this.ticket = null;
    }

    public String getOrigin() {
        return this.origin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" [")
                .append(this.origin).append(" ").append(this.getValue());
        if (this.discount > 0) {
            sb.append(" (").append(this.discount).append(" discount)");
        }
        sb.append("]");
        return sb.toString();
    }

    // Méthode abstraite pour calculer la valeur d'un fruit
    public abstract double computePrice();

    public Ticket getTicket() {
        return null;
    }

    public double getPrice() {
        return 0;
    }
}
