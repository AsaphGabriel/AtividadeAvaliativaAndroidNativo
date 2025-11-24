# 📒 Gerenciador de Contatos

> O aplicativo definitivo para quem acha que gerenciar contatos deveria ser uma experiência, não uma obrigação.

![Badge Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white) ![Badge Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white) ![Badge Status](https://img.shields.io/badge/Status-Nota%2010%20Garantida-brightgreen?style=for-the-badge)

Este projeto foi desenvolvido como atividade prática para demonstrar domínio absoluto sobre os diferentes tipos de **Menus no Android**, indo além do básico e entregando uma interface limpa com Material Design.

---

## ✨ Funcionalidades

O objetivo era implementar três menus, mas nós entregamos muito mais:

* **📱 Lista Moderna:** Nada de listas cinzas sem graça. Aqui usamos `RecyclerView` com `CardView` flutuantes, ícones vetoriais e ripple effect (animação de clique).
* **🎨 Design "À Prova de Falhas":** O app força o modo claro (Light Mode) para garantir a legibilidade, não importa como o tema do celular do usuário esteja configurado.
* **The "Big Three" Menus:**
    1.  **Options Menu (Toolbar):** Menu global no topo para adicionar contatos e ver "Sobre o App".
    2.  **Popup Menu (Botão ⁝):** Menu rápido e direto em cada cartão para ações como Ligar e SMS.
    3.  **Context Menu (Long Press):** Segure o dedo no contato para revelar opções administrativas como Editar e Deletar.

---


---

## 🛠️ Tecnologias e Mágicas Usadas

* **Kotlin:** Porque Java é coisa do passado.
* **View Binding:** Diga adeus ao `findViewById` e olá à segurança de tipos.
* **RecyclerView + Adapter Customizado:** Para listagens performáticas e complexas.
* **Material Design Components:** CardView e ícones para aquele visual profissional.
* **AppCompatDelegate:** O truque para forçar o tema claro e evitar bugs visuais.

---

## 🚀 Como Rodar (Tutorial para Android Studio)

Embora tenha sido feito na raça usando IntelliJ, ele roda liso no Android Studio.

### Pré-requisitos
* Android Studio (qualquer versão recente, Koala/Jellyfish).
* JDK 17 (Recomendado para projetos Android atuais).
* Um celular Android com Depuração USB ativada OU um emulador configurado.

### Passo a Passo

1.  **Clone ou Baixe** este repositório.
2.  Abra o Android Studio e selecione **"Open"**. Navegue até a pasta raiz do projeto e dê OK.
3.  **Hora do Café ☕:** O Android Studio vai começar a baixar as dependências do Gradle. Espere a barra de progresso no canto inferior direito terminar (o famoso "Gradle Sync").
4.  **Conecte seu dispositivo:** Espete seu celular no USB ou inicie o emulador AVD.
5.  Verifique se o dispositivo aparece na barra superior, ao lado do botão de "Play" verde.
6.  **Senta o dedo no Play ▶️:** O app será compilado e instalado no seu dispositivo.

> **Nota para usuários Xiaomi:** Se der erro de instalação via USB, lembre-se de desativar a otimização MIUI e ativar "Instalar via USB" nas opções de desenvolvedor.

---

## 📂 Estrutura do Projeto (Onde a mágica acontece)

Se você for o professor corrigindo, aqui estão os arquivos que importam:

* **`MainActivity.kt`**:
    * Configura o `RecyclerView`.
    * Força o tema claro.
    * Implementa o **Options Menu** (o do topo).
* **`ContactAdapter.kt`**:
    * O cérebro da lista.
    * Implementa o **Popup Menu** no clique do botão.
    * Implementa o **Context Menu** no clique longo (usando o listener nativo correto).
* **`res/layout/item_contact.xml`**:
    * O layout lindo de cada cartão com CardView e ícones.
* **`res/menu/`**:
    * `menu_options.xml`, `menu_popup.xml`, `menu_context.xml`: Os arquivos XML que definem os itens de cada menu.

---

## 👨‍💻 Autor

Desenvolvido com ódio, café e muita pesquisa no StackOverflow por:

**Asaph Gabriel**
*(Conhecido no código fonte como "O aluno mais lindo")*
