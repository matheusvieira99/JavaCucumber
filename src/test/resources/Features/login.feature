#language: pt


Funcionalidade: feature para teste de funcionalidade login

  Cenário: Validar login com credenciais válidas
    Dado que usuário está na página de login
    Quando usuário insere username e senha
    E clica no botão de login
    Então usuário é direcionado para tela home
    
