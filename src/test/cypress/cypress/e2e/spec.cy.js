describe('Pages', () => {
  it('Accueil', () => {
    cy.visit('http://localhost:8080')
    cy.contains('HOME')
  })
  it("page 1", () => {
    cy.visit('http://localhost:8080/page1')
    cy.contains('PAGE 1')
  })
})
describe('Navigation', () => {
  it("Accueil -> page 1", () => {
    cy.visit('http://localhost:8080')
    cy.get('[href="/page1"]').click()
    cy.contains('PAGE 1')
    })
  })

