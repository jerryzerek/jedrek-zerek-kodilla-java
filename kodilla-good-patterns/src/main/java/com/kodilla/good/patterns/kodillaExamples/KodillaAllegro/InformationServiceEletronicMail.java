package com.kodilla.good.patterns.kodillaExamples.KodillaAllegro;

public class InformationServiceEletronicMail implements InformationService {

    @Override
    public void sendInformationSuccessfullPayment (User user) {
        System.out.println("Informacja dla " + user.getName() + ": zapłacone!");
    }
    public void sendInformationUnsuccessfullPayment (User user) {
        System.out.println("Informacja dla " + user.getName() + ": nie zapłacone!");
    }
}
