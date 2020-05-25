WeCanCodeIt Graded Assignment #2

Wally's Virtual Pet Shelter n' Company!

-This application has 3 classes: VirtualPetShelterApp, VirtualPetShelter, and VirtualPet

-My VirtualPetShelterApp class contains a few things, which I will mention below:
1) I instantiated a new VirtualPetShelter object and have called it "wallysShelter" (Line 8). This
object now has access to everything in the VirtualPetShelter class.
2) I have instantiated two new VirtualPet objects and have called them "goldy" and "aspen" (Lines 9-10).
These two objects now have access to everything in the VirtualPet class. Instantiating both of
these objects were necessary so I could add both objects to my virtualShelter Map.
3) Calling my .admitHomelessPet() method (Lines 11-12), I was able to add both VirtualPet objects "goldy" and "aspen"
to my virtualShelter Map.
4) I declared and initialized a boolean variable called "isShelterOpen" and set it equal to true.
The value of this boolean variable, used in my while loop, is the entry point into the application.
5) Through a series of if/elseif conditional statements, this is where all the logic of my application comes
into play. I also incorporated "nested" if/elseif conditional statements for areas that needed it (Lines
35-44 and 50-59).
6) Finally, the user has a 6th option which allows them to exit the application whenever they feel the need to.

-My VirtualPetShelter class contains a few things, which I will mention below:
1) I instantiated a new Map called "virtualShelter". Its key is a String, which is for the virtual pets name
and a value, which is for the attributes of the specific object of the VirtualPet class. This Map will hold
all virtual pets in the virtual pet shelter.
2) This class also contains all necessary methods that will be called upon throughout the main application.

-My VirtualPet class contains a few things, which I will mention below:
1) Each virtual pet I instantiated in the beginning (as well as each virtual pet the user admits via the admitHomelessPet method)
has access to instance variables and methods found in this class
2) In my VirtualPet constructor, I imported the java.util.Random class so I could set random default values for each virtual pet's
hunger, thirst, and boredom ratings.
3) My VirtualPet constructor requires two arguments (Name and Description), but all other instance variables inside of the 
constructor are default values which are set to random numbers.


