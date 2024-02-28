### Examen semanal 3: Repaso de Tiempo de ejecución y complejidad ###

1. ¿Qué es el tiempo de ejecución de un progrma?
2. De acuerdo a la definición de cota superior asintótica justifica por qué la función $f(n) = 3n^2 + ln(n)$ pertenece a $O(n^2)$.
3. Dadas las funciones $g,h: R \rightarrow R$, demuestra que si $f_1 \in O(g)$ y $f_2 \in O(h)$ entonces $f_1 + f_2 \in O(máx(g,h))$ 
4. Da un ejemplo de cada tipo de operación elemental.
5. Encuentra la función de recurrencia del siguiente proceso y encuentra la _O_ a la que pertenece.
```java
int recursion(int n, int x) {
    if  (n < 1)
        return 1;
    for (int i = 0; i < n/2; i++) {
        x += --x;
    }
    return recursion(n/2, x);
}
```
