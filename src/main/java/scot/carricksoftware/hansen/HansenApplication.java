package scot.carricksoftware.hansen;


import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;


@SuppressWarnings({"checkstyle:finalClass", "SpellCheckingInspection", "WeakerAccess"})
@ComponentScan("scot.carricksoftware.hansen")
public class HansenApplication {

    private HansenApplication() {
    }

    public static void main(final String[] args) {
        SpringApplication.run(HansenApplication.class, args);
    }


}
