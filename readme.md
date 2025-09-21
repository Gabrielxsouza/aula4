## Nome: Gabriel de Souza Costa
## GU3046583

---

### Exercicio 3:

1. Qual a principal diferença entre REST e SOAP?

    SOAP encapsula as mensagens XML dentro das requisições HTTP. Normalmente utilizam apenas um único endpoint e todas as operações são diferenciadas pelo conteúdo do corpo da requisição. Portanto, o HTTP é tratado apenas como um canal de transporte sem o uso de métodos GET, POST, PUT e etc.
    Uma API REST segue os padrões já estabelecidos na web para criar sistemas escaláveis e eficientes, permitindo que os dados sejam manipulados através de recursos , representados por URLs e acessados usando os métodos HTTP padrão.

2. Em quais cenários SOAP ainda é utilizado?

    Geralmente em bancos, setores financeiros, governos e sistemas mais antigos.

3. Quais são as vantagens e desvantagens de usar REST ao invés de SOAP?

    O REST é mais flexível, baseado em HTTP, leve e mais rápido. Porém, o SOAP é mais padronizado e seguro.

4. O que é WS-Security e como ele se compara à segurança em APIs REST?

    WS-Security ou Web Services Security é um padrão da OASIS voltado para segurança em serviços SOAP. Ele é mais seguro, porém, é pesada e complexa.

5. Explique o modelo de maturidade de Richardson.

    O Modelo de Maturidade de Richardson propõe uma forma de avaliar o nível de conformidade de uma API com os princípios REST, ajudando a medir quão bem uma API segue a filosofia RESTful descrita por Roy Fielding em sua tese de doutorado em 2000.
    Isso ocorreu, pois muitas APIs que chamavam de REST, nao seguiam realmente esses padrões. O modelo de Richardson classifica APIs em quatro níveis de maturidade, destacando aspectos como a organização de recursos, o uso correto dos métodos HTTP e a adoção de hipermídia
    Nivel 0 a API não utiliza os conceitos REST. Em vez disso, ela usa HTTP apenas como meio de transporte para mensagens genéricas, muitas vezes enviando e recebendo dados em formatos como XML ou JSON, sem aproveitar a estrutura do protocolo HTTP.
    No Nível 1, a API começa a organizar seus dados em recursos individuais e cada recurso recebe uma URL única. No entanto, os métodos HTTP ainda não são utilizados corretamente, e a API continua tratando HTTP apenas como um meio de transporte.
    Nivel 2 a API começa a usar corretamente os métodos HTTP, as operações são realizadas de maneira semântica
    E por fim, no nível 3,  O nível mais avançado da maturidade REST adiciona um conceito chamado HATEOAS. Isso significa que a API não apenas expõe recursos, mas também fornece informações sobre como interagir com esses recursos dinamicamente.

6. O que é GraphQL? Pesquisa e relacione com os conceitos vistos em aula.

    GraphQL é uma linguagem de consulta para APIs que dá ao cliente controle sobre os dados que recebe, evitando excesso ou falta de informações, sendo uma alternativa moderna ao REST.

