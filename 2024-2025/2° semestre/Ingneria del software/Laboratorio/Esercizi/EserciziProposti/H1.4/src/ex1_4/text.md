### Esercizio 4

Data una lista di numeri interi, verificare se ciascuna terna formata prendendo dalla lista tre numeri contigui costituisce un triangolo.

**Esempio:**

Lista: `{2, 3, 5, 7, 8}`  
Le terne contigue sono:
- `{2, 3, 5}`
- `{3, 5, 7}`
- `{5, 7, 8}`

Verifica se ciascuna di queste terne rappresenta un triangolo, dove la condizione di un triangolo è che ciascun lato deve essere minore della somma degli altri due.

**Esempio di output:**

Le terne che rappresentano triangoli sono:
- `{3, 5, 7}`
- `{5, 7, 8}`

**Suggerimenti:**

- In un triangolo, ciascun lato deve essere minore della somma degli altri due.
- Si generano gli indici da `0` a `n-2` per ottenere terne di tre elementi contigui.
- Per ciascun indice `i`, si prende l'elemento `i` e i due successivi, così da formare una terna.
