package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
  @Test
  public void shouldUseEquals() {
    //Different Object, cuz we write NEW!!!
    //Here we have en Exception (Error) Without @Overriding
    //This equals links (here have different links)
    //To order fix that we must @Override methods
    Product first = new Product(1, "Java I", 1000);
    Product second = new Product(1, "Java I", 1000);
    assertEquals(first, second);
  }
}