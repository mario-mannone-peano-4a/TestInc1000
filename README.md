# TestInc1000


# Run 1
Risultato:0

Questo programma non funziona correttamente perchè senza i metodi join() il lavoro del main non viene messo in attesa e quindi il lavoro 
del thread finisce il suo lavoro.
Mentre con l'inserimento del metodo join(), il main viene messo in pausa e i thread possono eseguire il loro lavoro.

 


# Run 2
Risultato: 1994
Risultato 2: 1998
Risultato 3: 2000
Risultato 4: 2000
Risultato 5: 1999

Questo programma consente ai 2 threads di comunicare ed eseguire contemporaneamente le istruzioni del metodo run(), in questo modo però, può esistere un conflitto che consiste nel sovrascrivere il risultato e "rischiare" di ottenere un risultato sbagliato, 
ovviamente 
non è possibile prevedere l' ordine in cui le loro istruzioni verranno eseguite.





# Run 3
Risultato: 2000

Con l'aggiunta della parola chiave "Synchronized" i due threads eseguono il proprio lavoro in sincronizzazione tra loro, solo 
quando uno dei 2 threads finisce il suo lavoro, comincia l'altro.
Con questa parola chiave nel metodo run() si risolve il problema del conflitto descritto nella run 2.
