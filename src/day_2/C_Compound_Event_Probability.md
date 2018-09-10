# Day 2: Compound Event Probability

**Objective**
In this challenge, we practice calculating the probability of a compound event. We recommend you review today's Probability Tutorial before attempting this challenge. 

**Task**
There are  urns labeled X, Y, and Z. 

Urn X contains 4 red balls and 3 black balls.
Urn Y contains 5 red balls and 4 black balls.
Urn Z contains 4 red balls and 4 black balls. 

One ball is drawn from each of the 3 urns. What is the probability that, of the 3 balls drawn, 2 are red and 1 is black?


**Solution**

A: 10 / 63
B: 2 / 7
C: 17 / 42
D: 31 / 126

Urn X has a 4/7 probability of giving a red ball
Urn Y has a 5/9 probability of giving a red ball
Urn Z has a 1/2 probability of giving a red ball
Urn X has a 3/7 probability of giving a black ball
Urn Y has a 4/9 probability of giving a black ball
Urn Z has a 1/2 probability of giving a black ball
P(2 red, 1 black) 
= P(Red Red Black) + P(Red Black Red) + P(Black Red Red)
= (4/7)(5/9)(1/2) + (4/7)(4/9)(1/2) + (3/7)(5/9)(1/2)
= 20/126 + 16/126 + 15/126 
= 51/126 
= 17/42