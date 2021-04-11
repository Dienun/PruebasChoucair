#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Test
Feature: ConsultarVacantes
como aspirante de choucair 
quiero consultar las vacantes
para postularme a un cargo

  Scenario: AplicarVacante
    Given que Diego es un aspirante que busca una oferta
    When cuando la busqueda coincida con el keyword y location
    Then se muestra la vacantes disponibles


