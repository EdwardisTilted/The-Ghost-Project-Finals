
import java.net.http.*;


public final class CurrencyRateService
{
    HttpClient client;
    HttpRequest request;
    HttpResponse<String> response;
    String[] currencies = {"USD", "EUR", "AUD", "SGD", "MYR", "INR", "CAD", "CHF", "JPY", "PHP"};
    Double[] rates = {60.50659, 1.0, 1.62045, 1.45925, 4.6425, 88.5025, 1.34415, 0.91365, 162.410, 56.573};
    String base, to;
    double amount;  

    public String[] getCurrency(){
        return currencies;
    }

    public Double[] getRates(){
        return rates;
    }

}
/*
    public double convert(String from, String to, double amount)
    {
        setBase(from);
        setTo(to);
        setAmount(amount);
        return rates();
    }
    private double rates()
    {
        return 0.0;
    }
    public String fetchData()
    {
         client = HttpClient.newHttpClient();
         request = HttpRequest.newBuilder()
                 .uri(URI.create(getURL(getBase(), getTo())))
                 .build();
         try
        {
             response = client.send(request, HttpResponse.BodyHandlers.ofString());
             System.out.println(response.body());
         }
         catch (IOException | InterruptedException e)
         {
             System.err.println("Error " + e.getMessage());
         }
        
         return response.body();
    }
    private String getURL(String base, String to)
    {
        return "https://api.frankfurter.dev/v1/latest?base=" + base + "&symbols=" + to;
    }
    private void setBase(String base)
    {
        this.base = base;
    }
    public void setTo(String to)
    {
        this.to = to;
    }
    public String getBase()
    {
        return base;
    }
    public String getTo()
    {
        return to;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
*/
