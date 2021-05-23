# language:pt
# encoding UTF-8

  Funcionalidade: Preencher formulario tricentis

    Cenário: Formulário tricentis
      Dado que o usuário acesse a página com o formulário
      E preencha o formulário Enter Vehicle Data e precione next
      E preencha o formulário Enter Insurant Data e precione next
      E preencha o formulário Enter Product Data e precione next
      E preencha o formulário Select Price Option e precione next
      E preencha o formulário Send Quote e precione send
      Então o sistema exibe Sending e-mail success! na tela


