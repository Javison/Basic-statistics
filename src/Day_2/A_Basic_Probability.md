# Day 2: Basic Probability

**Objective**
In this challenge, we practice calculating probability. Check out the Tutorial tab for a breakdown of probability fundamentals!

Task
In a single toss of fair (evenly-weighted) six-sided dice, find the probability that their sum will be at most 9.
<p>2 / 3</p>
<p>5 / 6</p>
<p>1 / 4</p>
<p>1 / 6</p> 

**SOLUTION**
Events where sum is >9: Tossing 2 dices are independent events, so the combined possibility is the multiplication of the 2 possibilities

    Event A: (4, 6) --------> P(A) = 1/6 * 1/6 = 1/36
    Event B: (5, 5 | 6) ------> P(B) = 1/6 * 2/6 = 2/36
    Event C: (6, 4 | 5 | 6) --> P(C) = 1/6 * 3/6 = 3/36

Event A, B, C are mutually exclusive events, so the combined possibility of all A, B, C happenning is P(ABC) = P(A) + P(B) + P(C) = 1/6

Because the possiblity of having sum > 9 is 1/6, the possibility of having sum <=9 is the compliment of that, P(^ABC) = 1 - P(ABC) = 5/6


**Event, Sample Space, and Probability**

In probability theory, an experiment is any procedure that can be infinitely repeated and has a well-defined set of possible outcomes, known as the sample space, . We define an event to be a set of outcomes of an experiment (also known as a subset of ) to which a probability (numerical value) is assigned.

The probability of the occurrence of an event, , is:

Here are the first two fundamental rules of probability:

    Any probability, , is a number between and (i.e., ).
    The probability of the sample space, , is (i.e., ).

So how do we bridge the gap between the value of and the sample space? Quite simply, since we know that is the probability that event will occur, then we define (also written as ) to be the probability that event will not occur (the complement of ). If our sample space is composed of the probabilities of 's occurrence and non-occurrence, we can then say , or the sum of all possible outcomes of in the sample space is equal to . This is the third fundamental rule of probability: .

**Question 1**
Find the probability of getting an odd number when rolling a -sided fair die.

Given the above question, we can extract the following:

    Experiment: rolling a -sided die.
    Sample space (): .
    Event (): that the number rolled is odd (i.e., ).

If we refer back to the basic formula for the probability of the occurrence of an event, we can say:


Compound Events, Mutually Exclusive Events, and Collectively Exhaustive Events

Let's consider events: and . A compound event is a combination of or more simple events. If and are simple events, then denotes the occurrence of either or . Similarly, denotes the occurrence of and together.

and are said to be mutually exclusive or disjoint if they have no events in common (i.e., and ). The probability of any of or more events occurring is the union () of events. Because disjoint probabilities have no common events, the probability of the union of disjoint events is the sum of the events' individual probabilities. and are said to be collectively exhaustive if their union covers all events in the sample space (i.e., and ). This brings us to our next fundamental rule of probability: if events, and , are disjoint, then the probability of either event is the sum of the probabilities of the events (i.e., ).

If the outcome of the first event () has no impact on the second event (), then they are considered to be independent (e.g., tossing a fair coin). This brings us to the next fundamental rule of probability: the multiplication rule. It states that if two events, and , are independent, then the probability of both events is the product of the probabilities for each event (i.e., ). The chance of all events occurring in a sequence of events is called the intersection () of those events.

**Question 2**
Find the probability of getting head and tail when fair coins are tossed.

Given the above question, we can extract the following:

    Experiment: tossing coins.
    Sample space (): The possible outcomes for the toss of coin are , where and . As our experiment tosses coins, we have to consider all possible toss outcomes by finding the Cartesian Product of the possible outcomes for each coin: .
    Event (): that the outcome of toss will be , and the outcome of the other toss will be (i.e., .

Connecting this information back to our basic formula for , we can say:



**Question 3**
Let and be two events such that and . If the probability of the occurrence of either or is , find the probability of the occurrence of both and together (i.e., ).

We can use our fundamental rules of probability to solve this problem:


**ESP**

Compound event: Evento compuesto
Mutually Exclusive Event: 



