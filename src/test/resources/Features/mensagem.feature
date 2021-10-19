#language: pt

Funcionalidade: feature para teste de funcionalidade de envio de mensagem

Contexto: estar logado com o usuário "matheusdepvieira"

  Cenário: Validar envio de mensagem
    Dado que usuário está na página home
    Quando o usuário aciona o botão de direct, no canto superior direito, entre os ícones home e explorer
    E aciona o botão de nova mensagem, ao lado da username do usuário
    E digita o usuário "matheusdepvieira" no campo Para:
    E seleciona o usuário matheusdepvieira
    E aciona o botão Avançar
    E digita a mensagem "Olá" no campo Mensagem...
    E aciona o botão Enviar
    Então a mensagem é enviada ao usuário
