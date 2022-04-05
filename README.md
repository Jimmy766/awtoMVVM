# AWTO CHALLENGE

MVVM Challenge using Flow, Hilt and Retrofit2

# Architecture

**Data:** contains the implementation of the abstract definitions of the domain layer. Can be reused by any application without modifications. It can contains repositories and data sources implementations, the database definition and its DAOs, the network APIs definitions, some mappers to convert network API models to database models and vice versa.

**App (or presentation layer):** it’s android specific and can contains fragments, view models, adapters, activities and so on.

**Domain:** contains the definitions of the business logic of the app, the server data model, the abstract definition of repositories, and the definition of the use cases. It’s a simple, pure kotlin module (android independent)

**Core:** contains common used functions all over the app such as DI modules, constants, etc.


# How it Works?

At the bottom shows the joke's categories (if exists).

At the center shows the joke (single/two part).

**You must touch the screen to get the next joke!**


# ScreenShots

![This is an image](https://i.postimg.cc/VsC7YdXg/Screenshot-2022-04-05-00-11-53-89-952417890375f90ac8541a0a8b1def2f.jpg) ![This is an image](https://i.postimg.cc/Hs16jd2g/Screenshot-2022-04-05-00-12-01-86-952417890375f90ac8541a0a8b1def2f.jpg)

![This is an image](https://i.postimg.cc/Hs0ByRZ7/Screenshot-2022-04-05-00-12-05-81-952417890375f90ac8541a0a8b1def2f.jpg) ![This is an image](https://i.postimg.cc/fRw5jCpq/Screenshot-2022-04-05-00-12-11-51-952417890375f90ac8541a0a8b1def2f.jpg)


