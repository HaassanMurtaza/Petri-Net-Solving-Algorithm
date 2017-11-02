# :raised_hands: Petri Net Solving Algorithm

Petri Solving Algorithm written in JAVA. It was neither project nor assignment. It was implementated out of interest which I developed in the area of petri nets. Currently, this algorithm is with out considering weights but it can be extended easily.

:fire: Setting Up Transitions:
```
Transitions[] t = new Transitions[]{
          new Transitions(2, 2),
          new Transitions(2,1)
}; 
```

Note: Where the params in constructors are input and output places.

:star: Now, its time to setup places for transitions
```
Places p1 = new Places(1);
Places p2 = new Places();
Places p3 = new Places(2);
Places p4 = new Places(1);
Places p5 = new Places();
```
Note: The param in Places constructor is their initial markings (tokens).

:boom: Finally, lets setup our input and output places for transitions
```
// Setting of transition 1
t[0].setInputPlaces(p1);
t[0].setInputPlaces(p3);
t[0].setOutputPlaces(p2);
t[0].setOutputPlaces(p4);

// Setting of transition 2
t[1].setInputPlaces(p3);
t[1].setInputPlaces(p4);
t[1].setOutputPlaces(p5);
```
:100: Working

Here is a sample output:

![Alt petri-net-output](petri-net-output.png?raw=true "Patri Net Ouput")


# License

Licensed Under GPL 2.0.
