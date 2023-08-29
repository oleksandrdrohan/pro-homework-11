package ua.kiev.prog.json;

import lombok.Data;

@Data
public class Rate {
    private String date;
    private SingleRate rates;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SingleRate getRates() {
        return rates;
    }

    public void setRates(SingleRate rates) {
        this.rates = rates;
    }
}
