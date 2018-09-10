# Day 0: Mean, Median, and Mode

**Objective**

In this challenge, we practice calculating the mean, median, and mode. Check out the Tutorial tab for learning materials and an instructional video!

**Task**

Given an array, , of integers, calculate and print the respective mean, median, and mode on separate lines. If your array contains more than one modal value, choose the numerically smallest one.

Note: Other than the modal value (which will always be an integer), your answers should be in decimal form, rounded to a scale of decimal place (i.e., , format).

**Input Format**

The first line contains an integer, , denoting the number of elements in the array.
The second line contains space-separated integers describing the array's elements.

**Constraints**

    , where is the element of the array.

**Output Format**

**Print lines of output in the following order:**

    Print the mean on a new line, to a scale of decimal place (i.e., , ).
    Print the median on a new line, to a scale of decimal place (i.e., , ).
    Print the mode on a new line; if more than one such value exists, print the numerically smallest one.

**Sample Input**

10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060

**Sample Output**

43900.6
44627.5
4978


**ESP**

Mean: 
Media aritmetica. Suma todos los valores y divide entre total datos.

Median:  
Mediana. Valor central de un conjunto de datos cuando se ordenan. Llamado Me.
Si el numero de datos es impar tomamos el dato central. En caso contrario una media de los 2 centrales.

Mode: 
Moda. El dato que más se repite de una muestra (Mayor frecuencia absoluta). Llamado Mo
Si hay 2 hay 2 modas. Si no se repite no hay moda.

https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Visualisation_mode_median_mean.svg/langes-220px-Visualisation_mode_median_mean.svg.png