#language: pt
#encoding: utf-8
Funcionalidade: Transcreva os cenários abaixo em gherkin e após isso realize a automação destes com Selenium

  @Cenario01
  Cenario: 1 – Validar especificações do produto
    Dado que acesso o sistema no ambiente de "advantageonlineshopping" com o browser "chrome"
    E no menu, clicar na opção “Special Offer”
    Quando clico no botão “See offer”
    Entao valido que as especificações do produto de acordo com as informações retornadas do banco de automação

  @Cenario02
  Cenario: 2 – Validar alteração de cor do produto no carrinho
    Dado que acesso o sistema no ambiente de "advantageonlineshopping" com o browser "chrome"
    E no menu, clicar na opção “Special Offer”
    E clico no botão “See offer”
    E altero a cor do produto de acordo com a cor informada no banco de automação
    Quando clico no botão “Add to cart”
    Entao valido que produto foi adicionado ao carrinho com a cor selecionada

  @Cenario03
  Cenário: 3 – Validar página de checkout
    Dado que acesso o sistema no ambiente de "advantageonlineshopping" com o browser "chrome"
    E pesquiso o produto clicando no ícone de lupa Seguir o nome do produto do banco de automação
    E seleciono o produto pesquisado
    E altero a cor do produto para uma diferente da existente no banco de automação
    E altero a quantidade de produtos que deseja comprar
    E clico no botão “Add to cart”
    E acesso a página de checkout
    Quando valido que a soma dos preços corresponde ao total apresentado na página de checkout
    Entao realizo um update no banco de automação alterar a cor existente no banco para a cor selecionada no teste.

  @Cenario04
  Cenário: 4 – Remover produto do carrinho de compras
    Dado que acesso o sistema no ambiente de "advantageonlineshopping" com o browser "chrome"
    E no menu, clicar na opção “Special Offer”
    E clico no botão “See offer”
    E clico no botão “Add to cart”
    E clico no carrinho de compras
    Quando removo produto do carrinho de compras
    Entao valido que o carrinho de compras está vazio