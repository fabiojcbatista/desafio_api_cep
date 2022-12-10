# Desafio de API

![GitHub repo size](https://img.shields.io/github/repo-size/fabiojcbatista/desafio_api_cep?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/fabiojcbatista/desafio_api_cep?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/fabiojcbatista/desafio_api_cep?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/fabiojcbatista/desafio_api_cep?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/fabiojcbatista/desafio_api_cep?style=for-the-badge)

>>Passo-a-passo:
> - <img src="https://github.com/fabiojcbatista/desafio_api_cep/blob/main/src/main/resources/Utils/desafio.png" alt="Imagem do desafio" title="Imagem do desafio">

>>### Ajustes e melhorias
> >
> - [x] Organizar a estrutura de código.
> - [x] Criar Teste Base.
> - [x] Criar Tests Cases.
> - [X] Criar Validação com Shema validation.
> - [x] Criar Relatório de Testes com Allure.
> >

>>### Instalação
> >  Instalar Allure para gerar relatório.
> - <a href="https://robsonagapito.medium.com/instalando-o-allure-no-windows-10-6c8440cd00e9" alt="Instalar allure">Link para instalação do Allure</a>
> >- Liberar a instalação do Scoop para instalar allure
> ```
> Set-ExecutionPolicy RemoteSigned -scope CurrentUser
> ```
> >- Instalar Scoop.
> ```
> iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
> ```
> >- Instalar Allure.
> ```
> scoop install allure
> ```
> >- Verificar versão do Allure.
> ```
> scoop update allure
> ```
> >- Abrir o relatório do allure no servidor.
> ```
> allure serve
> ```

>>## 💻 Pré-requisitos
>
>Antes de começar, verifique se você atendeu aos seguintes requisitos:
>
> >Uma máquina `<Windows>`. compatível na versão 10.
>
> >Java compatível com a versão 1.8.
>
> >IDE de desenvolvimento `<VS Code/Eclipse/Intellij Idea>`

>>## 🚀 Instalando
>Para instalar as dependências, siga estas etapas:
>
> >Java 8 [Clique aqui para fazer o download do Java 8](https://javadl.oracle.com/webapps/download/AutoDL?BundleId=246471_2dee051a5d0647d5be72a7c0abff270e)
>
> >Eclipse [Clique aqui para fazer o download do Eclipse](https://www.eclipse.org/downloads/)
>
> >VS Code
> [Clique aqui para fazer o download do VS Code](https://code.visualstudio.com/download)
>
> >Intellij Idea
> [Clique aqui para fazer o download do Intellij](https://www.jetbrains.com/pt-br/idea/download/)

>>## ☕ Usando
>
>Para usar, siga estas etapas:
>
>Clone ou baixe o projeto para uma pasta local.
>
>```
>git clone https://github.com/fabiojcbatista/desafio_api_cep.git
>```
>
>Depois abra na sua IDE preferida: Vs Code/Eclipse/Intellij Idea
>Para testar:
>
>
> >1º Entrar no pacote de teste/ rodar os testes cases da classe ReadZipCodeTest.
>
> > >2° Para gerar os relatórios a partir do allure temos 2 opções:
> >Abrir o powerShell e inserir os comandos:
> >- 1º - Opção de comandos
> > > Gerar relatório.
> >```
> >allure generate .\allure-results\ -o .\allure-report\ --clean
> >```
> > > Remover diretório history do diretório allure-results.
> >```
> >Remove-Item .\allure-results\history\
> >```
> > > Mover o diretório history do diretório allure-report para o diretório allure-results.
> > ```
> > Move-Item .\allure-report\history\ .\allure-results\history\
> > ```
> > > Abrir o relatório no browser.
> >```
> >allure open .\allure-report\
> >```
> >- 2º - Opção via arquivo executável
> > > clicar duas vezes no arquivo "executeAllure.bat" do projeto no windows explorer.
> > Será aberto o arquivo executável do powershell "allurePowershell.ps1" e rodará os comandos do passo anterior.

>>## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">Fabio Junior C. Batista</td>
  </tr>
</table>