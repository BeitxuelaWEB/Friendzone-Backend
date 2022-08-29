# FriendCity by Beta Team (Pedagogical Project) :hotel: 

#### Project Idea  :bulb:
~
An app to manage and plan different types of **events** between groups of **friends** (birthdays, meetings, get-togethers, etc...), 
in which you can invite friends and specify the date, time, place and all the necessary information to plan the event.
~

#### Idea de Proyecto  :bulb:
~
Una app para gestionar y planificar diferentes tipos de **eventos** entre grupos de **amigos** (cumpleaños, reuniones, quedadas, etc…), 
en la cual puedes invitar a amigos y concretar la fecha, hora, sitio y toda la información necesaria para planificar el evento.
~

## Requeriments :bookmark_tabs:

- IntelliJ IDEA.
- MySQL.
- Visual Studio Code.
- Browser.

# Functionalities :floppy_disk:

## Minimum Viable Product (MVP): :heavy_minus_sign:
- Sign up / Registrarse.
- Log in / Loguearse.
- Log out / Cerrar Sesión.
- CRUD Events:
    - Add or Create Events / Añadir o Crear Eventos.
    - See or Read Events in a Calendar / Ver o Leer Eventos en un Calendario.
    - Modify or Edit Events (All group members will be able to edit) / Modificar o Editar Eventos (Todos los miembros del grupo podrán editar).
    - Delete Events (Solo el creador del evento podrá eliminar) / Eliminar Eventos (Only the creator of the event can delete).
- Recibir invitaciones de los eventos por email / Receive event invitations by email.

# :round_pushpin: Future Extras: :heavy_plus_sign:

- Make groups of friends / Hacer Grupos de amigos.
- Password recovery button / Botón de recuperar la contraseña.
- Add Payment Platform / Añadir Plataforma de pago.

# 💻 Technologies

- Git / Github - Git version control system.
- Java - Programming Language.
- JavaScript - Programming Language.
- Spring Boot - Java programming language framework.
- Spring Data JPA - Simplify data persistence for the developer against different information repositories. 
- JWT (JSON Web Token) - Security Token.
- Spring Security -  Java / Java EE framework that provides authentication, authorization and other security features for applications.
- MySQL - Relational database management system. 
- TypeScript - Programming Language.

# Tools :hammer:

- Trello  - Project Organization. Agile Methodology. User stories.
- Balsamiq - Wireframe.
- Github - Git version control system.
- Figma - Design.
- Canva - Simplified Graphic Design.
- XAMPP - MySQL database management system and Apache web server.
- Postman - Tool that allows HTTP requests to be made to any API.
- PhpMyAdmin - MySQL Administration through web pages, using a web browser.
- Visual Studio Code - Code Editor.
- IntelliJ IDEA - IDE (**I**ntegrated **D**evelopment **E**nvironment)


# See all the events in the list :balloon:
Request 
> GET localhost:8080/api/allevents

```
[
    {
    "id": 7,
        "name": "Mariscada entre amigos",
        "event_date": "2022-09-04",
        "hour": "21:00:00",
        "location": "Restaurante Galego",
        "budget": 35.0,
        "description": "Mariscada galega y Cerveza Estrella Galizia. Pecador diodenoo condemor hasta luego Lucas ahorarr pupita no te digo trigo por no llamarte Rodrigor. Diodenoo fistro de la pradera ese hombree me cago en tus muelas papaar papaar a peich caballo blanco caballo",
        "image": "https://images.unsplash.com/photo-1606850780554-b55ea4dd0b70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
        "members": [],
        "owner": {
            "id": 2,
            "username": "Otro",
            "name": "OtroUsuario",
            "password": "$2a$10$cqi7SURR5E.4ebH.sd/Uyuj.TXtNv.HBsZSlve5L8MuWEiT7w9Iji",
            "email": "otrapersona@gmail.com",
            "roles": [
                {
                    "id": 1,
                    "name": "ROLE_USER"
                }
            ]
        }
    },
    {
        "id": 8,
        "name": "Aprender a hacer sushi rico",
        "event_date": "2022-10-08",
        "hour": "14:00:00",
        "location": "Spain",
        "budget": 10.0,
        "description": "Clases de cocina, aprenderemos a hacer sushi.  Torpedo diodenoo benemeritaar me cago en tus muelas va usté muy cargadoo no te digo trigo por no llamarte Rodrigor caballo blanco caballo negroorl de la pradera",
        "image": "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
        "members": [],
        "owner": {
            "id": 2,
            "username": "Otro",
            "name": "OtroUsuario",
            "password": "$2a$10$cqi7SURR5E.4ebH.sd/Uyuj.TXtNv.HBsZSlve5L8MuWEiT7w9Iji",
            "email": "otrapersona@gmail.com",
            "roles": [
                {
                    "id": 1,
                    "name": "ROLE_USER"
                }
            ]
        }
    },
    {
        "id": 9,
        "name": "En el río con amigos",
        "event_date": "2022-09-03",
        "hour": "10:00:00",
        "location": "Madrid, Spain",
        "budget": 5.0,
        "description": "Lorem fistrum llevame al sircoo diodenoo adipisicing cillum te voy a borrar el cerito qui está la cosa muy malar eiusmod. A wan ahorarr cillum ut velit tempor papaar papaar. Apetecan aliqua dolor esse.",
        "image": "https://images.unsplash.com/photo-1528732262645-b06fa3a79c9e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80",
        "members": [],
        "owner": {
            "id": 2,
            "username": "Otro",
            "name": "OtroUsuario",
            "password": "$2a$10$cqi7SURR5E.4ebH.sd/Uyuj.TXtNv.HBsZSlve5L8MuWEiT7w9Iji",
            "email": "otrapersona@gmail.com",
            "roles": [
                {
                    "id": 1,
                    "name": "ROLE_USER"
                }
            ]
        }
    },
    {
        "id": 10,
        "name": "Paseo por el bosque para buscar setas",
        "event_date": "2022-09-11",
        "hour": "10:00:00",
        "location": "28410 Manzanares el Real, Madrid, Spain",
        "budget": 5.0,
        "description": "Elit quis me cago en tus muelas ese que llega. Al ataquerl qui está la cosa muy malar a wan ullamco la caidita. Ex de la pradera ex voluptate aute pecador a wan. Te va a hasé pupitaa de la pradera ",
        "image": "https://images.unsplash.com/photo-1505820013142-f86a3439c5b2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1171&q=80",
        "members": [],
        "owner": {
            "id": 2,
            "username": "Otro",
            "name": "OtroUsuario",
            "password": "$2a$10$cqi7SURR5E.4ebH.sd/Uyuj.TXtNv.HBsZSlve5L8MuWEiT7w9Iji",
            "email": "otrapersona@gmail.com",
            "roles": [
                {
                    "id": 1,
                    "name": "ROLE_USER"
                }
            ]
        }
    }
]
# Authors ✒️

- Miguel Ángel Íñiguez Pérez - https://github.com/maip202
- Bea Robledillo Gómez - https://github.com/BeitxuelaWEB
- Pablo Ruíz Cascón - https://github.com/pruizcas
- Jesús Otero Devesa - https://github.com/jesusod
- Ana María Adalid Meri - https://github.com/Anitameri
- Carlos Laurie Díaz - https://github.com/CarlitosHunter

# Friendzone-Backend

# Greetings :gift:
- Comment your friends and colleagues about this project. :loudspeaker:
- Thank the team. :slightly_smiling_face:
- Invite the team for a beer. :beer: or a coffee ☕ .
