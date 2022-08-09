package org.project.customer.service;

public record CustomerRegistrationRequest(  String firstName,
                                            String lastName,
                                            String email,
                                            String phone,
                                            String address,
                                            String city,
                                            String state,
                                            String zip) {

}
