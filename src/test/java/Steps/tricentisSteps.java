package Steps;


import Pages.tricentisPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;

public class tricentisSteps {

    WebDriver driver = null;
    tricentisPage page;

    @Dado("que o usuário acesse a página com o formulário")
    public void que_o_usuário_acesse_a_página_com_o_formulário() {
        page = new tricentisPage();
        page.accessHomePage(" http://sampleapp.tricentis.com/101/app.php");
    }

    @E("preencha o formulário Enter Vehicle Data e precione next")
    public void preencha_o_formulário_enter_vehicle_data_e_precione_next() {
        page.devePreecherFormularioEnterVehicleData();
    }

    @E("preencha o formulário Enter Insurant Data e precione next")
    public void preencha_o_formulário_enter_insurant_data_e_precione_next() {
        page.devePreencherFormularioEnterInsurantData();
    }

    @E("preencha o formulário Enter Product Data Data Data e precione next")
    public void preencha_o_formulário_enter_product_data_data_data_e_precione_next() {
        page.devePreencherFormularioEnterProductData();
    }

    @E("preencha o formulário Select Price Option e precione next")
    public void preencha_o_formulário_select_price_option_e_precione_next() {
        page.devePreencherFormulárioSelectPriceOption();
    }

    @E("preencha o formulário Send Quote e precione send")
    public void preencha_o_formulário_send_quote_e_precione_send() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Então("o sistema exibe Sending e-mail success! na tela")
    public void o_sistema_exibe_sending_e_mail_success_na_tela() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void fecharNavegador() {
        page.browserClose();
    }

}
