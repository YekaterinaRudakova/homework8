package com.it_academy.onliner_api_tester;


import com.it_academy.onliner.model.Sauce;
import com.it_academy.onliner.service.SauceService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SauceTest {

    @Test
    public void testCheckNamePrefixInSauce() {
        SauceService sauceService = new SauceService();
        List<Sauce> sauces = sauceService.getSauces();
        System.out.println(sauces);
        List<String> name_prefixes = new ArrayList<>();
        sauces.stream().map(Sauce::getName_prefix).forEach(name_prefixes::add);
        System.out.println(name_prefixes);
        assertThat(name_prefixes)
                .as("Name_prefix does not contain filter \"coyc\"")
                .containsOnly("Соус", "Соус", "Соус", "Соус");
    }
}
