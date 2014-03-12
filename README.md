Play! com MongoDB - Filmes cult
=====================================

- setup do Play:

 Execute do diretório do projeto:

```
play run
```

- setup do MongoDB:


Execute do diretório do projeto:

```
 mongo < mongodb/mondodb-comandos.txt
```

Resultado esperado:

```
MongoDB shell version: 2.4.9
connecting to: test
switched to db boaglio
true
98
bye
```

Um teste para exibir um registro:

```
> db.filmes.findOne();
{
        "_id" : ObjectId("531f9d490612421e5c4847d3"),
        "nome" : "Psicose",
        "tipo" : "Feature Film",
        "ano" : 1960,
        "nota" : 8.6,
        "duracao" : 109,
        "url" : "http://www.imdb.com/title/tt0054215/",
        "diretor" : "Alfred Hitchcock"
}
```
